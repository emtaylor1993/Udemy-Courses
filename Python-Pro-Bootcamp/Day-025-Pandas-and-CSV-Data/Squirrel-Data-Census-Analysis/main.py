"""
This script demonstrates the use of the pandas module by reading in from a
CSV and displaying the number of different colored squirrels and writing
the results to a new CSV file.

Author:        E. Taylor
Date Created:  July 24, 2023
Date Modified: August 18, 2023
Dependencies:  pandas
"""

import pandas as pd

data = pd.read_csv("2018_Central_Park_Squirrel_Census_-_Squirrel_Data.csv")

# Calculating the length of the DataFrame for each color
gray_squirrels = len(data[data["Primary Fur Color"] == "Gray"])
red_squirrels = len(data[data["Primary Fur Color"] == "Cinnamon"])
black_squirrels = len(data[data["Primary Fur Color"] == "Black"])

squirrel_dict = {
    "Fur Color": ["Gray", "Cinnamon", "Black"],
    "Count": [gray_squirrels, red_squirrels, black_squirrels]
}

df = pd.DataFrame(squirrel_dict)
df.to_csv("squirrel_count.csv")
