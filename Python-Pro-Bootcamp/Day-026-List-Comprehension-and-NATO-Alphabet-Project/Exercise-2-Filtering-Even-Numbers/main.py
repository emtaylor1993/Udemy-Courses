"""
This script demonstrates List Comprehension which allows for the
creation of a new list within on line.

Author:        E. Taylor
Date Created:  July 25, 2023
Date Modified: August 18, 2023
Dependencies:  None
"""

numbers = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
# 🚨 Do Not Change the code above

#Write your 1 line code 👇 below:
result = [num for num in numbers if num % 2 == 0]
#Write your code 👆 above:

print(result)
