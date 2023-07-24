from turtle import Turtle

FONT = ("Courier", 12, "bold")
COLOR = "black"
ALIGNMENT = "center"

class Scoreboard(Turtle):
    def __init__(self):
        super().__init__()
        self.level = 1
        self.hideturtle()
        self.penup()
        self.color(COLOR)
        self.update_scoreboard()

    def update_scoreboard(self):
        """
        Clears the previous scoreboard and displays the current scoreboard.
        """
        self.clear()
        self.goto(-250, 275)
        self.write(f"Level: {self.level}", align=ALIGNMENT, font=FONT)

    def add_level(self):
        """
        Updates the level by adding 1.
        """
        self.level += 1
        self.update_scoreboard()

    def game_over(self):
        """
        Displays the GAME OVER message.
        """
        self.goto(0, 0)
        self.write("GAME OVER", align=ALIGNMENT, font=FONT)
        