"""
This script creates a random password for the user based on their
specifications. Easy mode provides a password where the order is
not randomized where hard mode randomizes the order.

Author:        E. Taylor
Date Created:  July 15, 2023
Date Modified: August 17, 2023
Dependencies:  random
"""

import random

letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
numbers = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
symbols = ['!', '#', '$', '%', '&', '(', ')', '*', '+']

print("Welcome to the PyPassword Generator!")
nr_letters= int(input("How many letters would you like in your password?\n")) 
nr_symbols = int(input("How many symbols would you like?\n"))
nr_numbers = int(input("How many numbers would you like?\n"))
order = int(input("Would you like order randomisation? Type \"1\" for yes, \"0\" for no\n"))

password = []
string_password = ""

# Eazy Level - Order not randomised:
# e.g. 4 letter, 2 symbol, 2 number = JduE&!91
for character in range(0, nr_letters):
  password.append(letters[random.randint(0, len(letters) - 1)])
for character in range(0, nr_symbols):
  password.append(symbols[random.randint(0, len(symbols) - 1)])
for character in range(0, nr_numbers):
  password.append(numbers[random.randint(0, len(numbers) - 1)])
    
# Hard Level - Order of characters randomised:
# e.g. 4 letter, 2 symbol, 2 number = g^2jk8&P
if order == 1:
  random.shuffle(password)
  
for character in password:
  string_password += character
  
print(f"Here is your password: {string_password}")