# Challenge Found At:
# https://reeborg.ca/reeborg.html?lang=en&mode=python&menu=worlds%2Fmenus%2Freeborg_intro_en.json&name=Hurdle%201&url=worlds%2Ftutorial_en%2Fhurdle1.json

def turn_right():
    turn_left()
    turn_left()
    turn_left()

for number in range(1, 13):
    if number % 2 == 0:
        turn_left()
        move()
        turn_right()
        move()
        turn_right()
        move()
        turn_left()
    else:
        move()