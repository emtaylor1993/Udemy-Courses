# Exercise 2 - BMI 2.0

## Instructions
Write a program that interprets the Body Mass Index (BMI) based on a user's weight and height.

It should tell them the interpreration of their BMI based on the BMI value.
- Under 18.5 they are underweight.
- Over 18.5 but below 25 they have a normal weight.
- Over 25 but below 30 they are slightly overweight.
- Over 30 but below 35 they are obese.
- Above 35 they are clinically obese.

![image](https://github.com/emtaylor1993/Udemy-Courses/assets/93065901/6b647d71-3999-4387-a6b4-439983d338a3)

The BMI is calculated by dividing a person's weight (in kg) by the square of their height (in m):

![image](https://github.com/emtaylor1993/Udemy-Courses/assets/93065901/e1467af2-71e4-49d2-ada7-1b05a5e28e16)

**Warning:** You should **round** the result to the nearest whole number. The interpretation message needs to include the words in bold from the interpretations above.

## Example Input
```
weight = 85
height = 1.75
```

## Example Output
```
85 / (1.75 x 1.75) = 27.755102040816325
Your BMI is 28, you are slightly overweight.
```

e.g. When you hit **run**, this is what should happen:

![3 2 BMI calc gif](https://github.com/emtaylor1993/Udemy-Courses/assets/93065901/037a2fad-0672-464f-95db-f19a7a403209)
