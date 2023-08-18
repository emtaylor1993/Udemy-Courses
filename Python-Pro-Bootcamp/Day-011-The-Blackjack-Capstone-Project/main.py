"""
This script simulates a game of Blackjack with the computer.

Author:        E. Taylor
Date Created:  July 20, 2023
Date Modified: August 17, 2023
Dependencies:  random, replit, art
"""

from random import choice
from replit import clear
from art import logo

def deal_card():
    """Returns a random card from the deck."""
    cards = [11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10]
    return choice(cards)

def calculate_score(hand):
    """Takes a list of cards and returns the score calculated from the cards."""
    if sum(hand) == 21 and len(hand) == 2:
        return 0
    if 11 in hand:
        hand.remove(11)
        hand.append(1)
    return sum(hand)
    
def compare(user_score, computer_score):
    """Compares the user's score to the computer's score."""
    if user_score > 21 and computer_score > 21:
        return "You went over. You lose 😤"
    if user_score == computer_score:
        return "Draw 🙃"
    elif computer_score == 0:
        return "Lose, opponent has Blackjack 😱"
    elif user_score == 0:
        return "Win with a Blackjack 😎"
    elif user_score > 21:
        return "You went over. You lose 😭"
    elif computer_score > 21:
        return "Opponent went over. You win 😁"
    elif user_score > computer_score:
        return "You win 😃"
    else:
        return "You lose 😤"

def play_game():
    """Activates the game simulation."""
    print(logo)
    user_cards = []
    comp_cards = []
    is_game_over = False

    for _ in range(2):
        user_cards.append(deal_card())
        comp_cards.append(deal_card())

    while not is_game_over:
        user_score = calculate_score(user_cards)
        comp_score = calculate_score(comp_cards)
        print(f"   Your cards: {user_cards}, current score: {user_score}")
        print(f"   Computer's first card: {comp_cards[0]}")

        if user_score == 0 or comp_score == 0 or user_score > 21:
            is_game_over = True
        else:
            user_should_deal = input("Type 'y' to get another card, type 'n' to pass: ")
            if user_should_deal == "y":
                user_cards.append(deal_card())
            else:
                is_game_over = True

    while comp_score != 0 and comp_score < 17:
        comp_cards.append(deal_card())
        comp_score = calculate_score(comp_cards)
    
    print(f"   Your final hand: {user_cards}, final score: {user_score}")
    print(f"   Computer's final hand: {comp_score}, final score: {comp_score}")
    print(compare(user_score, comp_score))

while input("Do you want to play a game of Blackjack? Type 'y' or 'n': ") == "y":
    clear()
    play_game()