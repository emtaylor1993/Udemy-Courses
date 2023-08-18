"""
This script demonstrates the use of Python's random module to
flip a coin and display whether it was heads or tails.

Author:        E. Taylor
Date Created:  July 14, 2023
Date Modified: August 17, 2023
Dependencies:  random
"""

# Remember to use the random module
# Hint: Remember to import the random module here at the top of the file. 🎲
	 
# Write the rest of your code below this line 👇
import random

number = random.randint(0, 1)

if (number == 1):
    print("Heads")
else:
    print("Tails")