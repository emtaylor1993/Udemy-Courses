"""
This script displays the sum of even numbers from 1 to 100.

Author:        E. Taylor
Date Created:  July 15, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

# Write your code below this row 👇
even_sum = 0

for number in range(1, 101):
    if number % 2 == 0:
        even_sum += number

print(even_sum)