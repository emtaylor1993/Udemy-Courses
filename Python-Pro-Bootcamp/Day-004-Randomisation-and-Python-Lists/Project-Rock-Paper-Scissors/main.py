"""
This script simulates a game of rock, paper, scissors with
the user and the computer.

Author:        E. Taylor
Date Created:  July 14, 2023
Date Modified: August 17, 2023
Dependencies:  random
"""

import random

rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

scissors = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''

# Write your code below this line 👇
options = [rock, paper, scissors]
user_choice = int(input("What do you choose? Type 0 for Rock, 1 for Paper or 2 for Scissors.\n"))

if (user_choice < 0) or (user_choice > 2):
  print("Invalid choice! You lose")
else:
  comp_choice = random.randint(0, 2)
  print(options[user_choice])
  print("Computer chose:")
  print(options[comp_choice])
  
  if (user_choice == 0) and (comp_choice == 1):
    print("You lose")
  elif (user_choice == 0) and (comp_choice == 2):
    print("You win!")
  elif (user_choice == 1) and (comp_choice == 0):
    print("You win!")
  elif (user_choice == 1) and (comp_choice == 2):
    print("You lose")
  elif (user_choice == 2) and (comp_choice == 0):
    print("You lose")
  elif (user_choice == 2) and (comp_choice == 1):
    print("You win!")
  elif (user_choice == comp_choice):
    print("It's a draw")
  else:
    print("Invalid choice! You lose")