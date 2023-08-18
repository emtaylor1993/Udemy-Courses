"""
This script demonstrates the use of calling functions by
using Reeborg's World as a mini game to test. (Maze 1)

Author:        E. Taylor
Date Created:  July 17, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

# Challenge Found At:
# https://reeborg.ca/reeborg.html?lang=en&mode=python&menu=worlds%2Fmenus%2Freeborg_intro_en.json&name=Maze&url=worlds%2Ftutorial_en%2Fmaze1.json

def turn_right():
    turn_left()
    turn_left()
    turn_left()
    
while not at_goal():
    if right_is_clear():
        turn_right()
        move()
    elif front_is_clear():
        move()
    else:
        turn_left()