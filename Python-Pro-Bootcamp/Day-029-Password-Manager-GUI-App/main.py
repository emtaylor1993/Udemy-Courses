from tkinter import *
from tkinter import messagebox
from random import choice, randint, shuffle
from pyperclip import copy

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

    if len(website) == 0 or len(password) == 0:
        messagebox.showinfo(title="Oops", message="Please don't leave any fields empty!")
    else:
        is_okay = messagebox.askokcancel(
            title=website, 
            message=f"These are the details entered: \nEmail: {email}\nPassword: {password}\nIs it okay to save?"
        )

        if is_okay:
            with open("data.txt", "a") as f:
                f.write(website + " | " + email + " | " + password + "\n")
                website_entry.delete(0, END)
                email_entry.delete(0, END)
                password_entry.delete(0, END)
    
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
website_entry = Entry(width=35)
website_entry.grid(column=1, row=1, columnspan=2)
website_entry.focus()
email_entry = Entry(width=35)
email_entry.grid(column=1, row=2, columnspan=2)
email_entry.insert(0, "emmanuel@email.com")
password_entry = Entry(width=17)
password_entry.grid(column=1, row=3)

# # Creating Buttons
generate_button = Button(text="Generate Password", command=generate_password)
generate_button.grid(column=2, row=3)
add_button = Button(text="Add", width=30, command=save_password)
add_button.grid(column=1, row=4, columnspan=2)

window.mainloop()