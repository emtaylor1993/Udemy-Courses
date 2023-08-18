"""
This script contains code to send an automated birthday wish to the users
in the birthdays CSV file on the actual date of their birthday.

Author:        E. Taylor
Date Created:  July 29, 2023
Date Modified: August 18, 2023
Dependencies:  datetime, pandas, random, smtplib
"""

from datetime import datetime
import pandas
import random
import smtplib

MY_EMAIL = "python.class.testing@gmail.com"
MY_PASSWORD = "rcwqwajctcbcqiuh"

today = datetime.now()
today_tuple = (today.month, today.day)

data = pandas.read_csv("birthdays.csv")
birthdays_dict = {(data_row["month"], data_row["day"]): data_row for (index, data_row) in data.iterrows()}
if today_tuple in birthdays_dict:
    birthday_person = birthdays_dict[today_tuple]
    file_path = f"letter_templates/letter_{random.randint(1,3)}.txt"
    with open(file_path) as letter_file:
        contents = letter_file.read()
        contents = contents.replace("[NAME]", birthday_person["name"])

    with smtplib.SMTP("smtp.gmail.com", port=587) as connection:
        connection.starttls()
        connection.login(user=MY_EMAIL, password=MY_PASSWORD)
        connection.sendmail(
            from_addr=MY_EMAIL,
            to_addrs=birthday_person["email"],
            msg=f"Subject:Happy Birthday!\n\n{contents}"
        )
