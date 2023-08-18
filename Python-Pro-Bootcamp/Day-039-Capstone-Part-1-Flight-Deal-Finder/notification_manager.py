"""
This script uses the twilio.rest module to send a notification to the user containing
flight details.

Author:        E. Taylor
Date Created:  August 9, 2023
Date Modified: August 18, 2023
Dependencies:  twilio.rest
"""

from twilio.rest import Client

# Twilio API Information
ACCOUNT_SID = "" # Your Twilio Account SID
AUTH_TOKEN = "" # Your Twilio Authentication Token

# This class is responsible for sending notifications with the deal flight details.
class NotificationManager:
    """
    Uses the Twilio API to send a message to the user.
    """
    def send_message(self, price, departure_city, departure_city_code, arrival_city, arrival_city_code, outbound_date, inbound_date):
        client = Client(ACCOUNT_SID, AUTH_TOKEN)
        message = client.messages.create(
            to="",      # Your phone number.
            from_="",   # Your Twilio phone number.
            body="Low price alert! only {price} to fly from {departure_City}-{departure_city_code} \
                  to {arrival_city}-{arrival_city_code}, from {outbound_date} to {inbound_date}."
        )