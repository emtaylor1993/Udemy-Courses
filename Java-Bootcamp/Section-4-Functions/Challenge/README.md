# **Rock paper scissors**

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F7b884cfe-1f4e-4c0d-8bc6-eb825ead8eeb?alt=media&token=91f1af42-bbf9-4be9-ada0-ca1d44662f48)

## Open the challenge

From `Java Bootcamp Resources`, open the **`Challenge 4`** folder.

![Screen Shot 2022-10-20 at 9.59.00 PM.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F2741fff1-5a2f-4038-89b1-e8860c25ac7d?alt=media&token=de17aafa-6ab7-4805-a89e-63c5c4fe1656)


## Task 1: See if the user wants to play

Use `Scanner` to pick up the user's response.

`>>Let's play Rock Paper Scissors.`

`>>When I say 'shoot', Choose: rock, paper, or scissors.`

`>>`

`>>Are you ready? Write 'yes' if you are`

## Task 2: Set up the game.

```
- if the answer is yes:
   -- print: Great!
   -- print: rock - paper - scissors, shoot!
   -- pick up user's choice.
   -- get the computer choice (can be done after task 3).
   -- get the result (can only be done after task 4)
   -- print everything (can only ﻿b﻿e done after task 5).
- else:
   -- print: Darn, some﻿ other time...!
```

Here, the user would enter rock paper or scissors. Using `Scanner`, pick up their choice.

```
- if the answer is yes:
   -- print: Great!
   -- print: rock - paper - scissors, shoot!
   -- pick up user's choice. <----------
   -- get the computer choice (can be done after task 3).
   -- get the result (can only be done after task 4)
   -- print everything (can only be done after task 5).
- els﻿e﻿:
   -- print: Darn, some other time...
```
There are more instructions for the if statement. You cannot do them until you finish tasks 3, 4, and 5.

```
- if the answer is yes:
   -- print: Great!
   -- print: rock -- paper -- scissors, shoot!
   -- pick up user's choice.
   -- get the computer choice (can be done after task 3). <------
   -- get the result (can only be done after task 4) <-------
   -- print everything (can only be done after task 5). <--------
- els﻿e﻿:
   -- print: Darn, some other time...
```

So, you're left with the `else` block. If the user doesn't enter "yes", print: **Darn, some other time...!**

```
- if the answer is yes:
   -- print: Great!
   -- print: rock -- paper -- scissors, shoot!
   -- pick up user's choice.
   -- get the computer choice (can be done after task 3﻿)﻿.
   -- get the result (can only be done after task 4﻿)
   -- print everything (can only be done after task 5﻿)﻿.
- else﻿: <---------------
   -- print: Darn, some other time...        ﻿
```

## **Task 3: Generate a random choice**

You'll write a function that picks randomly between rock paper scissors.

- Function name:

```java
/**
 * Function name: computerChoice <--------
 * @return a choice (String).
 *
 * Inside the function:
 *   1. Picks a random number between 0 and 2.
 *   2. if 1: return the choice 'rock'
 *      if 2: return the choice 'paper'
 *      if 3: return the choice 'scissors'
 */
```

- Parameters: The function takes no parameters.

- Return type:

```java
/**
 * Function name: computerChoice
 * @return a choice (String). <------
 *
 * Inside the function:
 *   1. Picks a random number between 0 and 2.
 *   2. if 0: return the choice 'rock'
 *      if 1: return the choice 'paper'
 *      if 2: return the choice 'scissors'
 */
```

Inside the function, generate a random number between 0 and 2. Based on the result, return rock, paper or scissors.

```java
/**
 * Function name: computerChoice
 * @return a choice (String).
 *
 * Inside the function: <----------
 *   1. Picks a random number between 0 and 2.
 *   2. if 0: return the choice 'rock'
 *      if 1: return the choice 'paper'
 *      if 2: return the choice 'scissors'
 */
```

Call the function and store the computer choice.

```
- if the answer is yes:
   -- print: Great!
   -- print: rock -- paper -- scissors, shoot!
   -- pick up user's choice.
   -- get the computer choice (can be done after task 3). <------------
   -- get the result (can only be done after task 4)
   -- print everything (can only be done after task 5).
- else:
   -- print: Darn, some other time...
```

## Test your code

Add two temporary print statements.

```
- if the answer is yes:
   -- print: Great!
   -- print: rock -- paper -- scissors, shoot!
   -- pick up user's choice.
   -- get the computer choice (can only be done after task 3﻿)

     System.out.println("\nYou chose:        " + yourChoice); <---------
     System.out.println("The computer chose: " + computerChoice); <--------

   -- get the result          (can only be done after task 4)
   -- print everything        (can only be done after task 5).
- else:
   -- print: Darn, some other time...
```

The end result should print your choice and the computer's choice.

# **Rock paper scissors part 2**

Part 2 will determine a winner.

## Task 4: the game result

1\. Function name:

```java
/**
 *  Function name: result   <-------
 *  @param yourChoice (String)
 *  @param computerChoice (String)
 *  @return result (String).
 */
```

2\. Parameters:

```java
/**
 *  Function name: result -
 *  @param yourChoice (String)  <-------
 *  @param computerChoice (String) <-------
 *  @return result (String).
 */
```

3\. Return value:

```java
/**
 *  Function name: result
 *  @param yourChoice (String)
 *  @param computerChoice (String)
 *  @return result (String). <--------
 */
```

Set up a series of `if - else if - else` statements according to the scenarios below:
```java
/**
 *
 * Function name: result - It returns the result of the game.
 *  @param yourChoice (String)
 *  @param computerChoice (String) 
 *  @return result (String) 
 * 
 * Inside the function:
 *   1. result is "You win" if:
 * 
 *       You: "rock"      Computer: "scissors"
 *       You: "paper"     Computer: "rock"
 *       You: "scissors"  Computer: "paper"
 * 
 *   2. result is "You lose" if:
 * 
 *       Computer: "rock"      You: "scissors"
 *       Computer: "paper"     You: "rock"
 *       Computer: "scissors"  You: "paper"
 * 
 *   3. result is "It's a tie" if:
 * 
 *       Your choice equals computer choice.
 *   
 *   4. Otherwise, print "INVALID CHOICE" and exit the program.
 *    
 *       
 */
```

Call the function and print the result.

```
- if the answer is yes:
  -- print: Great!
  -- print: rock -- paper -- scissors, shoot!
  -- pick up user's choice.
  -- get the computer choice.
  -- System.out.println("\nYou chose:        " + yourChoice);
  -- System.out.println("The computer chose: " + computerChoice);

  -- get the result              <------------
  -- System.out.println(result); <------------

  -- print everything        (can only be done after task 5).
- else:
  -- print: Darn, some other time...!
```

Before you move to task 5, this is a good place to test your code. The end result should print your choice, the computer's choice, and the result.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F91169998-c75d-4134-b91c-560e5a85ebfd?alt=media&token=794d92c5-1547-4195-9f3b-5b5ecea5794c)

Run it a few more times. It should keep returning the correct result.

## Task 5: print everything at once

Remove all your print statements from `main()`. Then, create the following function:

1\. Function name:

```java
/**
 * Name: printResult  <--------
 * @param yourChoice (String)
 * @param computerChoice (String)
 * @param result (String)
 *
 * Inside the function:
 *  1. prints everything:
 *      -- prints: You chose:          <your choice>
 *      -- prints: The computer chose: <computer choice>
 *      -- prints:                     <result>
 */
```

2\. Parameters:

```java
/**
 * Name: printResult
 * @param yourChoice (String) <------
 * @param computerChoice (String) <------
 * @param result (String)  <-------
 *
 * Inside the function:
 *  1. prints everything:
 *      -- prints: You chose:          <your choice>
 *      -- prints: The computer chose: <computer choice>
 *      -- prints:                     <result>
 */
```

3\. Return value: `void`.

4\. Inside the function:

```java
/**
 * Name: printResult
 * @param yourChoice (String)
 * @param computerChoice (String)
 * @param result (String)
 *
 * Inside the function:  <------
 *  1. prints everything:
 *      -- prints: You chose:          <your choice>
 *      -- prints: The computer chose: <computer choice>
 *      -- prints:                     <result>
 */
```

Back in the `if` statement, call `printResult()` and you're done!

```
- if the answer is yes:
   -- print: Great!
   -- print: rock -- paper -- scissors, shoot!
   -- pick up user's choice.
   -- get the computer choice.
   -- get the result.
   -- print everything <------
- else:
   -- print: Darn, some other time...!
```

## Run your code


![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fdd2570dc-cb51-4b5d-8d60-567413c367f5?alt=media&token=99fc526b-a267-40fd-a1ab-72b1cc76ab61)

If it feels like you're playing a real game of rock-paper-scissors, then you're finished!

## Good luck!

