"""
This script reads in a Google Sheet and updates it.

Author:        E. Taylor
Date Created:  August 9, 2023
Date Modified: August 18, 2023
Dependencies:  requests
"""

import requests

# Sheety API Information
SHEETY_ENDPOINT = "https://api.sheety.co/3aed6875a7f45c77c13eca55abcd6c4a/flightDeals/prices"

class DataManager:
    def __init__(self):
       self.destination_data = {}

    def get_request(self):
        """
        Returns the Google Sheet in the form of a Python Dictionary
        using the Sheety API.
        """
        response = requests.get(url=SHEETY_ENDPOINT)
        data = response.json()
        self.destination_data = data["prices"]
        return self.destination_data
    
    def update_records(self):
        """
        Updates the Google Sheet with the IATA Codes for each city
        using the Sheety API.
        """
        for city in self.destination_data:
            new_data = {
                "price": {
                    "iataCode": city["iataCode"]
                }
            }
            response = requests.put(url=f"{SHEETY_ENDPOINT}/{city['id']}", json=new_data)
            print(response.text)