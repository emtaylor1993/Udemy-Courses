"""
This script contains code that checks for an increase/decrease in a stock's value.
If the value is +/- 5%, get the latest news article and send a text to the user.

Author:        E. Taylor
Date Created:  August 1, 2023
Date Modified: August 18, 2023
Dependencies:  requests, datetime, twilio.rest
"""

import requests
import datetime as dt
from twilio.rest import Client

STOCK = "TSLA"
COMPANY_NAME = "Tesla Inc"

# API Keys
ALPHA_VANTAGE_API_KEY = ""  # Your API Key Here
NEWS_API_KEY = ""           # Your API Key Here

# Twilio Parameters
ACCOUNT_SID = ""            # Your Twilio Account SID Here
AUTH_TOKEN = ""             # Your Twilio Auth Token Here

stock_parameters = {
    "function": "TIME_SERIES_DAILY",
    "symbol": STOCK,
    "apikey": ALPHA_VANTAGE_API_KEY
}

news_parameters = {
    "q": COMPANY_NAME,
    "sortBy": "publishedAt",
    "apiKey": NEWS_API_KEY
}

r = requests.get("https://www.alphavantage.co/query", params=stock_parameters)
r.raise_for_status()
data = r.json()

# Checking for weekends
yesterday = dt.date.today() - dt.timedelta(days = 1)
if yesterday.isoweekday() in set((6, 7)):
    yesterday -= dt.timedelta(days = yesterday.isoweekday() % 5)

# Checking for weekends
day_before_yesterday = dt.date.today() - dt.timedelta(days = 2)
if day_before_yesterday.isoweekday() in set((6, 7)):
    day_before_yesterday -= dt.timedelta(days = day_before_yesterday.isoweekday() % 5)

# Gettings yesterday and the day before's stock price.
yesterday_price = data["Time Series (Daily)"][str(yesterday)]["4. close"]
day_before_yesterday_price = data["Time Series (Daily)"][str(day_before_yesterday)]["4. close"]

# Calculating the percentage increase/decrease.
percentage = (float(day_before_yesterday_price) - float(yesterday_price)) / float(day_before_yesterday_price) * 100

# If the percentage is greater than 5% or lower than -5%, send an alert message via SMS.
if percentage > 5 or percentage < -5:
    r = requests.get("https://newsapi.org/v2/everything?", params=news_parameters)
    r.raise_for_status()
    data = r.json()
    articles = data["articles"][:3]
    formatted_articles = [f"Headline: {article['title']}. \nBrief: {article['description']}" for article in articles]
    client = Client(ACCOUNT_SID, AUTH_TOKEN)

    for article in formatted_articles:
        # Your Twilio Phone Number in from_, your phone number in to
        message = client.messages.create(body=article, from_="", to="")
