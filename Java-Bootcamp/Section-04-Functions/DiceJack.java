/**
 * DICE JACK
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that simulates a dice roll.
 * 
 * @packages
 *    Java Utilities (Scanner)
 */

import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        int sumDiceRolls = roll1 + roll2 + roll3;

        System.out.print("Enter three numbers between 1 and 6: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        int sumNumbers = number1 + number2 + number3;

        if (areLessThanOne(number1, number2, number3) || areHigherThanSix(number1, number2, number3)) {
            System.out.println("You entered numbers outside of the valid range.");
            System.exit(0);
        }

        System.out.println("Your Sum: " + sumNumbers + " Computer Sum: " + sumDiceRolls);

        if (userWon(sumNumbers, sumDiceRolls)) {
            System.out.println("\nCongratulations, you won!");
        } else {
            System.out.println("\nBetter luck next time!");
        }

        scan.close();
    }

    /**
     * Function Name: areLessThanOne
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return     (boolean)
     * 
     * Returns true if any parameters are less than one.
     */
    public static boolean areLessThanOne(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1); 
    }

    /**
     * Function Name: areHigherThanSix
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return     (boolean)
     * 
     * Returns true if any parameters are greater than six.
     */
    public static boolean areHigherThanSix(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    /**
     * Function Name: userWon
     * @param sumNumbers   (int)
     * @param sumDiceRolls (int)
     * @return             (boolean)
     * 
     * Returns true if the user won.
     */
    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return (sumNumbers > sumDiceRolls && sumNumbers - sumDiceRolls < 3);
    }

    /**
     * Function Name: rollDice
     * @return (int)
     * 
     * Returns a random number between 1 and 6.
     */
    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }
}