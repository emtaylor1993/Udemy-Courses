"""
This script contains code used to create a question object.

Author:        E. Taylor
Date Created:  July 30, 2023
Date Modified: August 18, 2023
Dependencies:  None
"""

class Question:
    def __init__(self, q_text, q_answer):
        self.text = q_text
        self.answer = q_answer
