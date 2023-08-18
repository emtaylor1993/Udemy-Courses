"""
This script contains code for a GUI Password Manager Application
complete with error handling.

Author:        E. Taylor
Date Created:  July 29, 2023
Date Modified: August 18, 2023
Dependencies:  tkinter, random, pyperclip
"""

from tkinter import *
from tkinter import messagebox
from random import choice, randint, shuffle
from pyperclip import copy
import json

# ---------------------------- PASSWORD GENERATOR ------------------------------- #
def generate_password():
    password_entry.delete(0, END)
    letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
    numbers = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
    symbols = ['!', '#', '$', '%', '&', '(', ')', '*', '+']

    password_letters = [choice(letters) for _ in range(randint(8, 10))]
    password_symbols = [choice(symbols) for _ in range(randint(2, 4))]
    password_numbers = [choice(numbers) for _ in range(randint(2, 4))]
    password_list = password_letters + password_symbols + password_numbers

    shuffle(password_list)

    password = "".join(password_list)
    password_entry.insert(0, password)
    copy(password)

# ---------------------------- SAVE PASSWORD ------------------------------------ #
def save_password():
    website = website_entry.get()
    email = email_entry.get()
    password = password_entry.get()
    new_data = {
        website: {
            "email": email,
            "password": password
        }
    }

    if len(website) == 0 or len(password) == 0:
        messagebox.showinfo(title="Oops", message="Please don't leave any fields empty!")
    else:
        try:
            with open("data.json", "r") as data_file:
                data = json.load(data_file)
        except FileNotFoundError:
            with open("data.json", "w") as data_file:
                json.dump(new_data, data_file, indent=4)
        else:
            data.update(new_data)
            with open("data.json", "w") as data_file:
                json.dump(new_data, data_file, indent=4)
        finally:
            website_entry.delete(0, END)
            email_entry.delete(0, END)
            password_entry.delete(0, END)

# ----------------------------------- SEARCH ------------------------------------ #
def search():
    website = website_entry.get()
    try:
        with open("data.json", "r") as data_file:
            data = json.load(data_file)
            if website in data:
                email = data[website]["email"]
                password = data[website]["password"]
                messagebox.showinfo(title=f"{website}", message=f"Email: {email}\nPassword: {password}")
            else:
                messagebox.showinfo(title=f"{website}", message="No details for the website exist.")
    except FileNotFoundError:
        messagebox.showinfo(title="Error", message="No Data File Found.")

# ---------------------------- UI SETUP ----------------------------------------- #
window = Tk()
window.title("Password Manager")
window.config(padx=50, pady=50)

# Creating Canvas
canvas = Canvas(window, width=200, height=200)
filename = PhotoImage(file="logo.png")
canvas.create_image(100, 100, image=filename)
canvas.grid(column=1, row=0)

# Creating Labels
website = Label(text="Website:")
website.grid(column=0, row=1)
email = Label(text="Email:")
email.grid(column=0, row=2)
password = Label(text="Password:")
password.grid(column=0, row=3)

# Creating Inputs
website_entry = Entry(width=17)
website_entry.grid(column=1, row=1)
website_entry.focus()
email_entry = Entry(width=35)
email_entry.grid(column=1, row=2, columnspan=2)
email_entry.insert(0, "emmanuel@email.com")
password_entry = Entry(width=17)
password_entry.grid(column=1, row=3)

# # Creating Buttons
search_button = Button(text="Search", width=10, command=search)
search_button.grid(column=2, row=1)
generate_button = Button(text="Generate Password", command=generate_password)
generate_button.grid(column=2, row=3)
add_button = Button(text="Add", width=30, command=save_password)
add_button.grid(column=1, row=4, columnspan=2)

window.mainloop()