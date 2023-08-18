"""
This script contains code to drive the Quiz Project by using models 
for the questions and the quiz brain.

Author:        E. Taylor
Date Created:  July 23, 2023
Date Modified: August 18, 2023
Dependencies:  None
"""

from data import question_data
from question_model import Question
from quiz_brain import QuizBrain

question_bank = []

for question in question_data:
    question_bank.append(Question(question["text"], question["answer"]))

quiz = QuizBrain(question_bank)

while quiz.still_has_questions():
    quiz.next_question()

print("You've completed the quiz.")
print(f"Your final score was: {quiz.score}/{quiz.question_number}")