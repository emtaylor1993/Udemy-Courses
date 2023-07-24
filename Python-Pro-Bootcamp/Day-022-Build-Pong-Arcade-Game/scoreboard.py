from turtle import Turtle

class Scoreboard(Turtle):
    def __init__(self):
        super().__init__()
        self.l_score = 0
        self.r_score = 0
        self.hideturtle()
        self.penup()
        self.color("white")
        self.update_scoreboard()

    def update_scoreboard(self):
        """
        Clears the previous scoreboard and displays the updated one.
        """
        self.clear()
        self.goto(-100, 190)
        self.write(self.l_score, align="center", font=("Courier", 80, "bold"))
        self.goto(100, 190)
        self.write(self.r_score, align="center", font=("Courier", 80, "bold"))

    def l_point(self):
        """
        Adds a point to the left player's score.
        """
        self.l_score += 1
        self.update_scoreboard()

    def r_point(self):
        """
        Adds a point to the right player's score.
        """
        self.r_score += 1
        self.update_scoreboard()    