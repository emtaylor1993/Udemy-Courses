from turtle import Screen
from car_manager import CarManager
from player import Player, FINISH_LINE_Y
from scoreboard import Scoreboard
import time

# Constants
WIDTH = 600
HEIGHT = 600

# Setting up the screen
screen = Screen()
screen.setup(width=WIDTH, height=HEIGHT)
screen.tracer(0)
screen.title("Turtle Crossing Capstone Project")

# Creating game objects
car_manager = CarManager()
player = Player()
scoreboard = Scoreboard()

# Creating event listener
screen.listen()
screen.onkey(player.move, "Up")

game_is_on = True
increment = 0

while game_is_on:
    time.sleep(0.1)
    screen.update()
    car_manager.create_car()
    car_manager.move_cars(increment)

    # Detects if the player crosses the finish line.
    if player.ycor() > FINISH_LINE_Y:
        player.reset_position()
        scoreboard.add_level()
        increment += 1

    # Detects if the player collides with a car.
    for car in car_manager.all_cars:
        if car.distance(player) < 20:
            scoreboard.game_over()
            game_is_on = False

screen.exitonclick()
