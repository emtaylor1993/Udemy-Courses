"""
This script calculates the Caesar Cipher of a given message.

Author:        E. Taylor
Date Created:  July 18, 2023
Date Modified: August 17, 2023
Dependencies:  art
"""

from art import logo

alphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
restart = "yes"

"""
Decodes/Encodes a message with the Caesar Cipher algorithm.
"""
def caesar(start_text, shift_amount, cipher_direction):
  end_text = ""
  if shift_amount > 26:
    shift_amount = shift_amount % 26
  if cipher_direction == "decode":
    shift_amount *= -1
  for char in start_text:
    if char in alphabet:
      position = alphabet.index(char)
      new_position = position + shift_amount
      end_text += alphabet[new_position]
    else:
      end_text += char
  print(f"Here's the {cipher_direction}d result: {end_text}")

print(logo)

while restart == "yes":
  direction = input("Type 'encode' to encrypt, type 'decode' to decrypt:\n")
  text = input("Type your message:\n").lower()
  shift = int(input("Type the shift number:\n"))
  
  caesar(start_text=text, shift_amount=shift, cipher_direction=direction)
  
  restart = input("Type \"yes\" if you want to go again. Otherwise, type \"no\".\n")
  if restart == "no":
    print("Goodbye")