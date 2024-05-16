"""
This script demonstrate the use of Python's selenium package to automatically
apply to jobs on LinkedIn. Simply replace the URL with the job application URL.

Author:        E. Taylor
Date Created:  August 20, 2023
Date Modified: August 20, 2023
Dependencies:  selenium
"""

from internet_speed_twitter_bot import InternetSpeedTwitterBot

speed_bot = InternetSpeedTwitterBot()

PROMISED_DOWN = 1000
PROMISED_UP = 50

# speeds = speed_bot.get_internet_speed()
# print(f"down: {speeds['down']}\nup: {speeds['up']}")

speed_bot.tweet_at_provider()