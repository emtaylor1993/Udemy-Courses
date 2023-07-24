from turtle import Screen
from snake import Snake
import time

screen = Screen()
screen.bgcolor("black")
screen.setup(width=600, height=600)
screen.title("The Snake Game")
screen.tracer(0)    # Turning turtle animation off.

snake = Snake()

screen.listen()
screen.onkey(snake.up, "Up")
screen.onkey(snake.down, "Down")
screen.onkey(snake.left, "Left")
screen.onkey(snake.right, "Right")

game_is_on = True

while game_is_on:
    screen.update() # Refresh the screen.
    time.sleep(0.1) # Delays the refresh by 0.1 seconds.
    snake.move()

screen.exitonclick()