/**
 * GUESS
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that simulates a number guessing game.
 * 
 * @packages
 *    Java Utilities (Scanner)
 */

import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNumber = 4;

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int guess = scan.nextInt();

        while (guess != secretNumber) {
            System.out.print("Guess again: ");
            guess = scan.nextInt();
        }

        System.out.println("You got it!");        
        scan.close();
    }
}