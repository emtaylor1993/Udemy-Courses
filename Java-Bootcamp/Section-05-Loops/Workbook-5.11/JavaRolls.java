/**
 * JAVA ROLLS
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that simulates a dice rolling game.
 * 
 * @packages
 *    Java Utilities (Scanner)
 */

import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diceRoll;
        int score = 0;

        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        
        System.out.println("Great, here are the rules:\n");
        System.out.println("- If you roll a 6, the game stops.");
        System.out.println("- If you roll a 4, nothing happens.");
        System.out.println("- Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
        
        while (true) {
            scan.nextLine();
            diceRoll = rollDice();
            if (diceRoll == 6) {
                System.out.println("You rolled a " + diceRoll + ". End of game.");
                break;
            } else if (diceRoll == 4) {
                System.out.println("You rolled a " + diceRoll + ". Zero points. Keep rolling.");
                continue;
            } else {
                System.out.println("You rolled a " + diceRoll + ". One point. Keep rolling.");
                score++;
            }
        }

        System.out.println("Your score is: " + score);
        if (score >= 3) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose. :(");
        }

        scan.close();
    }

    /**
     * Function Name: rollDice
     * @return randomNumber (int)
     * 
     * Inside the Function:
     *  - return a random number between 1 and 6
     */
    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        int randomInt = (int) randomNumber + 1;
        return randomInt;
    }
}