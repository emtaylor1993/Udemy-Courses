"""
This script demonstrate the use of Python's selenium package to scrape elements
from a live website. This script scrapes the number of Wikipedia articles in
English and prints it to the console.

Author:        E. Taylor
Date Created:  August 20, 2023
Date Modified: August 20, 2023
Dependencies:  selenium
"""

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

# These options allow the webpage to remain open.
options = webdriver.ChromeOptions()
options.add_experimental_option("detach", True)

# Creating the webdriver object.
driver = webdriver.Chrome(options=options)

# Getting webdriver URL.
driver.get("https://en.wikipedia.org/wiki/Main_Page")

# Clicking on a link using a web driver.
number_of_articles = driver.find_element(By.XPATH, "//*[@id='articlecount']/a[1]")
print(number_of_articles.get_attribute("textContent"))
number_of_articles.click()

# How to enter text in a text field using a web driver.
search = driver.find_element(By.NAME, "search")
search.send_keys("Python")
search.send_keys(Keys.ENTER)

driver.close()