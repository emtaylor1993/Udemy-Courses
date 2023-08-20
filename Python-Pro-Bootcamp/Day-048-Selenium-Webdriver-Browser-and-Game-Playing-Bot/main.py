"""
This script demonstrate the use of Python's selenium package to scrape elements
from a live website. It will convert the list of upcoming events on Python's
website into a dictionary.

Author:        E. Taylor
Date Created:  August 20, 2023
Date Modified: August 20, 2023
Dependencies:  selenium, pprint
"""

import pprint
from selenium import webdriver
from selenium.webdriver.common.by import By

pp = pprint.PrettyPrinter(indent=4)

# These options allow the webpage to remain open.
options = webdriver.ChromeOptions()
options.add_experimental_option("detach", True)

# Creating the webdriver object.
driver = webdriver.Chrome(options=options)

# Getting webdriver URL.
driver.get("https://www.python.org")
event_dictionary = {}

# Collecting the datetime and name objects from Python's website.
for num in range(1, 6):
    event_dictionary[num-1] = {
        "time": driver.find_element(By.XPATH, f"//*[@id='content']/div/section/div[2]/div[2]/div/ul/li[{num}]/time").get_attribute("textContent"),
        "name": driver.find_element(By.XPATH, f"//*[@id='content']/div/section/div[2]/div[2]/div/ul/li[{num}]/a").get_attribute("textContent")
    }

pp.pprint(event_dictionary)
driver.close()