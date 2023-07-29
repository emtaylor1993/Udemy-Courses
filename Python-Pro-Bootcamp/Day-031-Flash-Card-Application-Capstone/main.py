import pandas as pd
from random import choice
from tkinter import *

BACKGROUND_COLOR = "#B1DDC6"

try:
    data = pd.read_csv("data/words_to_learn.csv")
except FileNotFoundError:
    data = pd.read_csv("data/french_words.csv")

data = data.to_dict(orient="records")
current_choice = {}

#####################################################################
#                       GENERATE RANDOM WORD                        #      
#####################################################################
def generate_random_word():
    global current_choice
    current_choice = choice(data)
    canvas.itemconfig(flashcard,image=front_filename)
    canvas.itemconfig(title, text="French", font=("Ariel", 40, "italic"), fill="#000000")
    canvas.itemconfig(word, text=current_choice["French"], font=("Ariel", 60, "bold"), fill="#000000")

#####################################################################
#                       TIMER CONFIGURATION                         #
#####################################################################
def flip_flashcard(dict):
    canvas.itemconfig(flashcard,image=back_filename)
    canvas.itemconfig(title, text="English", font=("Ariel", 40, "italic"), fill="#FFFFFF")
    canvas.itemconfig(word, text=dict["English"], font=("Ariel", 60, "bold"), fill="#FFFFFF")

#####################################################################
#                       TIMER CONFIGURATION                         #
#####################################################################
def start_timer(known):
    if len(current_choice) > 0:
        if known:
            data.remove(current_choice)
        else:
            pd.DataFrame(data).to_csv("data/words_to_learn.csv", index=False)
    generate_random_word()
    window.after(3000, flip_flashcard, current_choice)

#####################################################################
#                            UI SETUP                               #
#####################################################################
window = Tk()
window.title("Flashcard Application")
window.config(padx=50, pady=50, bg=BACKGROUND_COLOR)

# Creating Canvas
canvas = Canvas(window, width=800, height=526, bg=BACKGROUND_COLOR, highlightthickness=0)
front_filename = PhotoImage(file="images/card_front.png")
back_filename = PhotoImage(file="images/card_back.png")
flashcard = canvas.create_image(400, 263, image=front_filename)
title = canvas.create_text(400, 150, text="Title", font=("Ariel", 40, "italic"))
word = canvas.create_text(400, 263, text="Word", font=("Ariel", 60, "bold"))
canvas.grid(column=0, row=0, columnspan=2)

# Creating Buttons
wrong_filename = PhotoImage(file="images/wrong.png")
wrong = Button(window, image=wrong_filename, borderwidth=0, command=lambda: start_timer(False))
wrong.grid(column=0, row=1)

right_filename = PhotoImage(file="images/right.png")
right = Button(window, image=right_filename, borderwidth=0, command=lambda: start_timer(True))
right.grid(column=1, row=1)

window.mainloop()