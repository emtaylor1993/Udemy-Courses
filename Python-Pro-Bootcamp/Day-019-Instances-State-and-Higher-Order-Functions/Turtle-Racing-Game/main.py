from turtle import Turtle, Screen
from random import randint

is_race_on = False
screen = Screen()
screen.setup(width=500, height=400)
choice = screen.textinput(title="Make Your Bet", prompt="Which turtle will win the race? Enter a color: ")
colors = ["red", "orange", "yellow", "green", "blue", "purple"]

def generate_turtle(x, y, color):
    turtle = Turtle("turtle")
    turtle.penup()
    turtle.goto(x=x, y=y)
    turtle.color(color)
    return turtle
    
turtle_1 = generate_turtle(x=-230, y=-70, color=colors[0])
turtle_2 = generate_turtle(x=-230, y=-40, color=colors[1])
turtle_3 = generate_turtle(x=-230, y=-10, color=colors[2])
turtle_4 = generate_turtle(x=-230, y=20, color=colors[3])
turtle_5 = generate_turtle(x=-230, y=50, color=colors[4])
turtle_6 = generate_turtle(x=-230, y=80, color=colors[5])

all_turtles = [turtle_1, turtle_2, turtle_3, turtle_4, turtle_5, turtle_6]

if choice:
    is_race_on = True

while is_race_on:
    for turtle in all_turtles:
        if turtle.xcor() > 230:
            is_race_on = False
            winning_color = turtle.pencolor()
            if winning_color == choice:
                print(f"You've won! The {winning_color} turtle is the winner!")
            else:
                print(f"You've lost! The {winning_color} turtle is the winner!")
        turtle.forward(randint(0, 10))

screen.exitonclick()