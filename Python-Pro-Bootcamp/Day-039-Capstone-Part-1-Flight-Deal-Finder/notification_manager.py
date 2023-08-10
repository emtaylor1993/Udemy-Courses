from twilio.rest import Client

# Twilio API Information
ACCOUNT_SID = "AC86acf0f7ba3fd47ca0f4f6288a1f9833"
AUTH_TOKEN = "be741b30619a700c92d57864baf82950"

#This class is responsible for sending notifications with the deal flight details.
class NotificationManager:

    """
    Uses the Twilio API to send a message to the user.
    """
    def send_message(self, price, departure_city, departure_city_code, arrival_city, arrival_city_code, outbound_date, inbound_date):
        client = Client(ACCOUNT_SID, AUTH_TOKEN)
        message = client.messages.create(
            to="+13016593149",
            from_="+18665304467",
            body="Low price alert! only {price} to fly from {departure_City}-{departure_city_code} \
                  to {arrival_city}-{arrival_city_code}, from {outbound_date} to {inbound_date}."
        )