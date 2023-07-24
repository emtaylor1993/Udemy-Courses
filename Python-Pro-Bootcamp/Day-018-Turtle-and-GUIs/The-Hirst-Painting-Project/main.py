# This commented code was used to generate a list of colors from an image.
#
# import colorgram
#
# colors = colorgram.extract("img.jpg", 10)
# rgb_colors = []
#
# for color in colors:
#     new_color = (color.rgb.r, color.rgb.g, color.rgb.b)
#     rgb_colors.append(new_color)
#
# print(rgb_colors)

import turtle as t
from random import choice

color_list = [
    (236, 252, 244), (249, 232, 19), (199, 12, 31), (195, 67, 21),
    (213, 13, 9), (32, 91, 188), (234, 151, 39), (232, 229, 5)
]

t.colormode(255)
turtle = t.Turtle()
turtle.speed("fastest")
turtle.penup()
turtle.hideturtle()

def draw_dots(turtle, color):
    turtle.dot(20, color)
    turtle.forward(50)

def reposition_turtle(turtle, row):
    turtle.setpos(0, (row + 1) * 50)

for number in range(10):
    for _ in range(10):
        draw_dots(turtle, choice(color_list))
    reposition_turtle(turtle, number)

screen = t.Screen()
screen.exitonclick()
