import requests
from flight_data import FlightData

# Tequila API Information
TEQUILA_ENDPOINT = "https://api.tequila.kiwi.com"
TEQUILA_APIKEY = "YOUR TEQUILA API HERE"

#This class is responsible for talking to the Flight Search API.
class FlightSearch:
    def __init__(self):
        self.headers = {"apikey": TEQUILA_APIKEY}
        self.parameters = {"term": ""}

    """
    Queries the Tequila API and returns the IATA code for the city
    that was searched for.
    """
    def get_destination_code(self, city_name):
        self.parameters = {"term": f"{city_name}"}
        response = requests.get(f"{TEQUILA_ENDPOINT}/locations/query", params=self.parameters, headers=self.headers)
        data = response.json()
        code = data["locations"][0]["code"]
        return code
    
    """
    Searches the Tequila API based on the parameters given and returns information
    about flights that match the criteria.
    """    
    def search_flights(self, origin_city_code, destination_city_code, from_time, to_time):
        headers = {"apikey": TEQUILA_APIKEY}
        parameters = {
            "fly_from": origin_city_code,
            "fly_to": destination_city_code,
            "date_from": from_time.strftime("%d/%m/%Y"),
            "date_to": to_time.strftime("%d/%m/%Y"),
            "nights_in_dst_from": 7,
            "nights_in_dst_to": 28,
            "flight_type": "round",
            "one_for_city": 1,
            "max_stopvers": 0,
            "curr": "GBP"
        }

        response = requests.get(url=f"{TEQUILA_ENDPOINT}/v2/search", headers=headers, params=parameters)

        try:
            data = response.json()["data"][0]
        except IndexError:
            print(f"No flights found for {destination_city_code}")
            return None
        
        flight_data = FlightData(
            price=data["price"],
            origin_city=data["route"][0]["cityFrom"],
            origin_airport=data["route"][0]["flyFrom"],
            destination_city=data["route"][0]["cityTo"],
            destination_airport=data["route"][0]["flyTo"],
            out_date=data["route"][0]["local_departure"].split("T")[0],
            return_date=data["route"][1]["local_departure"].split("T")[0]
        )

        print(f"{flight_data.destination_city}: £{flight_data.price}")
        return flight_data