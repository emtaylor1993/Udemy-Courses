#########################################################################
# Examples of using POST, PUT and DELETE using Pixela's API             #
#########################################################################

import requests
from datetime import datetime

TOKEN = "skdfaoishrosek"
USERNAME = "pythontest789"
GRAPH_ID = "graph1"

headers = {
    "X-USER-TOKEN": TOKEN
}

# Creating a new user account on Pixela.
pixela_endpoint = "https://pixe.la/v1/users"

user_parameters = {
    "token": TOKEN,
    "username": USERNAME,
    "agreeTermsOfService": "yes",
    "notMinor": "yes"
}

response = requests.post(url=pixela_endpoint, json=user_parameters)
print(response.text)

# Creating the habit tracking graph.
graph_endpoint = f"{pixela_endpoint}/{USERNAME}/graphs"

graph_parameters = {
    "id": GRAPH_ID,
    "name": "Running Graph",
    "unit": "Km",
    "type": "float",
    "color": "ajisai"
}

response = requests.post(url=graph_endpoint, json=graph_parameters, headers=headers)
print(response.text)

# Posting a pixel to the graph.
pixel_endpoint = f"{pixela_endpoint}/{USERNAME}/graphs/{GRAPH_ID}"

yesterday = datetime(year=2023, month=8, day=8).strftime("%Y%m%d")
today = datetime(year=2023, month=8, day=9).strftime("%Y%m%d")

pixel_parameters = {
    "date": yesterday,
    "quantity": input("How many miles did you run today? ")
}

response = requests.post(url=pixel_endpoint, json=pixel_parameters, headers=headers)
print(response.text)

# Updating a pixel on the graph.
update_pixel_endpoint = f"{pixela_endpoint}/{USERNAME}/graphs/{GRAPH_ID}/{yesterday}"

update_pixel_parameters = {
    "quantity": input("How many miles did you run today? ")
}

response = requests.put(url=update_pixel_endpoint, json=update_pixel_parameters, headers=headers)
print(response.text)

# Deleting that same pixel on the graph.
delete_pixel_endpoint = f"{pixela_endpoint}/{USERNAME}/graphs/{GRAPH_ID}/{yesterday}"

response = requests.delete(url=delete_pixel_endpoint, headers=headers)
print(response.text)