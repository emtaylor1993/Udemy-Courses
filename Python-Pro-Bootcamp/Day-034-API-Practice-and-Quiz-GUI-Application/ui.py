from tkinter import *
from quiz_brain import QuizBrain

THEME_COLOR = "#375362"
FONT = ("Arial", 20, "italic")

class QuizInterface:
    def __init__(self, quiz_brain: QuizBrain):
        self.quiz = quiz_brain
        self.window = Tk()
        self.window.title("Quizzler")
        self.window.config(padx=20, pady=20, bg=THEME_COLOR)

        self.score_text = Label(text=f"Score: {self.quiz.score}", fg="#FFFFFF", bg=THEME_COLOR, anchor="e")
        self.score_text.grid(column=1, row=0)

        self.canvas = Canvas(self.window, width=300, height=250, bg="#FFFFFF")
        self.question_text = self.canvas.create_text(
            150, 
            125, 
            anchor="center",
            text="Some Question Text", 
            fill=THEME_COLOR,
            font=FONT,
            width=270
        )
        self.canvas.grid(column=0, row=1, columnspan=2, pady=20)

        true_filename = PhotoImage(file="images/true.png")
        self.true_button = Button(self.window, image=true_filename, highlightthickness=0, command=self.true_pressed)
        self.true_button.grid(column=0, row=2)

        false_filename = PhotoImage(file="images/false.png")
        self.false_button = Button(self.window, image=false_filename, highlightthickness=0, command=self.false_pressed)
        self.false_button.grid(column=1, row=2)

        self.get_next_question()

        self.window.mainloop()

    def get_next_question(self):
        """
        Checks to see whether the quiz still has questions and returns the next question if
        available. Otherwise, disable buttons.
        """
        self.canvas.config(self.canvas, bg="#FFFFFF")
        self.canvas.itemconfig(self.question_text, fill="#000000")
        if self.quiz.still_has_questions():
            q_text = self.quiz.next_question()
            self.canvas.itemconfig(self.question_text, text=q_text)
        else:
            self.canvas.itemconfig(self.question_text, text="You've reached the end of the quiz.")
            self.true_button.config(state="disabled")
            self.false_button.config(state="disabled")

    def true_pressed(self):
        """
        Calls give_feedback with True as an argument.
        """
        self.give_feedback(self.quiz.check_answer("True"))

    def false_pressed(self):
        """
        Calls give_feedback with False as an argument.
        """
        self.give_feedback(self.quiz.check_answer("False"))

    def give_feedback(self, is_right):
        """
        If the user answers correctly, flash green for 1 second and increment the score.
        Otherwise, flash red for one second. Displays the next question.
        """
        if is_right:
            self.canvas.config(self.canvas, bg="green")
            self.canvas.itemconfig(self.question_text, fill="#FFFFFF")
            self.quiz.score += 1
            self.score_text.config(text=f"Score: {self.quiz.score}")
        else:
            self.canvas.config(self.canvas, bg="red")
            self.canvas.itemconfig(self.question_text, fill="#FFFFFF")
        self.window.after(1000, self.get_next_question)
