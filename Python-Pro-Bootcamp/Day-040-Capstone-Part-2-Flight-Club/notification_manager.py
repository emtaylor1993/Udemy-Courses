"""
This script uses the twilio.rest module to send a notification to the user containing
flight details.

Author:        E. Taylor
Date Created:  August 10, 2023
Date Modified: August 18, 2023
Dependencies:  twilio.rest
"""

import smtplib
from twilio.rest import Client

MY_EMAIL = "python.class.testing@gmail.com"
MY_PASSWORD = "rcwqwajctcbcqiuh"
TWILIO_SID = "" # Your Twilio Account SID
TWILIO_AUTH_TOKEN = "" # Your Twilio Authentication Token
TWILIO_VIRTUAL_NUMBER = "" # Your Twilio Virtual Number
TWILIO_VERIFIED_NUMBER = "" # Your Twilio Verified Number

class NotificationManager:
    def __init__(self):
        self.client = Client(TWILIO_SID, TWILIO_AUTH_TOKEN)

    def send_sms(self, message):
        message = self.client.messages.create(
            body=message,
            from_=TWILIO_VIRTUAL_NUMBER,
            to=TWILIO_VERIFIED_NUMBER,
        )

        # Prints if successfully sent.
        print(message.sid)

    def send_emails(self, emails, message):
        with smtplib.SMTP("smtp.gmail.com") as connection:
            connection.starttls()
            connection.login(MY_EMAIL, MY_PASSWORD)
            for email in emails:
                connection.sendmail(
                    from_addr=MY_EMAIL,
                    to_addrs=email,
                    msg=f"Subject:New Low Price Flight!\n\n{message}".encode('utf-8')
                )