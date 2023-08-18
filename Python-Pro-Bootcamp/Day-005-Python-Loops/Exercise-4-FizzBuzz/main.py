"""
This script displays the beloved FizzBuzz challenge for
numbers 1 to 100.

Author:        E. Taylor
Date Created:  July 15, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

# Write your code below this row 👇
for number in range(1, 101):
    if number % 3 == 0 and number % 5 != 0:
        print("Fizz")
    elif number % 5 == 0 and number % 3 != 0:
        print("Buzz")
    elif number % 5 == 0 and number % 3 == 0:
        print("FizzBuzz")
    else:
        print(number)