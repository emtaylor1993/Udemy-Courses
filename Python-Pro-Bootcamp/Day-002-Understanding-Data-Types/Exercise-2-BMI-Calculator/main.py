"""
This script calculates the user's BMI and displays it.

Author:        E. Taylor
Date Created:  July 12, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

# 🚨 Don't change the code below 👇
height = input("enter your height in m: ")
weight = input("enter your weight in kg: ")
# 🚨 Don't change the code above 👆

# Write your code below this line 👇
bmi = float(weight) / (float(height) ** 2)
print(int(bmi))