"""
This script creates a game playing bot that will max out the number
of cookies made per second by checking for the highest upgrade every
5 seconds. After 5 minutes the number of cookies/second is printed.

Author:        E. Taylor
Date Created:  August 20, 2023
Date Modified: August 20, 2023
Dependencies:  selenium, time
"""

from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Chrome()
driver.get("http://orteil.dashnet.org/experiments/cookie/")

cookie = driver.find_element(By.ID, "cookie")
items = driver.find_elements(By.CSS_SELECTOR, "#store div")
item_ids = [item.get_attribute("id") for item in items]
timeout = time.time() + 5
five_min = time.time() + 60 * 5

while True:
    cookie.click()

    # Check every 5 seconds:
    if time.time() > timeout:
        all_prices = driver.find_elements(By.CSS_SELECTOR, "#store b")
        item_prices = []

        for price in all_prices:
            element_text = price.text
            if element_text != "":
                cost = int(element_text.split("-")[1].strip().replace(",", ""))
                item_prices.append(cost)

        cookie_upgrades = {}
        for n in range(len(item_prices)):
            cookie_upgrades[item_prices[n]] = item_ids[n]

        money_element = driver.find_element(By.ID, "money").text
        if "," in money_element:
            money_element = money_element.replace(",", "")
        cookie_count = int(money_element)

        affordable_upgrades = {}
        for cost, id in cookie_upgrades.items():
            if cookie_count > cost:
                 affordable_upgrades[cost] = id

        highest_price_affordable_upgrade = max(affordable_upgrades)
        print(highest_price_affordable_upgrade)
        to_purchase_id = affordable_upgrades[highest_price_affordable_upgrade]
        driver.find_element(By.ID, to_purchase_id).click()
        timeout = time.time() + 5
    
    # Print the cookies per second and end the game.
    if time.time() > five_min:
        cookie_per_s = driver.find_element_by_id("cps").text
        print(cookie_per_s)
        break