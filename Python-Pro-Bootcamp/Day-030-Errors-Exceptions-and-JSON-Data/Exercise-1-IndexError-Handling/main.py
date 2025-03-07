"""
This script demonstrates handling an IndexError exception.

Author:        E. Taylor
Date Created:  July 29, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

fruits = ["Apple", "Pear", "Orange"]

#TODO: Catch the exception and make sure the code runs without crashing.
def make_pie(index):
    try:
        fruit = fruits[index]
        print(fruit + " pie")
    except IndexError:
        print("Fruit pie")

make_pie(4)
