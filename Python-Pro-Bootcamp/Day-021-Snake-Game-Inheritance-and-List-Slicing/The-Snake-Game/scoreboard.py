"""
This script contains code for the Scoreboard class. The Scoreboard
class can update the score, add to the score and display a game
over screen.

Author:        E. Taylor
Date Created:  July 24, 2023
Date Modified: August 18, 2023
Dependencies:  turtle
"""

from turtle import Turtle

ALIGNMENT = "center"
FONT = ("Courier", 12, "bold")
COLOR = "white"

class Scoreboard(Turtle):
    def __init__(self):
        super().__init__()
        self.score = 0
        self.hideturtle()
        self.penup()
        self.goto(0, 270)
        self.color(COLOR)
        self.update_scoreboard()

    def update_scoreboard(self):
        """
        Writes the scoreboard to the screen.
        """
        self.write(f"Score: {self.score}", align=ALIGNMENT, font=FONT)

    def add_score(self):
        """
        Clear previous score, increments the score by one and writes 
        the scoreboard to the screen.
        """
        self.clear()
        self.score += 1
        self.update_scoreboard()

    def game_over(self):
        """
        Displays "Game Over" at the center of the screen.
        """
        self.goto(0, 0)
        self.write("GAME OVER", align=ALIGNMENT, font=FONT)
