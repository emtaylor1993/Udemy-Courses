"""
This script uses a for loop to determine the highest student
score from the given list of student scores from the user.

Author:        E. Taylor
Date Created:  July 15, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

# 🚨 Don't change the code below 👇
student_scores = input("Input a list of student scores ").split()
for n in range(0, len(student_scores)):
  student_scores[n] = int(student_scores[n])
print(student_scores)
# 🚨 Don't change the code above 👆

# Write your code below this row 👇
highest_score = 0

for score in student_scores:
    if (score > highest_score):
        highest_score = score

print(f"The highest score in the class is: {highest_score}")