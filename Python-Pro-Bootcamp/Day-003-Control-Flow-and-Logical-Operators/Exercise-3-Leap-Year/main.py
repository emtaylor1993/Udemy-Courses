"""
This script demonstrates nested Python if-elif-else statements
and will determine whether or not the given year is a leap year.

Author:        E. Taylor
Date Created:  July 14, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

# 🚨 Don't change the code below 👇
year = int(input("Which year do you want to check? "))
# 🚨 Don't change the code above 👆

# Write your code below this line 👇
if int(year) % 4 == 0:
    if int(year) % 100 == 0:
        if int(year) % 400 == 0:
            print("Leap year.")
        else:
            print("Not leap year.")
    else:
        print("Leap year.")
else:
    print("Not leap year.")