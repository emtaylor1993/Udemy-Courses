import requests

# Sheety API Information
SHEETY_ENDPOINT = "https://api.sheety.co/3aed6875a7f45c77c13eca55abcd6c4a/flightDeals/prices"

class DataManager:
    def __init__(self):
       self.destination_data = {}

    """
    Returns the Google Sheet in the form of a Python Dictionary
    using the Sheety API.
    """
    def get_request(self):
        response = requests.get(url=SHEETY_ENDPOINT)
        data = response.json()
        self.destination_data = data["prices"]
        return self.destination_data
    
    """
    Updates the Google Sheet with the IATA Codes for each city
    using the Sheety API.
    """
    def update_records(self):
        for city in self.destination_data:
            new_data = {
                "price": {
                    "iataCode": city["iataCode"]
                }
            }
            response = requests.put(url=f"{SHEETY_ENDPOINT}/{city['id']}", json=new_data)
            print(response.text)