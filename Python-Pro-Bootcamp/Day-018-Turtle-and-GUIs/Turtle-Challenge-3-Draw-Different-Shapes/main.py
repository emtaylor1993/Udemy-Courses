from turtle import Turtle, Screen
from random import randint

shapes = ["Triangle", "Square", "Pentagon", "Hexagon", "Heptagon", "Octagon", "Nonagon", "Decagon"]

def draw_shape(turtle, shape):
    turtle.pencolor(randint(0, 255), randint(0, 255), randint(0, 255))
    sides = shapes.index(shape) + 3
    for _ in range(sides):
        turtle.forward(100)
        turtle.right(360 / sides)

turtle = Turtle()
turtle.shape("turtle")
turtle.color("black", "green")
turtle.pensize(5)

screen = Screen()
screen.colormode(255)

for shape in shapes:
    draw_shape(turtle, shape)

screen.exitonclick()