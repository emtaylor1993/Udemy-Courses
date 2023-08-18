"""
This script uses the modulus (%) operator to determine
whether a number is odd or even.

Author:        E. Taylor
Date Created:  July 14, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

# 🚨 Don't change the code below 👇
number = int(input("Which number do you want to check? "))
# 🚨 Don't change the code above 👆

# Write your code below this line 👇
if int(number) % 2 == 0:
    print("This is an even number.")
else:
    print("This is an odd number.")