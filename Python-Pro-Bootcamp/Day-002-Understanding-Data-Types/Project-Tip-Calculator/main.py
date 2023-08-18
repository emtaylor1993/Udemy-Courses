"""
This script calculates the tip that should be added to the total
bill, and determines how much each person should pay based on how
many people are splitting it.

Author:        E. Taylor
Date Created:  July 12, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

# If the bill was $150.00, split between 5 people, with 12% tip. 

# Each person should pay (150.00 / 5) * 1.12 = 33.6
# Format the result to 2 decimal places = 33.60

# Write your code below this line 👇
print("Welcome to the tip calculator.")
total = float(input("What was the total bill? $"))
percentage = int(input("What percentage tip would you like to give? 10, 12, or 15? "))
split = int(input("How many people to split the bill? "))

tip = 1.00 + (percentage / 100)
calculation = (total / split) * tip
rounded_calculation = "{:.2f}".format(calculation)

print(f"Each person should pay: ${rounded_calculation}\n")