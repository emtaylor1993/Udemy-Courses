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

    public static boolean areLessThanOne(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1); 
    }

    public static boolean areHigherThanSix(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return (sumNumbers > sumDiceRolls && sumNumbers - sumDiceRolls < 3);
    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }
}