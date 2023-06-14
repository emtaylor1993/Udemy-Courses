# Tic Tac Toe

This is the most exciting challenge in this course. You're going to build a **two-player** game of Tic Tac Toe!

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F2e787600-d5f7-4855-b643-bee3714c9d96?alt=media&token=a9772676-799a-46f7-96ad-b38341e1d21d)

Open the challenge
------------------

From `Java Bootcamp Resources` -> `Module 1` -> `6. Array`, open `Challenge 6`.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fdb7a838d-1115-4e12-be18-c544b1a123f7?alt=media&token=2b117380-707e-43b2-a57c-bfc3bc7f83fb)

## Task 1: Create an array

The Tic Tac Toe board is a grid with three rows.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Ffbeb6251-acb8-4cfa-97be-bb9b1ddc333d?alt=media&token=73e5dfea-661f-498a-b27a-fcad47e4e5da)

Each row has three '`_`' characters. Your first task is to store these characters in an array.

## Task 2: Print the array

Write a function that prints the board. Call the function after creating the board.

```java
//Task 1: Create a board: char[][] board
﻿//Task 2:  Call the function: printBoard(board);
```
```java
/**
 * Function name - printBoard()
 * @param board (char[][])
 *
 * Inside the function:
 *   1. print a new line.
 *   2. print the board.
 *    - separate each row by two lines.
 *    - each row precedes a tab of space
 *    - each character in the grid has one space from the other character
  */
```
Inside the function:

-  Print a new line.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F1e251fe6-175f-48d7-a412-e280c3204e97?alt=media&token=10b15ceb-92a8-425f-a425-aa8a724c8f97)


-   add a tab of space before each row.
-   add a space after printing each character.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Ff8c9dd4f-cb91-47fe-9a38-4b6b9db4b221?alt=media&token=990640dd-3478-4aff-b43d-db54e3aa5514)

## Good Luck!

# Tic Tac Toe - Part 2

If you made it to part 2, then you were able to achieve this output:

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F9e1ba1b4-2425-415a-85e7-29de7165c6ee?alt=media&token=3c371e8a-6329-40bf-907f-3ae233feae0f)

The next step is to let the players take turns on the board:

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F10d21001-253e-45f2-9dcb-5ba6c8dbf0f1?alt=media&token=280aadac-6d53-4dba-b804-55ea95245ba1)

Inside the workbook, `Scanner` was declared as a `class` variable. That's because you'll need to access `Scanner` from more than one place inside the class.


```java
public class TicTacToe {

       Scanner scan = new Scanner(System.in);

       public static void main(String[] args) {
          ﻿//...
     ﻿  }
```

Task 3: Taking turns
--------------------

The maximum number of turns is 9. Set up a `for` loop that runs 9 times and prints the counter.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fe1f6561d-4f56-45f2-ae01-754503a1f7cf?alt=media&token=036a3546-12b9-4690-9b08-86b30fb780c1)

Each run represents a turn, such that X goes first.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F39b1dee0-77ae-4da3-917d-33aa0ca8399c?alt=media&token=a14cd8ed-96e7-47e4-9823-707c06303027)

**Hint:** `X` plays when the counter is even, whereas `O` plays when the counter is odd. Set up a condition that alternates between printing `Turn: X` and `Turn: O`.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fa3b86a73-b641-4f22-a247-38d01ee3f645?alt=media&token=fa61bbba-0a62-4bd6-9125-7f1372c7292c)

Task 4: Write a function
------------------------

Write a function that asks the user to choose a spot. As you write the function, call it for each turn.

```java
if (﻿X turn) {
    Task 4﻿: call askUser﻿(board)﻿.
} else {
    Task 4﻿: call askUser﻿(board)﻿.
}
```

1\. Function name: The name of the function is `askUser()`. It lets the player choose a spot on the board.

```java
/**
 * Function name -- askUser <-------
 * @param board (char[][] board)
 * @return spot (int[])
 *
 * Inside the function
 *     1. Asks the user: - pick the row and column:
 *     2. If the spot is taken, ask the user to choose again.
 *     3. Return the row and column in an int[] array.
 *
 */
```

2\. Parameters: The function takes one parameter: `char[][] board`.

```java
/**
 * Function name -- askUser
 * @param board (char[][] board) <--------
 * @return spot (int[])
 *
 * Inside the function
 *  1. Asks the user: - pick the row and column:
 *  2. If the spot is taken, ask the user to choose again.
 *  3. Return the row and column in an int[] array.
 *
 */
```

**3**. Return value: The function returns the spot. It will be an array that holds two numbers: the row and column.

```java
/**
 * Function name -- askUser
 * @param board (char[][] board)
 * @return spot (int[]) <-------
 *
 * Inside the function
 *  1. Asks the user: - pick the row and column:
 *  2. If the spot is taken, ask the user to choose again.
 *  3. Return the row and column in an int[] array.
 *
 */
```

Inside the function:

-   Ask the player to pick a spot on the grid and return it

```java
/**
 * Function name -- askUser
 * @param board (char[][] board)
 * @return spot (int[])
 *
 * Inside the function <---
 *  1. Asks the user: - pick a row and column number: <---
 *  2. If the spot is taken, ask the user to choose again.
 *  3. Return the row and column in an int[] array. <---
 *
 */
```

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fb09715c0-efc6-46a7-b31d-dde1da1f4ea0?alt=media&token=30fdd100-9846-4a59-915f-6e87db26c580)

The user will write their numbers **beside** each question. Then, store both numbers in the `int[]` array.

Ignore the second step for now. You can move on to task 5.

```java
/**
 * Function name -- askUser
 * @param board (char[][] board)
 * @return spot (int[])
 *
 * Inside the function
 *  1. Asks the user: - pick a row and column number:
 *
 *     *****  Ignore this step for now *****
 *  2. If the spot is taken, ask the user to choose again.
 *     *****  Ignore this step for now *****

 *  3. Return the row and column in an int[] array.
 *
 */
```

## Task 5: Populate the board

The function call returns the player's spot. Use that return value to index the board and populate it. Then, print the board:

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fed6c8f02-a925-43f9-bcff-b10263ce51cf?alt=media&token=3913fad2-893e-485e-99cf-de0660bf169c)

## Task 4: Revisited

We can't let the player pick a spot that's already taken.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F39433009-5560-47c2-87d6-0b1272616a6c?alt=media&token=da1f7e39-ff72-46a4-958f-15c82c9ac18d)

Inside the function:

-   Check if the spot on the board is taken. If so, prompt the user to choose again.

```java
/**
 * Function name -- askUser
 * @param board (char[][] board)
 * @return spot (int[])
 *
 * Inside the function <------
 *  1. Asks the user: - pick a row and column number:
 *  2. If the spot is taken, ask the user to choose again. <----
 *  3. Return the row and column in an int[] array. 
 *
 */
```

Hint: use a `while` loop! **Final output:**

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F7834d5bb-ad3a-45a1-961e-690c00f44a0c?alt=media&token=46e789e9-bb12-40e4-928c-4e31cf9c0510)

The player tried to pick a spot that was already taken (`0 0`). The game prompted them to pick another spot.

Good Luck!
----------

# Tic Tac Toe -- Part 3

If you made it here, then your game lets a player pick a spot on the board:

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fcd16f8f8-3534-4caa-8b2d-29e9aff4caf3?alt=media&token=d05bb1e2-bb47-4c02-998c-22d2c71500ce)

It also doesn't let them pick a spot that's already taken.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fc9dff6ad-e8f4-4a7a-919f-eea057008c52?alt=media&token=2f5e190b-89df-4d46-b59c-bd1b368e2953)

Onto the most exciting part! You will write code that determines the winner.

The `checkWin()` function
-------------------------

This function has to check for a win in every row:

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F624c34d7-6248-449a-8833-8996fe970907?alt=media&token=5677380f-b534-4203-94fc-4a0db35f9ce6)

every column:

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F455e475b-0681-4a2b-a024-15f957f77674?alt=media&token=193247f8-6694-41b2-a3e6-442ee611bd58)

the left diagonal:

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F1c536df1-14a5-4394-8292-100448ace363?alt=media&token=0f72e92d-4ffe-4dbc-87f6-f5657309caba)

and the right diagonal:

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F36a66a47-bafb-4fa8-b154-3aa779ddaf1d?alt=media&token=e66ed809-1df0-491b-a36c-0b6143321efe)

## Task 6: Write the function

1. Create a function called checkWin.

```java
/**
 * Function name - checkWin <-------
 * @param board (char[][])
 * @return count (int)
 *
 * Inside the function:
 *   1. checkRows(): Check every row for a straight X/O  (Task 7)
 *   2. checkColumns(): Check every column for a straight X/O  (Task 8)
 *   3. checkLeft(): Check the left diagonal for a straight X/O  (Task 9).
 *   4. checkRight(): Check the right diagonal for a straight X/O  (Task 10).
 */
```

2. Parameters: The function takes one parameter: char[][] board.

```java
/**
 * Function name - checkWin
 * @param board (char[][]) <--------
 * @return count (int)
 *
 * Inside the function:
 *   1. checkRows(): Check every row for a straight X/O  (Task 7)
 *   2. checkColumns(): Check every column for a straight X/O  (Task 8)
 *   3. checkLeft(): Check the left diagonal for a straight X/O  (Task 9).
 *   4. checkRight(): Check the right diagonal for a straight X/O  (Task 10).
 */
```

**3**. Return value: The function returns a count.

```java
/**
 * Function name - checkWin
 * @param board (char[][])
 * @return count (int) <----------
 *
 * Inside the function:
 *   1. checkRows(): Check every row for a straight X/O  (Task 7)
 *   2. checkColumns(): Check every column for a straight X/O  (Task 8)
 *   3. checkLeft(): Check the left diagonal for a straight X/O  (Task 9).
 *   4. checkRight(): Check the right diagonal for a straight X/O  (Task 10).
 */
```

Tasks 7 - 10 are function calls that return an int. 
```java
/**
 * Function name - checkWin
 * @param board (char[][])
 * @return count (int)
 *
 * Inside the function:
 *   1. checkRows(): Check every row for a straight X/O  (Task 7) <————
 *   2. checkColumns(): Check every column for a straight X/O  (Task 8) <————
 *   3. checkLeft(): Check the left diagonal for a straight X/O  (Task 9). <————
 *   4. checkRight(): Check the right diagonal for a straight X/O  (Task 10). <————
 */
```
Copy their definitions inside your class.

```java
public static int checkRows(char[][] board) {
    int count = 0;
    return count;
}


public static int checkColumns(char[][] board) {
    int count = 0;
    return count;
}


public static int checkLeft(char[][] board) {
    int count = 0;
    return count;
}


public static int checkRight(char[][] board) {
    int count = 0;
    return count;
}
```

Call each function inside checkWin().

```java
public static int checkWin(char[][] board) {    
    int rows = checkRows(board); 
    
    // Math.abs returns the absolute value of a given number, removing any negative sign. 
    if (Math.abs(rows) == 3) return rows; // If the block of code consists of only one line, you can omit the curly braces.
    
    int columns = checkColumns(board);
    if (Math.abs(columns) == 3) return columns;  
    
    int leftDiagonal = checkLeft(board);
    if (Math.abs(leftDiagonal) == 3) return leftDiagonal; 
    
    int rightDiagonal = checkRight(board);
    if (Math.abs(rightDiagonal) == 3) return rightDiagonal;
    
}
```

## Task 7


Call `checkWin` from your for loop in main. The loop should break if the returned count is 3 or -3.
```
     if (returned count == 3) {
        // 1. print: X wins
        // 2. break the loop
      } else if (returned count == -3) {
        // 1. print: O wins
        // 2. break the loop
       }
```

## Task 8: Checking every row

Tasks 7 - 10 are function calls that receive and return `int`.

```java
/**
 * Function name - checkWin
 * @param board (char[][])
 * @return count (int)
 *
 * Inside the function:
 *   1. checkRows(): Check every row for a straight X/O  (Task 7) <——
 *   2. checkColumns(): Check every column for a straight X/O  (Task 8)
 *   3. checkLeft(): Check the left diagonal for a straight X/O  (Task 9).
 *   4. checkRight(): Check the right diagonal for a straight X/O  (Task 10).
 */
```

`checkRows():` will check every row for a straight X or straight O:
 - In each row, add 1 to `count` if there's an X. 
 - Subtract 1 if there's an O.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fa6bf9e15-3738-466c-816a-dc7beefddf3b?alt=media&token=76aeac14-202e-4cca-b948-e58755109d84)

If `count` isn't 3 or -3, reset it and move to the next row.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F44d2d787-bf89-4fc1-b88f-4733fc685843?alt=media&token=ad3c800f-fbcb-476f-b093-cf89678e54e3)

A count of 3 means X won (conversely, a count of -3 means O won).

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F22a7348f-bb85-4558-bb03-611aeb85517b?alt=media&token=e9d1d70b-afbc-4b76-b93a-85f6f0cfdc0e)

If `count` is 3 **OR** -3, break the `checkWin` function by returning `count`.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F9cad9f3a-2133-405f-8a82-542389285633?alt=media&token=a1441bc7-77e1-4b63-baf6-1d78a0bd401b)

Notice that the game stops after a win.

## Task 9: Checking every column

```java
/**
 * Function name - checkWin
 * @param board (char[][])
 * @return count (int)
 *
 * Inside the function:
 *   1. checkRows(): Check every row for a straight X/O  (Task 7) 
 *   2. checkColumns(): Check every column for a straight X/O  (Task 8) <———
 *   3. checkLeft(): Check the left diagonal for a straight X/O  (Task 9).
 *   4. checkRight(): Check the right diagonal for a straight X/O  (Task 10).
 */
```
`checkColumns()`:  will check every column for a straight X or straight O:
-   The outer loop picks a column. The inner loop will index each row for that column.
-   When looking at the image below, think of `i` and `j`.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fab7708fb-fde2-4c0b-b431-1c8f076360dd?alt=media&token=323ef4d3-5a85-4000-9be4-266c7290f50f)

A player wins if one of the columns results in a `count` of 3 or -3:

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F37b30b0f-cbc2-41ef-a119-ff62c51bc0fe?alt=media&token=d01fef80-a188-4225-9f12-4a2711c488e3)

Test every column before you move to Task 9.

## Task 10: Checking the left diagonal

If none of the rows or columns result in a count of 3 or -3, reset the count to 0.

```java
/**
 * Function name - checkWin
 * @param board (char[][])
 * @return count (int)
 *
 * Inside the function:
 *   1. checkRows(): Check every row for a straight X/O  (Task 7) 
 *   2. checkColumns(): Check every column for a straight X/O  (Task 8) 
 *   3. checkLeft(): Check the left diagonal for a straight X/O  (Task 9). <———
 *   4. checkRight(): Check the right diagonal for a straight X/O  (Task 10).
 */
```
`checkLeft()`: will check the left diagonal for a straight X or O:
-   Do you see a pattern in the indices?
-   You don't need a nested loop. Use a single `for` loop.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fa300009e-ddb2-497a-a78a-bb31bc4ee5b6?alt=media&token=cbcba0e8-d872-4ca2-a0b9-7c451332f38b)

**Output**:

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F0a037bcc-3cae-4344-8347-80f1d2a86910?alt=media&token=9c96feb4-d9be-423e-9668-fbce66a5ea27)

## Task 11: Checking the right diagonal

If none of the rows, columns, or left diagonal result in a win, reset the count to 0.

Now, check the right diagonal for a straight X or O.

```java
/**
 * Function name - checkWin
 * @param board (char[][])
 * @return count (int)
 *
 * Inside the function:
 *   1. checkRows(): Check every row for a straight X/O  (Task 7) 
 *   2. checkColumns(): Check every column for a straight X/O  (Task 8) 
 *   3. checkLeft(): Check the left diagonal for a straight X/O  (Task 9). 
 *   4. checkRight(): Check the right diagonal for a straight X/O  (Task 10). <———
 */
```

`checkRight():` will check the right diagonal for a straight X or O:

-   You don't need a nested loop. Use a single `for` loop.
-   The pattern here is a bit tricky:

    -   2 - **0** = **2**
    -   2 - **1** = **1**
    -   2 - **2** = **0**

Compare the bolded numbers from the hint to the indices below:

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F08641a78-c14b-44f7-97e4-59d3f55eba65?alt=media&token=d9d090bb-f92b-42f9-bbd0-dd0de185dd9c)

**Output**:

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fc5a8d128-408b-43de-91c8-53bdfe8a0000?alt=media&token=141058d6-a1ee-4f71-bef7-22c47ccb40a3)

## Task 11: What if it's a tie?

If the game goes all nine turns and nobody wins, print: "it's a tie!".

## Task 12: Test your code!

Test your code for every type of win:

-   straight row

-   straight column

-   left diagonal

-   right diagonal.

Test each case for X and O. Also, see if your code works in the event of a tie.

If everything works, you have my sincere congratulations! Tic tac toe is not an easy project, and going through this challenge is a strong testament to your growth.

Good Luck!
----------
