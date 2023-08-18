"""
This script contains code for the Pomodoro work model.

Author:        E. Taylor
Date Created:  July 27, 2023
Date Modified: August 18, 2023
Dependencies:  tkinter, math
"""

from tkinter import *
import math

# ---------------------------- CONSTANTS ------------------------------- #
PINK = "#e2979c"
RED = "#e7305b"
GREEN = "#9bdeac"
YELLOW = "#f7f5dd"
FONT_NAME = "Courier"
WORK_MIN = 25
SHORT_BREAK_MIN = 5
LONG_BREAK_MIN = 20

# ---------------------------- GLOBAL VARIABLES ------------------------------- #
reps = 0
timer = None

# ---------------------------- TIMER RESET ------------------------------- # 
def reset_timer():
    pomodoro_window.after_cancel(timer)
    canvas.itemconfig(timer_text, text="00:00")
    title.config(text="Timer")
    check_marks.config(text="")
    global reps
    reps = 0

# ---------------------------- TIMER MECHANISM ------------------------------- # 
def start_timer():
    global reps
    reps += 1
    if reps % 2 != 0:
        title.config(text="Work", font=(FONT_NAME, 35, "bold"), bg=YELLOW, fg=GREEN)
        count_down(WORK_MIN * 60)
    elif reps % 2 == 0 and reps % 8 != 0:
        title.config(text="Break", font=(FONT_NAME, 35, "bold"), bg=YELLOW, fg=PINK)
        count_down(SHORT_BREAK_MIN * 60)
    elif reps % 8 == 0:
        title.config(text="Break", font=(FONT_NAME, 35, "bold"), bg=YELLOW, fg=RED)
        count_down(LONG_BREAK_MIN * 60)

# ---------------------------- COUNTDOWN MECHANISM ------------------------------- # 
def count_down(count):
    count_min = math.floor(count / 60)
    count_sec = count % 60
    if count_sec < 10:
        count_sec = f"0{count_sec}"
    canvas.itemconfig(timer_text, text=f"{count_min}:{count_sec}")
    if count > 0:
        global timer
        timer = pomodoro_window.after(1000, count_down, count - 1)
    else:
        start_timer()
        marks = ""
        work_sessions = math.floor(reps / 2)
        for _ in range(work_sessions):
            mark += "✔"
        check_marks.config(text=mark)

# ---------------------------- UI SETUP ------------------------------- #
pomodoro_window = Tk()
pomodoro_window.title("Pomodoro Project")
pomodoro_window.config(padx=100, pady=50, bg=YELLOW)

# Creating Canvas
canvas = Canvas(pomodoro_window, width=200, height=224, bg=YELLOW, highlightthickness=0)
filename = PhotoImage(file="tomato.png")
canvas.create_image(100, 112, image=filename)
timer_text = canvas.create_text(100, 130, text="00:00", fill="white", font=(FONT_NAME, 35, "bold"))
canvas.grid(column=1, row=1)

# Displaying Title Label
title = Label(text="Timer", font=(FONT_NAME, 35, "bold"), bg=YELLOW, fg=GREEN)
title.grid(column=1, row=0)

# Creating Buttons
start_button = Button(text="Start", highlightthickness=0, command=start_timer)
start_button.grid(column=0, row =2)

reset_button = Button(text="Reset", highlightthickness=0, command=reset_timer)
reset_button.grid(column=2, row=2)

# Creating checkmarks
check_marks = Label(text="", fg=GREEN, bg=YELLOW, font=(FONT_NAME, 15, "bold"))
check_marks.grid(column=1, row=3)

pomodoro_window.mainloop()