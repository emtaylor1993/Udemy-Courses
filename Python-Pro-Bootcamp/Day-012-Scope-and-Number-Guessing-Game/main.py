#Number Guessing Game Objectives:

# Include an ASCII art logo.
# Allow the player to submit a guess for a number between 1 and 100.
# Check user's guess against actual answer. Print "Too high." or "Too low." depending on the user's answer. 
# If they got the answer correct, show the actual answer to the player.
# Track the number of turns remaining.
# If they run out of turns, provide feedback to the player. 
# Include two different difficulty levels (e.g., 10 guesses in easy mode, only 5 guesses in hard mode).

from art import logo
from random import randint

random_number = randint(1, 100)

print(logo)
print("Welcome to the Number Guessing Game!")
print("I'm thinking of a number between 1 and 100.")
# print(f"Pssst, the correct answer is {random_number}")
difficulty = input("Choose a difficulty. Type 'easy' or 'hard': ")

if difficulty == "easy":
  num_guesses = 10
elif difficulty == "hard":
  num_guesses = 5

win = False 

while num_guesses > 0:
  print(f"You have {num_guesses} attempts remaining to guess the number.")
  guess = int(input("Make a guess: "))
  if guess > random_number:
    print("Too high.")
    print("Guess again.")
    num_guesses -= 1
  elif guess < random_number:
    print("Too low.")
    print("Guess again.")
    num_guesses -= 1
  else:
    print(f"You got it! The answer was {guess}")
    num_guesses = 0
    win = True

if win == False:
  print("You've run out of guesses. You lose.")