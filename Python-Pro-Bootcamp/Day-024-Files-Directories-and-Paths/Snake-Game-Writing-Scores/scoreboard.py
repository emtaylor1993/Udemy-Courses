"""
This script contains code for the Scoreboard class. The Scoreboard
class can update the score, add to the score, display a game
over screen and save previous high scores.

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
        self.high_score = self.read_high_score()
        self.hideturtle()
        self.penup()
        self.goto(0, 270)
        self.color(COLOR)
        self.update_scoreboard()

    def update_scoreboard(self):
        """
        Writes the scoreboard to the screen.
        """
        self.clear()
        self.write(f"Score: {self.score}, High Score: {self.high_score}", align=ALIGNMENT, font=FONT)

    def add_score(self):
        """
        Clear previous score, increments the score by one and writes 
        the scoreboard to the screen.
        """
        self.score += 1
        self.update_scoreboard()

    def reset(self):
        """
        If the score is higher than the current high score, save that into 
        the high score variable. Reset score to 0 and update the scoreboard.
        """
        if self.score > self.high_score:
            self.high_score = self.score
            self.write_high_score()
        self.score = 0
        self.update_scoreboard()

    def read_high_score(self):
        """
        Reads the previous high score from the high_scores.txt file.
        """
        with open("high_score.txt") as f:
            read_data = f.read()
            self.high_score = int(read_data)
        return self.high_score

    def write_high_score(self):
        """
        Writes the current high score to the high_scores.txt file.
        """
        with open("high_score.txt", "w") as f:
            f.write(str(self.high_score))