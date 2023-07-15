# Exercise 3 - Treasure Map

## Instructions
You are going to write a program that will mark a spot with an "X". In the starting code, you will find a variable called map. This map contains a nested list. When map is printed, this is what the nested list looks like:

[['⬜️', '⬜️', '⬜️'],['⬜️', '⬜️', '⬜️'],['⬜️', '⬜️', '⬜️']]

This is a bit hard to work with, so we've formatted the lines to look like this:

['⬜️', '⬜️', '⬜️']
['⬜️', '⬜️', '⬜️']
['⬜️', '⬜️', '⬜️']

Your job is to write a program that allows you to mark a square on a map using a two-digit system. The **first digit** in the input will specify the **column**. The **second digit** will specify the **row**. So an input of 23 should place an X at the position shown below:

![image](https://github.com/emtaylor1993/Udemy-Courses/assets/93065901/70f85332-c0da-41dc-bc2a-3330f9121d30)

## Example Input 1
Column 2, Row 3 would be entered as:
```
23
```

## Example Output 1
```
['⬜️', '⬜️', '⬜️']
['⬜️', '⬜️', '⬜️']
['⬜️', 'X', '⬜️']
```

## Example Input 2
Column 3, Row 1 would be entered as:
```
31
```

## Example Output 2
```
['⬜️', '⬜️', 'X']
['⬜️', '⬜️', '⬜️']
['⬜️', '⬜️', '⬜️']
```

e.g. When you hit **run**, this is what should happen:

![4 3 treasure map](https://github.com/emtaylor1993/Udemy-Courses/assets/93065901/c320a8fc-66ba-4115-b453-90bcafeb0d7a)
