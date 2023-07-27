from tkinter import *
from tkinter import ttk

def convert_miles_to_km():
    miles = entry.get()
    kilometers = int(miles) * 1.60934
    calculation_label.config(text=str(kilometers))

# Creating and Configuring Window
window = Tk()
window.title("Miles to Kilometers Converter")
window.minsize(width=200, height=200)

# Labels
equal_label = Label(text="is equal to")
equal_label.grid(column=0, row=1)
miles_label = Label(text="Miles")
miles_label.grid(column=2, row=0)
kilometer_label = Label(text="Km")
kilometer_label.grid(column=2, row=1)
calculation_label = Label(text="0")
calculation_label.grid(column=1, row=1)

# Entry
entry = Entry(width=10)
entry.insert(END, string="0")
entry.grid(column=1, row=0)

# Button
button = Button(text="Calculate", command=convert_miles_to_km)
button.grid(column=1, row=2)

window.mainloop()