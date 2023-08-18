"""
This script uses the requests module to get 10 random questions from OpenTDB
for use with the quiz.

Author:        E. Taylor
Date Created:  July 30, 2023
Date Modified: August 18, 2023
Dependencies:  requests
"""

import requests

question_data = []
parameters = {
    "amount": 10,
    "type": "boolean"
}

r = requests.get("https://opentdb.com/api.php", params=parameters)
r.raise_for_status()
data = r.json()
question_data = data["results"]
