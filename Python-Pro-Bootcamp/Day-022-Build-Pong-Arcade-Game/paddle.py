"""
This script contains code for the Paddle class that inherits from the
Turtle class. The paddle class can move up or down.

Author:        E. Taylor
Date Created:  July 24, 2023
Date Modified: August 18, 2023
Dependencies:  None
"""

from turtle import Turtle

UPPER_BOUND = 250
LOWER_BOUND = -250
COLOR = "white"
SHAPE = "square"

class Paddle(Turtle):
    def __init__(self, position):
        super().__init__()
        self.color(COLOR)
        self.shape(SHAPE)
        self.penup()
        self.segments = []

        # Creates one turtle and stretches it by factor of 20 pixels.
        self.shapesize(stretch_wid=5, stretch_len=1)
        self.goto(position)

    def up(self):
        """
        Make the paddle move upwards north.
        """
        new_y = self.ycor() + 20
        if new_y < UPPER_BOUND:
            self.goto(self.xcor(), new_y)

    def down(self):
        """
        Make the paddle move downwards south.
        """
        new_y = self.ycor() - 20
        if new_y > LOWER_BOUND:
            self.goto(self.xcor(), new_y)