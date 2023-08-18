"""
This script contains code that updates a spreadsheet based on workouts that 
the user completed.

Author:        E. Taylor
Date Created:  August 9, 2023
Date Modified: August 18, 2023
Dependencies:  requests, os, datetime
"""


import requests
import os
from datetime import datetime

# Nutrition IX API Constants
APP_ID = os.environ["ENV_APP_ID"]
API_KEY = os.environ["ENV_API_KEY"]

# Sheety API Constants
BEARER = F"Bearer {os.environ['ENV_BEARER']}"

# Endpoints
exercise_endpoint = "https://trackapi.nutritionix.com/v2/natural/exercise"
sheet_endpoint = "https://api.sheety.co/3aed6875a7f45c77c13eca55abcd6c4a/myWorkouts/workouts"

today = datetime.now().strftime("%d/%m/%Y")
time = datetime.now().strftime("%H:%M:%S")

headers = {
    "x-app-id": APP_ID,
    "x-app-key": API_KEY
}

sheety_headers = {
    "Authorization": BEARER
}

parameters = {
    "query": input("Tell me which exercises you did: "),
    "gender": "male",
    "weight_kg": 74.8,
    "height_cm": 182.88,
    "age": 30
}

response = requests.post(exercise_endpoint, json=parameters, headers=headers)
data = response.json()

for exercise in data["exercises"]:
    parameters = {
        "workout": {
            "date": today,
            "time": time,
            "exercise": exercise["name"].title(),
            "duration": exercise["duration_min"],
            "calories": exercise["nf_calories"]
        }
    }

    response = requests.post(sheet_endpoint, json=parameters, headers=sheety_headers)
    print(response)
    