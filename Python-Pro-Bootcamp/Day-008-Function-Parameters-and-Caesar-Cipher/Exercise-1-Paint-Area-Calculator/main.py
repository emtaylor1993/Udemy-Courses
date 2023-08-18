"""
This script demonstrates the use of the ceil function within
the math module to round to the nearest upper whole number.
Displays the number of paint cans a user will need based on 
the height and width of the wall.

Author:        E. Taylor
Date Created:  July 18, 2023
Date Modified: August 17, 2023
Dependencies:  math
"""

# Write your code below this line 👇
import math

def paint_calc(height, width, cover):
    cans = math.ceil((height * width) / cover)
    print(f"You'll need {cans} cans of paint.")
# Write your code above this line 👆

# Define a function called paint_calc() so that the code below works.   

# 🚨 Don't change the code below 👇
test_h = int(input("Height of wall: "))
test_w = int(input("Width of wall: "))
coverage = 5
paint_calc(height=test_h, width=test_w, cover=coverage)