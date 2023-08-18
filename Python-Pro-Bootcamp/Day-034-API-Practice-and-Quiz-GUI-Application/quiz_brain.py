"""
This script contains code to define the quiz game's logic. The
QuizBrain can move to the next question, determine if there are
any more questions and check whether the correct answer was entered.

Author:        E. Taylor
Date Created:  July 23, 2023
Date Modified: August 18, 2023
Dependencies:  html
"""

import html

class QuizBrain:
    def __init__(self, q_list):
        self.question_number = 0
        self.score = 0
        self.question_list = q_list
        self.current_question = None

    def still_has_questions(self):
        """
        Returns True if the quiz still has more questions, False otherwise.
        """
        return self.question_number < len(self.question_list)

    def next_question(self):
        """
        Gets the next question from the list of questions.
        """
        self.current_question = self.question_list[self.question_number]
        self.question_number += 1
        q_text = html.unescape(self.current_question.text)
        return f"Q.{self.question_number}: {q_text}"

    def check_answer(self, user_answer):
        """
        Returns True if the answer is correct, False otherwise.
        """
        correct_answer = self.current_question.answer
        if user_answer.lower() == correct_answer.lower():
            return True
        else:
            return False
