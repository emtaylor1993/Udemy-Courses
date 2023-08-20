"""
This script demonstrate the use of Python's selenium package to automatically
apply to jobs on LinkedIn. Simply replace the URL with the job application URL.

Author:        E. Taylor
Date Created:  August 20, 2023
Date Modified: August 20, 2023
Dependencies:  selenium
"""

from selenium import webdriver
from selenium.webdriver.common.by import By

USERNAME = "YOUR USERNAME"
PASSWORD = "YOUR PASSWORD"

# These options allow the webpage to remain open.
options = webdriver.ChromeOptions()
options.add_experimental_option("detach", True)

# Creating the webdriver object.
driver = webdriver.Chrome(options=options)

# Getting webdriver URL.
driver.get("https://www.linkedin.com/jobs/view/3659982657/?alternateChannel=search&refId=Xc2X7CUv1rUA%2FGsUkKDMhA%3D%3D&trackingId=i5qRKha0lgrZUtkozZX9NA%3D%3D")

# Click the apply button.
apply = driver.find_element(By.XPATH, "//*[@id='main-content']/section[1]/div/section[2]/div/div[1]/div/div/button[1]")
apply.click()

# Click the sign-in link.
sign_in = driver.find_element(By.CLASS_NAME, "main__sign-in-link")
sign_in.click()

# Enter login credentials.
username = driver.find_element(By.ID, "username")
username.send_keys(USERNAME)
password = driver.find_element(By.ID, "password")
password.send_keys(PASSWORD)

# Sign in using login credentials.
sign_in_button = driver.find_element(By.XPATH, "//*[@id='organic-div']/form/div[3]/button")
sign_in_button.click()

# Click the easy-apply button.
easy_apply = driver.find_element(By.XPATH, "//*[@id='ember104']/span")
easy_apply.click()

# Enter a contact phone number.
phone_number = driver.find_element(By.CLASS_NAME, "artdeco-text-input--input")
phone_number.send_keys("YOUR PHONE NUMBER")

# Submit application.
submit = driver.find_element(By.XPATH, "//*[@id='ember398']/span")
submit.click()
