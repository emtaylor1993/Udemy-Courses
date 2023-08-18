"""
This script simulates a game in which the user guesses which option
has the highest number of followers. The game ends when the user 
guesses incorrectly.

Author:        E. Taylor
Date Created:  July 22, 2023
Date Modified: August 18, 2023
Dependencies:  art, game_data, replit, random
"""

from art import logo, vs
from game_data import data
from replit import clear
from random import choice

incorrect = "n"
score = 0
option_a = choice(data)
option_b = choice(data)

while incorrect == "n":
  clear()
  print(logo)

  if score > 0:
    print(f"You're right! Current score: {score}.")
    option_a = option_b
    while option_a == option_b:
      option_b = choice(data)
  print(f"Compare A: {option_a['name']}, a {option_a['description']}, from {option_a['country']}")
  print(vs)
  print(f"Against B: {option_b['name']}, a {option_b['description']}, from {option_b['country']}")
  answer = "A" if option_a["follower_count"] > option_b["follower_count"] else "B"
  guess = input("Who has more followers? Type 'A' or 'B': ")
  if guess == answer:
    score = score + 1
  else:
    incorrect = "y"
    clear()
    print(logo)
    print(f"Sorry, that's wrong. Final score: {score}")