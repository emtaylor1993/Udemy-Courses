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
