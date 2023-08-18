"""
This script contains the code to run the Pong Arcade Game.

Author:        E. Taylor
Date Created:  July 24, 2023
Date Modified: August 18, 2023
Dependencies:  turtle, paddle, ball, scoreboard, time
"""

from turtle import Screen, Turtle
from paddle import Paddle
from ball import Ball
from scoreboard import Scoreboard
import time

# Constants
WIDTH = 800
HEIGHT = 600
COLOR = "black"
LEFT_POSITION = (-350, 0)
RIGHT_POSITION = (350, 0)

# Setting up the screen
screen = Screen()
screen.bgcolor(COLOR)
screen.setup(width=WIDTH, height=HEIGHT)
screen.title("Pong Arcade Game")
screen.tracer(0)

# Drawing middle line
line = Turtle()
line.color("white")
line.penup()
line.setposition(0, -300)
line.setheading(90)
line.pensize(5)
for number in range(600):
    if number % 2 == 0:
        line.pendown()
        line.forward(10)
    else:
        line.penup()
        line.forward(10)

# Creating game objects
r_paddle = Paddle(RIGHT_POSITION)
l_paddle = Paddle(LEFT_POSITION)
ball = Ball()
scoreboard = Scoreboard()

# Creating event handlers for keystrokes
screen.listen()
screen.onkey(l_paddle.up, "w")
screen.onkey(l_paddle.down, "s")
screen.onkey(r_paddle.up, "Up")
screen.onkey(r_paddle.down, "Down")

game_is_on = True

while game_is_on:
    screen.update()
    time.sleep(ball.speed)
    ball.move()

    # Checks whether the ball is out of bounds on the y axis.
    if ball.ycor() > 280 or ball.ycor() < -280:
        ball.bounce_y()
    
    # Checks for collisions with the right paddle.
    if r_paddle.distance(ball) < 50 and ball.xcor() > 320:
        ball.bounce_x()

    # Checks for collisions with the left paddle.
    if l_paddle.distance(ball) < 50 and ball.xcor() < -320:
        ball.bounce_x()

    # Checks for the left player scoring in the right player's goal.
    if  ball.xcor() > 400:
        ball.reset_position()
        scoreboard.l_point()

    # Checks for the right player scoring in the left player's goal.
    if ball.xcor() < -400:
        ball.reset_position()
        scoreboard.r_point()

screen.exitonclick()