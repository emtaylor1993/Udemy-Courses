from turtle import Turtle

class Ball(Turtle):
    def __init__(self):
        super().__init__()
        self.color("white")
        self.shape("circle")
        self.penup()
        self.x_move = 10
        self.y_move = 10
        self.speed = 0.1

    def move(self):
        """
        Causes the ball to move forward and upwards by a factor of 10 pixels.
        """
        new_x = self.xcor() + self.x_move
        new_y = self.ycor() + self.y_move
        self.goto(new_x, new_y)

    def bounce_y(self):
        """
        Causes the ball to bounce off of the top and bottom of the screen
        switching it's y direction.
        """
        self.y_move *= -1

    def bounce_x(self):
        """
        Causes the ball to bounce off of the paddles and switch it's x direction.
        Increases ball movement speed after each bounce.
        """
        self.x_move *= -1
        self.speed *= 0.9

    def reset_position(self):
        """
        Reset's the position of the ball and returns to the default movement speed.
        """
        self.goto(0, 0)
        self.speed = 0.1
        self.bounce_x()
