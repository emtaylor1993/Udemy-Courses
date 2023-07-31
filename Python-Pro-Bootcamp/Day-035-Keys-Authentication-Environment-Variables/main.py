import requests
from twilio.rest import Client

# Open Weather Map Parameters
LAT = 39.373730
LON = -76.475433
API_KEY = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" # Your API Key

# Twilio Parameters
ACCOUNT_SID = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" # Your Twilio Account SID
AUTH_TOKEN = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"  # Your Twilio Account Authentication Token

parameters = {
    "lat": LAT,
    "lon": LON,
    "exclude": "current,minutely,daily",
    "appid": API_KEY
}

r = requests.get("https://api.openweathermap.org/data/2.5/onecall", params=parameters)
r.raise_for_status()
data = r.json()
data_slice = data["hour"][:12]

will_rain = False

for hour_data in data_slice:
    condition_code = hour_data["weather"][0]["id"]
    if int(condition_code) < 700:
        will_rain = True

if will_rain:
    client = Client(ACCOUNT_SID, AUTH_TOKEN)
    message = client.messages.create(
        to="+11111111111", # Your Phone Number Here 
        from="+11111111111", # Your Twilio Phone Number
        body="It's going to rain today. Remember to bring an umbrella."
    )
