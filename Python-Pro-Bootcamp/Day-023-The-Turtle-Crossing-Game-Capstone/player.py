from turtle import Turtle

STARTING_POSITION = (0, -280)
MOVE_DISTANCE = 10
FINISH_LINE_Y = 280
COLOR = "black"
SHAPE = "turtle"
NORTH = 90

class Player(Turtle):
    def __init__(self):
        super().__init__()
        self.color(COLOR)
        self.shape(SHAPE)
        self.penup()
        self.setheading(NORTH)
        self.reset_position()

    def move(self):
        """
        Moves the player forward 10 paces.
        """
        self.forward(MOVE_DISTANCE)

    def reset_position(self):
        """
        Returns the player to the starting position.
        """
        self.goto(STARTING_POSITION)
        