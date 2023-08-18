"""
This script contains code to define the quiz game's logic. The
QuizBrain can move to the next question, determine if there are
any more questions and check whether the correct answer was entered.

Author:        E. Taylor
Date Created:  July 23, 2023
Date Modified: August 18, 2023
Dependencies:  None
"""

class QuizBrain:
    def __init__(self, question_list):
        self.question_number = 0
        self.question_list = question_list
        self.score = 0

    def next_question(self):
        user_answer = input(f"Q.{self.question_number + 1}: {self.question_list[self.question_number].text}. (True/False)?: ")
        self.check_answer(user_answer, self.question_list[self.question_number].answer)
        self.question_number += 1

    def still_has_questions(self):
        return self.question_number < len(self.question_list)

    def check_answer(self, user_answer, correct_answer):
        if user_answer.lower() == correct_answer.lower():
            print("You got it right!")
            self.score += 1
        else:
            print("That's wrong.")
        print(f"The correct answer was: {correct_answer}")
        print(f"Your current score is: {self.score}/{self.question_number + 1}")
        print("\n")