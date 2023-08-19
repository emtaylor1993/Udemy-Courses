"""
This script will scrape the price of an item on Amazon and will send an
email to the user if the price of the item dips below the threshold price.

Author:        E. Taylor
Date Created:  August 18, 2023
Date Modified: August 18, 2023
Dependencies:  bs4, requests, smtplib
"""

import requests
import smtplib
from bs4 import BeautifulSoup

URL = "https://www.amazon.com/dp/B075CYMYK6?ref_=cm_sw_r_cp_ud_ct_FM9M699VKHTT47YD50Q6&th=1"
USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36"
ACCEPT_LANGUAGE = "en-US,en;q=0.9"
TARGET_PRICE = 100
MY_EMAIL = "python.bootcamp.training@gmail.com"
MY_PASSWORD = "kogknifhgykgrggo"

headers = {
    "User-Agent": USER_AGENT,
    "Accept-Language": ACCEPT_LANGUAGE
}

# Getting the HTML of the Amazon Website.
response = requests.get(URL, headers=headers)
response.raise_for_status()
content = response.text

# Using the lxml parser to get the price of the item.
soup = BeautifulSoup(content, "lxml")
price_whole = soup.find(name="span", class_="a-price-whole").getText()
price_decimal = soup.find(name="span", class_="a-price-fraction").getText()
price = price_whole + str(price_decimal)

# If the price of the item is below the threshold value, alert the user via email.
if float(price) < TARGET_PRICE:
    contents = soup.find(name="span", class_="a-size-large product-title-word-break").getText().strip()
    contents = contents.encode("ascii", "ignore").decode("ascii")
    with smtplib.SMTP("smtp.gmail.com", port=587) as connection:
        connection.starttls()
        connection.login(user=MY_EMAIL, password=MY_PASSWORD)
        connection.sendmail(
            from_addr=MY_EMAIL,
            to_addrs=MY_EMAIL,
            msg=f"Subject:Amazon Price Alert!\n\n{contents} is now ${price}\n{URL}"
        )