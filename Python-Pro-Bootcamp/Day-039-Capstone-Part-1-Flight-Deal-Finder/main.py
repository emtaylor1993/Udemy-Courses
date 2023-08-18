"""
This script drives the Flight Search engine. 

Author:        E. Taylor
Date Created:  August 9, 2023
Date Modified: August 18, 2023
Dependencies:  data_manager, flight_search, notification_manager, datetime
"""

from data_manager import DataManager
from flight_search import FlightSearch
from notification_manager import NotificationManager
from datetime import datetime, timedelta

dataManager = DataManager()
flightSearch = FlightSearch()
notificationManager = NotificationManager()

sheet_data = dataManager.get_request()

# Populates the Google sheet with the IATA Codes for each city.
if sheet_data[0]["iataCode"] == "":
    for row in sheet_data:
        row["iataCode"] = flightSearch.get_destination_code(row["city"])
    print(f"sheet_data:\n {sheet_data}")

    dataManager.destination_data = sheet_data
    dataManager.update_records()

tomorrow = datetime.now() + timedelta(days=1)
six_month_from_today = datetime.now() + timedelta(days=(6 * 30))

# Searches for the prices from the origin and destination and sends
# an alert if the price is cheaper than what is listed in the Google Sheet.
for destination in sheet_data:
    flight = flightSearch.search_flights(
        "LON",
        destination["iataCode"],
        from_time=tomorrow,
        to_time=six_month_from_today
    )

    if flight.price < destination["lowestPrice"]:
        notificationManager.send_message(
            price=flight.price, 
            departure_city="London", 
            departure_city_code="LON", 
            arrival_city=flight.destination_city, 
            arrival_city_code=flight.destination_airport,
            outbound_date=flight.out_date,
            inbound_date=flight.return_date
        )