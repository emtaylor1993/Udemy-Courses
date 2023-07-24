from turtle import *

turtle = Turtle()
turtle.shape("turtle")
turtle.color("black", "green")

for _ in range(4):
    turtle.forward(100)
    turtle.right(90)

my_screen = Screen()
my_screen.exitonclick()