from turtle import Turtle

STARTING_POSITIONS = [(0, 0), (-20, 0), (-40, 0)]
MOVE_DISTANCE = 20
RIGHT = 0
UP = 90
LEFT = 180
DOWN = 270

class Snake:
    def __init__(self):
        self.segments = []
        self.create_snake()
        self.head = self.segments[0]

    def create_snake(self):
        """
        Creates the initial snake of length 3 and positions them along the middle
        of the screen.
        """
        for position in STARTING_POSITIONS:
            self.add_segment(position)

    def add_segment(self, position):
        """
        Adds a segment to the list of snake segments.
        """
        new_segment = Turtle("square")
        new_segment.color("white")
        new_segment.penup()
        new_segment.goto(position)
        self.segments.append(new_segment)

    def extend(self):
        """
        Extends the snake by one segment.
        """
        self.add_segment(self.segments[-1].position())

    def move(self):
        """
        Moves the snake forward and makes sure each 
        segment follows the head of the snake.
        """
        for segment_number in range(len(self.segments) - 1, 0, -1):
            new_x = self.segments[segment_number - 1].xcor()
            new_y = self.segments[segment_number - 1].ycor()
            self.segments[segment_number].goto(new_x, new_y)
        self.head.forward(MOVE_DISTANCE)

    def up(self):
        """
        Changes the snake's heading/direction to the north if it's 
        not already facing south.
        """
        if self.head.heading() != DOWN:
            self.head.setheading(UP)

    def down(self):
        """
        Changes the snake's heading/direction to the south if it's 
        not already facing north.
        """
        if self.head.heading() != UP:
            self.head.setheading(DOWN)

    def left(self):
        """
        Changes the snake's heading/direction to the west if it's 
        not already facing east.
        """
        if self.head.heading() != RIGHT:
            self.head.setheading(LEFT)

    def right(self):
        """
        Changes the snake's heading/direction to the east if it's 
        not already facing west.
        """
        if self.head.heading() != LEFT:
            self.head.setheading(RIGHT)
