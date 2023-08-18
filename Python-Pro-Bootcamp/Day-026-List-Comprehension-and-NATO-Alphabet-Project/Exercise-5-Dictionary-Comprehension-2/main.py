"""
This script demonstrates List Comprehension which allows for the
creation of a new list within on line.

Author:        E. Taylor
Date Created:  July 25, 2023
Date Modified: August 18, 2023
Dependencies:  None
"""

weather_c = {
    "Monday": 12,
    "Tuesday": 14,
    "Wednesday": 15,
    "Thursday": 14,
    "Friday": 21,
    "Saturday": 22,
    "Sunday": 24,
}
# 🚨 Don't change code above 👆

# Write your code 👇 below:
weather_f = {day:(temp * 9/5) + 32 for (day, temp) in weather_c.items()}
print(weather_f)
