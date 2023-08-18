"""
This script demonstrates the use of Python Loops by iterating through
a list and calculating the average of heights the user provides.

Author:        E. Taylor
Date Created:  July 15, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

# 🚨 Don't change the code below 👇
student_heights = input("Input a list of student heights ").split()
for n in range(0, len(student_heights)):
  student_heights[n] = int(student_heights[n])
# 🚨 Don't change the code above 👆

# Write your code below this row 👇
average_height = 0
number_of_students = 0

for height in student_heights:
    average_height += height
    number_of_students += 1

average_height = round(average_height / number_of_students)
print(average_height)