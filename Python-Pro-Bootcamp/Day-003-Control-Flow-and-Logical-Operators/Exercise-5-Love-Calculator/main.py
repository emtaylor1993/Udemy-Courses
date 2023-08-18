"""
This script calculates the likeliness of love happening between two
people based on the occurrences of the letters making "true love"
appearing in both of their names.

Author:        E. Taylor
Date Created:  July 14, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

# 🚨 Don't change the code below 👇
print("Welcome to the Love Calculator!")
name1 = input("What is your name? \n")
name2 = input("What is their name? \n")
# 🚨 Don't change the code above 👆

# Write your code below this line 👇
combined_name = name1.lower() + name2.lower()
true = combined_name.count("t") + combined_name.count("r") + combined_name.count("u") + combined_name.count("e")
love = combined_name.count("l") + combined_name.count("o") + combined_name.count("v") + combined_name.count("e")
score = int(str(true) + str(love))

if (score < 10) or (score > 90):
    print(f"Your score is {score}, you go together like coke and mentos.")
elif (score >= 40) and (score <= 50):
    print(f"Your score is {score}, you are alright together.")
else:
    print(f"Your score is {score}.")