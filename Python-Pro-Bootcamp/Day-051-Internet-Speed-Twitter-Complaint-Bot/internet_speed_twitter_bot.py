"""
This script demonstrate the use of Python's selenium package to automatically
apply to jobs on LinkedIn. Simply replace the URL with the job application URL.

Author:        E. Taylor
Date Created:  August 20, 2023
Date Modified: August 20, 2023
Dependencies:  selenium
"""

import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

TWITTER_EMAIL = "python.bootcamp.training@gmail.com"
TWITTER_PASSWORD = "Basketball13!!##"

class InternetSpeedTwitterBot:
    def __init__(self):
        self.options = webdriver.ChromeOptions()
        self.options.add_experimental_option("detach", True)
        self.driver = webdriver.Chrome(options=self.options)
        self.up = 0
        self.down = 0

    def get_internet_speed(self):
        self.driver.get("https://www.speedtest.net/")
        self.go_button = WebDriverWait(self.driver, 3).until(EC.presence_of_element_located((By.CSS_SELECTOR, ".start-button a")))
        self.go_button.click()
        time.sleep(60)
        self.down = self.driver.find_element(By.XPATH, "//*[@id='container']/div/div[3]/div/div/div/div[2]/div[3]/div[3]/div/div[3]/div/div/div[2]/div[1]/div[1]/div/div[2]/span").get_attribute("textContent")
        self.up = self.driver.find_element(By.XPATH, "//*[@id='container']/div/div[3]/div/div/div/div[2]/div[3]/div[3]/div/div[3]/div/div/div[2]/div[1]/div[2]/div/div[2]/span").get_attribute("textContent")
        self.driver.quit()
        return {"up": self.up, "down": self.down}
    
    def tweet_at_provider(self):
        self.driver.get("https://twitter.com/")
        self.main_page = self.driver.current_window_handle
        time.sleep(2)
        self.sign_in_button = self.driver.find_element(By.XPATH, "//*[@id='react-root']/div/div/div[2]/main/div/div/div[1]/div/div/div[3]/div[5]/a/div")
        self.sign_in_button.click()
        self.count = 0
        print(self.count)
        # time.sleep(2)
        for handle in self.driver.window_:
            self.count+=1
            if handle != self.main_page:
                login_page = handle
                self.driver.switch_to.window(login_page)
                print(self.count)
 
        time.sleep(2)
        self.input = self.driver.find_element(By.XPATH, "//*[@id='react-root']/div/div/div/main/div/div/div/div[2]/div[2]/div/div[5]/label/div/div[2]/div/input")
        # self.input = WebDriverWait(self.driver, 3).until(EC.presence_of_all_elements_located((By.XPATH, "//*[@id='react-root']/div/div/div/main/div/div/div/div[2]/div[2]/div/div[5]/label/div/div[2]/div/input")))
        self.input.click()
        self.input.send_keys(TWITTER_EMAIL)
