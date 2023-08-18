"""
This script demonstrates the usage of Python variables. It will 
switch the values that are input within a and b.

Author:        E. Taylor
Date Created:  July 12, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

# 🚨 Don't change the code below 👇
a = input("a: ")
b = input("b: ")
# 🚨 Don't change the code above 👆

####################################
# Write your code below this line 👇
temp = a
a = b
b = temp
# Write your code above this line 👆
####################################

# 🚨 Don't change the code below 👇
print("a: " + a)
print("b: " + b)