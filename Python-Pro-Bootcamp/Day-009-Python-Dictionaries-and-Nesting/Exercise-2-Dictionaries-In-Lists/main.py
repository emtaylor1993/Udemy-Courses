"""
This script adds a country to the list of cities in the travelog as
well as the number of visits.

Author:        E. Taylor
Date Created:  July 18, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

travel_log = [
{
  "country": "France",
  "visits": 12,
  "cities": ["Paris", "Lille", "Dijon"]
},
{
  "country": "Germany",
  "visits": 5,
  "cities": ["Berlin", "Hamburg", "Stuttgart"]
},
]
#🚨 Do NOT change the code above

#TODO: Write the function that will allow new countries
#to be added to the travel_log. 👇
def add_new_country(country, visits, cities):
    new_entry = {
        "country" : country,
        "visits" : visits,
        "cities" : cities
    }
    travel_log.append(new_entry)

#🚨 Do not change the code below
add_new_country("Russia", 2, ["Moscow", "Saint Petersburg"])
print(travel_log)