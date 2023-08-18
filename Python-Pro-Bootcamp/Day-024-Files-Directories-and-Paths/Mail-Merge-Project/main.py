"""
This script create a letter template from starting_letter.txt and sends it to
each name in invited_names.txt. The letters are then saved into the ReadyToSend
folder. This script illustrates Files/Directories examples within Python.

Author:        E. Taylor
Date Created:  July 25, 2023
Date Modified: August 18, 2023
Dependencies:  None
"""

# Create a letter using starting_letter.txt 
# for each name in invited_names.txt
# Replace the [name] placeholder with the actual name.
# Save the letters in the folder "ReadyToSend".

letter_parts = []
letter_names = []

with open("Input/Letters/starting_letter.txt", "r") as f:
    for line in f.readlines():
        part = line.strip("\n")
        letter_parts.append(part)

with open("Input/Names/invited_names.txt", "r") as f:
    for line in f.readlines():
        name = line.strip("\n")
        letter_names.append(name)

for name in letter_names:
    with open(f"Output/ReadyToSend/letter_for_{name}", "w") as f:
        for part in letter_parts:
            if "[name]" in part:
                new_part = part.replace("[name]", name)
                f.write(new_part)
            else:
                f.write(part)
            f.write("\n")
