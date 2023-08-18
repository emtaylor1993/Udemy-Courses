"""
This script contains code to drive the Quiz Project by using models 
for the questions, the quiz brain the data and UI.

Author:        E. Taylor
Date Created:  July 30, 2023
Date Modified: August 18, 2023
Dependencies:  question_model, data, quiz_brain, ui
"""

from question_model import Question
from data import question_data
from quiz_brain import QuizBrain
from ui import QuizInterface

question_bank = []

for question in question_data:
    question_text = question["question"]
    question_answer = question["correct_answer"]
    new_question = Question(question_text, question_answer)
    question_bank.append(new_question)

quiz = QuizBrain(question_bank)
quiz_interface = QuizInterface(quiz)

print("You've completed the quiz")
print(f"Your final score was: {quiz.score}/{quiz.question_number}")
   