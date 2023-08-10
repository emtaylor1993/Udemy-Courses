from twilio.rest import Client

# Twilio API Information
ACCOUNT_SID = "YOUR ACCOUNT SID HERE"
AUTH_TOKEN = "YOUR AUTH TOKEN HERE"

#This class is responsible for sending notifications with the deal flight details.
class NotificationManager:

    """
    Uses the Twilio API to send a message to the user.
    """
    def send_message(self, price, departure_city, departure_city_code, arrival_city, arrival_city_code, outbound_date, inbound_date):
        client = Client(ACCOUNT_SID, AUTH_TOKEN)
        message = client.messages.create(
            to="YOUR NUMBER HERE",
            from_="YOUR TWILIO NUMBER HERE",
            body="Low price alert! only {price} to fly from {departure_City}-{departure_city_code} \
                  to {arrival_city}-{arrival_city_code}, from {outbound_date} to {inbound_date}."
        )