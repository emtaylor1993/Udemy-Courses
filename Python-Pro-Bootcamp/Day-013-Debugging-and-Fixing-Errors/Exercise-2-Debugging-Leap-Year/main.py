"""
This script needs to be used in debug mode so the user can modify
and fix the broken commented out code.

Author:        E. Taylor
Date Created:  July 21, 2023
Date Modified: August 18, 2023
Dependencies:  None
"""

# Debug the below code.

# year = input("Which year do you want to check?")

# if year % 4 == 0:
#   if year % 100 == 0:
#     if year % 400 == 0:
#       print("Leap year.")
#     else:
#       print("Not leap year.")
#   else:
#     print("Leap year.")
# else:
#   print("Not leap year.")
  
year = int(input("Which year do you want to check?"))

if year % 4 == 0:
  if year % 100 == 0:
    if year % 400 == 0:
      print("Leap year.")
    else:
      print("Not leap year.")
  else:
    print("Leap year.")
else:
  print("Not leap year.")