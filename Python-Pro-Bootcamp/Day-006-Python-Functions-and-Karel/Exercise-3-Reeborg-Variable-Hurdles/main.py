"""
This script demonstrates the use of calling functions by
using Reeborg's World as a mini game to test. (Hurdle 4)

Author:        E. Taylor
Date Created:  July 17, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

# Challenge Found At:
# https://reeborg.ca/reeborg.html?lang=en&mode=python&menu=worlds%2Fmenus%2Freeborg_intro_en.json&name=Hurdle%204&url=worlds%2Ftutorial_en%2Fhurdle4.json

def turn_right():
    turn_left()
    turn_left()
    turn_left()
    
def jump():
    turn_left()
    while wall_on_right():
        move()
    turn_right()
    move()
    turn_right()
    while front_is_clear():
        move()
    turn_left()
        
while not at_goal():
    if wall_in_front():
        jump()
    else:
        move()