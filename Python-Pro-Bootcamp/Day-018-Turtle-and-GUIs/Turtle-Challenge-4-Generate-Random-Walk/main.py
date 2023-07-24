from turtle import Turtle, Screen
from random import randint, choice

directions = [0, 90, 180, 270]

def walk(turtle):
    turtle.pencolor(randint(0, 255), randint(0, 255), randint(0, 255))
    turtle.setheading(choice(directions))
    turtle.forward(30)

turtle = Turtle()
turtle.shape("turtle")
turtle.pensize(10)
turtle.speed(0)

screen = Screen()
screen.colormode(255)

for _ in range(200):
    walk(turtle)

screen.exitonclick()
