"""
This script demonstrates Dictionary Comprehension which allows for the
creation of a new list within on line.

Author:        E. Taylor
Date Created:  July 25, 2023
Date Modified: August 18, 2023
Dependencies:  None
"""

sentence = "What is the Airspeed Velocity of an Unladen Swallow?"
# Don't change code above 👆

# Write your code below:
sentence_list = sentence.split()
result = {word: len(word) for word in sentence_list}

print(result)
