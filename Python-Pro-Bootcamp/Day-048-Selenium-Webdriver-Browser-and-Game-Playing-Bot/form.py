"""
This script demonstrate the use of Python's selenium package to automatically
fill out forms on a live website.

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
driver.get("http://secure-retreat-92358.herokuapp.com")

fname = driver.find_element(By.NAME, "fName")
fname.send_keys("Kobe")

lname = driver.find_element(By.NAME, "lName")
lname.send_keys("Bryant")

email = driver.find_element(By.NAME, "email")
email.send_keys("kb24forever@gmail.com")
email.send_keys(Keys.ENTER)