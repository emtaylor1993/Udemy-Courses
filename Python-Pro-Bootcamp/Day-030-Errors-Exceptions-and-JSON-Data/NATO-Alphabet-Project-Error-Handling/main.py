import pandas as pd

is_valid_entry = False

# TODO 1. Create a dictionary in this format: {"A": "Alfa", "B": "Bravo"}
df = pd.read_csv("nato_phonetic_alphabet.csv")
phonetic_alphabet = {row.letter: row.code for (index, row) in df.iterrows()}

# TODO 2. Create a list of the phonetic code words from a word that the user inputs.
while not is_valid_entry:
    try:
        word = input("Enter a word: ").upper()
        phonetic_word = [phonetic_alphabet[letter] for letter in word]
        print(phonetic_word)
        is_valid_entry = True
    except KeyError:
        print("Sorry, only letters in the alphabet please.")
