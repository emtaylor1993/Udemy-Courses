"""
This script contains code for the CarManager class. The CarManager class
generates random cards and moves them along the left of the screen.

Author:        E. Taylor
Date Created:  July 24, 2023
Date Modified: August 18, 2023
Dependencies:  turtle, random
"""

from turtle import Turtle
from random import choice, randint

COLORS = ["red", "orange", "yellow", "green", "blue", "purple"]
STARTING_MOVE_DISTANCE = 5
MOVE_INCREMENT = 10
SHAPE = "square"

class CarManager():
    def __init__(self):
        self.all_cars = []

    def create_car(self):
        """
        Creates a random car every so often.
        """
        random_chance = randint(1, 6)
        if random_chance == 1:
            new_car = Turtle(SHAPE)
            new_car.shapesize(stretch_wid=1, stretch_len=2)
            new_car.penup()
            new_car.color(choice(COLORS))
            random_y = randint(-250, 250)
            new_car.goto(300, random_y)
            self.all_cars.append(new_car)

    def move_cars(self, increment):
        """
        Moves the cars in each list to the left across the screen.
        """
        for car in self.all_cars:
            car.backward(STARTING_MOVE_DISTANCE + (increment * MOVE_INCREMENT))
            