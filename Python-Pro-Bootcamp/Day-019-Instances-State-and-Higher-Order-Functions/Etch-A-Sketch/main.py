"""
This script uses the turtle class to demonstrate key listeners
and GUI programming. The key's "w", "a", "s", "d" are used as 
movements.

Author:        E. Taylor
Date Created:  July 23, 2023
Date Modified: August 18, 2023
Dependencies:  turtle
"""

from turtle import Turtle, Screen

turtle = Turtle()
screen = Screen()

def move_forwards():
    turtle.forward(10)

def move_backwards():
    turtle.backward(10)

def turn_left():
    turtle.left(10)

def turn_right():
    turtle.right(10)

def clear_screen():
    screen.resetscreen()

screen.listen()
screen.onkey(move_forwards, "w")
screen.onkey(move_backwards, "s")
screen.onkey(turn_left, "a")
screen.onkey(turn_right, "d")
screen.onkey(clear_screen, "c")
screen.exitonclick()