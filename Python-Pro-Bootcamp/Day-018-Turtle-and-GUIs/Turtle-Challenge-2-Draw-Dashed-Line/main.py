from turtle import Turtle, Screen

turtle = Turtle()
turtle.shape("turtle")
turtle.color("black", "green")

for number in range(50):
    if number % 2 == 0:
        turtle.pendown()
        turtle.forward(10)
    else:
        turtle.penup()
        turtle.forward(10)

screen = Screen()
screen.exitonclick()