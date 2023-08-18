"""
This script converts string input of a two digit number to an
integer and displays the sum of both integers.

Author:        E. Taylor
Date Created:  July 12, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

# 🚨 Don't change the code below 👇
two_digit_number = input("Type a two digit number: ")
# 🚨 Don't change the code above 👆

####################################
# Write your code below this line 👇
digit_one = int(two_digit_number[0])
digit_two = int(two_digit_number[1])
print(digit_one + digit_two)