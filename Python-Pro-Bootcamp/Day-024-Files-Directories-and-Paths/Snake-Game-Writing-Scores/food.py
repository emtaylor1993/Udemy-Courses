"""
This script contains code for the Food class. The Food class can refresh
which places a food object in a random coordinate on the screen.

Author:        E. Taylor
Date Created:  July 25, 2023
Date Modified: August 18, 2023
Dependencies:  turtle, random
"""

from turtle import Turtle
from random import randint

class Food(Turtle):
    def __init__(self):
        super().__init__()
        self.shape("circle")
        self.penup()
        self.shapesize(stretch_len=0.5, stretch_wid=0.5)
        self.color("blue")
        self.speed("fastest")
        self.goto(randint(-280, 280), randint(-280, 280))
        self.refresh()

    def refresh(self):
        """
        Places the snake food at another random location within the window.
        """
        random_x = randint(-280, 280)
        random_y = randint(-280, 280)
        self.goto(random_x, random_y)
        