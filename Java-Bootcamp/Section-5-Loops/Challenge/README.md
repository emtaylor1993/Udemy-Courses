# Blackjack

Blackjack is the most popular table game at casinos. You're going to build a simple version of Blackjack.

**Part 1: Starting the game**

-   In Blackjack, the player plays against the dealer.

-   The dealer gives the player two cards faceup.

-   The dealer also starts with two cards. But, only one of the dealer's cards is faceup. The other is facedown.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F49d4c97e-1a8e-4a9a-bd2a-030102212f91?alt=media&token=727ec955-62e1-4cfc-b074-07022eec4730)

**Part 2: During the game**

-   First, it's the player's turn. The player can decide to **hit** or **stay**.

    -   **hit**: draw another card.

    -   **stay**: do nothing.

-   If the player decides to hit, and their hand value exceeds 21, they go **bust** (lose).

-   Once the player decides to stay, the dealer reveals the hidden card.

-   Then, the dealer must **hit** until their cards total up to 17. At 17 points or higher, the dealer must stay.

-   You win if your hand value is higher than the dealer's hand.

-   You win if the dealer goes bust (exceeds 21)

-   You lose if the dealer's hand value is higher than yours.

**Full output:**

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fc81f4e58-142d-4747-8a98-c363480dcf07?alt=media&token=eaedf962-f3aa-4089-9f36-213562e1158a)

## Launch the challenge

From `Java Bootcamp Resources` -> `Module 1` -> `5. Loops`, open `Challenge 5`.

## Task 1
Define the `drawRandomCard` function.

```java
    /**
     * Function name -- drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
```

## Task 2

Make a function that receives a card number and returns the `String` drawing. You can grab the cards from `cards.txt`. Use the doc comment inside the workbook as a guide.

## Task 3

Write code that waits for the user to press enter.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F27a6512b-c2ca-4541-919f-1bfb6ef57539?alt=media&token=1896e076-78ba-4813-9a3d-4247a1ba85b1)

## Task 4

When the game starts, the dealer will give you two cards faceup. Get the code to deal you two random cards and print them:

```
-- Get two random cards.
-- Print them: (﻿new line﻿) You get a (﻿new line﻿) <random card> and a <random card>
```

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F7b49ec9b-774c-43cc-8962-5788a71d5df9?alt=media&token=75ccec2e-370f-432b-874c-dad2148c8f3b)

## Task 5

After you print your cards, print the hand value. The hand value is the sum of your card values.

```java
your total is: <hand value>
```

In blackjack, the face cards (Jack, Queen, and King) have values of 10.

**Hint**: look into `Math.min`.

**Example output:**

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Ff2f3655b-bbe9-4d1b-9657-51dbbf4549e3?alt=media&token=4d6b8516-8860-4931-b0f0-6741b7eeed6d)

## Task 6

The dealer gets two cards as well. Print the dealer's first card, and print the next one facedown. You can find the `String` for a facedown card being returned from a function called: `faceDown()`.

```
1. print:

 (﻿new line﻿) The dealer shows (﻿new line﻿) <random card> and
 has a card facing down (﻿new line﻿) <facedown card>﻿;

2. print:
 (﻿new line﻿) The dealer's total is hidden
```

That's all for part 1. Your final output should appear as follows:

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F427749b6-4fd7-4cf3-824a-c72d6a28640c?alt=media&token=826ac8b9-47c9-42f5-9c31-f31312350f39)

## Good luck!

# Blackjack (part 2)

In part 1, you wrote the logic for starting the game.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F6dab8e0f-4f4f-42ef-a092-40d7d9571d78?alt=media&token=8b016f96-ab2e-465f-9185-7e16986b599a)

In part 2, you will write the logic for playing the game. Recall:

-   First, it's the player's turn. The player can decide to **hit** or **stay**.

    -   **hit**: draw another card.

    -   **stay**: do nothing.

-   If the player decides to hit, and their hand value exceeds 21, they go **bust** (lose).

-   Once the player decides to stay, the dealer reveals the hidden card.

-   Then, the dealer must **hit** until their total gets to 17. At 17 points or higher, the dealer's turn ends.

-   You win if your hand value is higher than the dealer's hand.

-   You win if the dealer goes bust (exceeds 21)

-   You lose if the dealer's hand value is higher than yours.

**Final output:**

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F6aaeebfa-1824-497a-be53-81ec2cea8bf6?alt=media&token=6ba7057d-efde-46d9-81cb-5ca07ec49384)

## Task 7

Make a function that asks the user to hit or stay.

```java
/**
 *  Function name -- hitOrStay
 *  @return (String)
 *
 * Inside the function:
 *   1. Asks the user to hit or stay.
 *
 *   2. If the user doesn't enter "hit" or "stay"
 *       Run a while loop
 *       During each run, println: Please write 'hit' or 'stay'
 *
 *   3. Returns the user's option
 */
```

If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:

`"Please write 'hit' or 'stay'"`

The condition for this while loop is kind of tricky. I recommend using a while loop that runs forever and breaking it when it's appropriate. Test your function by calling it from `main()`.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F4def7840-d792-4366-b0e1-9617e3c33497?alt=media&token=2aa0f178-46dd-4c36-91a6-59cd54f8d224)

## Task 8

In Task 8, you will keep asking the player to hit or stay. In other words, make a `while` loop that runs forever. Then, call your function inside the `while` loop. Every time the player hits, draw a new card and calculate their new total. Then, print:

- `(new line) You get a (new line) <show new card>`

- ` your new total is <total>`

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F2a057fac-7aae-4507-8fc6-3be0a7315ff9?alt=media&token=88113175-aaa0-4508-8f26-66725eeabbac)

-   Once the player 'stays', break the loop.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F229019d8-b604-41cb-8c34-e5f811cbc687?alt=media&token=39e43558-e61e-4e4e-bc11-8aa097f95d2c)

## Task 9

While the player is hitting, if they go bust (total exceeds 21) print: `"Bust! Player loses"`. Then, shut down the game with `System.exit(0)` (`System.exit(0)` terminates execution).

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F997ca750-bd0a-45e5-b490-3fbb34fedad3?alt=media&token=b0bf8ad9-9788-4c53-a179-dd1a6bbb307a)

## Task 10

After the player chooses to stay, it becomes the dealer's turn. First, reveal the dealer's hidden card.

Print:

- `(new line) Dealer's turn`

- `(new line) The dealer's cards are (new line) <dealer card 1> (new line) and a (new line) <dealer card 2>`

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F0b530327-85a8-4898-bf05-b32db51b8f4c?alt=media&token=6545478f-ff33-481b-aed5-70691677a117)

## Task 11

The dealer must keep "hitting" until their total gets to 17.
Every time the dealer hits, print:

- `(new line) Dealer gets a (new line) <show new card>`

- `(new line) Dealer's total is <dealer's total>`

At 17 points or higher, end the dealer's turn.



![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F240e9da8-ade9-416f-bfab-4e410b80e0b6?alt=media&token=0387b555-cbe2-4468-9a56-5e457cac50c9)

## Task 12

If the dealer's total is higher than 21, print: `"Bust! Dealer loses"` and end the game with `System.exit(0)`.

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F9fa97e5c-0c34-453c-9e57-636e75b1d6a1?alt=media&token=ce799ff8-8c20-4d98-93e2-b0aab4798f72)

## Task 13

If at this point, the program didn't terminate, compare the dealer and player's hand values.

-   If the player's hand value is higher, print: `Player wins!`

-   Otherwise, print: `Dealer wins!`.

**Final output:**

![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F3f3d6c9e-c7b2-48dc-97e7-2a895ff6b654?alt=media&token=4af2bff2-880b-4184-bfca-1928f4adf473)

## Good luck!
