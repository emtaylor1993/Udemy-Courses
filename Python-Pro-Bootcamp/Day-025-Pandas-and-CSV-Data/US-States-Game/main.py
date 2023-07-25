from turtle import Turtle, Screen
import pandas as pd

screen = Screen()
screen.setup(width=725, height=491)
screen.bgpic("blank_states_img.gif")
screen.title("U.S. States Quiz")

data = pd.read_csv("50_states.csv")
all_states = data["state"].values

num_correct = 0
correct_guesses = []

while num_correct < 50:
    answer = screen.textinput(f"{num_correct}/50 States Correct", "What's another state name?").title()
    if answer in all_states and answer not in correct_guesses:
        correct_guesses.append(answer)
        state = Turtle()
        state.penup()
        state.hideturtle()
        state_data = data[data["state"] == answer]
        state.goto(int(state_data.x), int(state_data.y))
        print(str(state_data.state))
        state.write(answer)
        num_correct += 1
    elif answer == "Exit":
        missed_states = []
        for state in all_states:
            if state not in correct_guesses:
                missed_states.append(state)
        df = pd.DataFrame(missed_states)
        df.to_csv("states_to_learn.csv")
        break
