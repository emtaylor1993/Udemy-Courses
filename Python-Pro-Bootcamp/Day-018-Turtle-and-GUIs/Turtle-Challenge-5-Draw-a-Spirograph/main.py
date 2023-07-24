import turtle as t
import random

turtle = t.Turtle()
t.colormode(255)
turtle.pensize(2)
turtle.speed(0)

def random_color():
    r = random.randint(0, 255)
    g = random.randint(0, 255)
    b = random.randint(0, 255)
    return (r, g, b)

def draw_spirograph(size):
    for _ in range(int(360 / size)):
        turtle.color(random_color())
        turtle.circle(100)
        turtle.setheading(turtle.heading() + size)

draw_spirograph(2)

screen = t.Screen()
screen.exitonclick()
