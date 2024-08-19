/**
 * BLACKJACK
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that simulates the Blackjack
 *    card game.
 * 
 * @packages
 *    Java Utilities (Scanner)
 */

import java.util.Scanner;

public class Blackjack {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();
  
        int cardNumber1 = drawRandomCard();
        int cardNumber2 = drawRandomCard();
        String card1 = cardString(cardNumber1);
        String card2 = cardString(cardNumber2);

        if (cardNumber1 > 10) {
            cardNumber1 = 10;
        }

        if (cardNumber2 > 10) {
            cardNumber2 = 10;
        }

        int cardSum = cardNumber1 + cardNumber2;

        System.out.println("\n You got a \n" + card1 + "\n and a \n" + card2);
        System.out.println("Your total is " + cardSum);

        int dealNumber1 = drawRandomCard();
        int dealNumber2 = drawRandomCard();
        String deal1 = cardString(dealNumber1);
        String deal2 = cardString(dealNumber2);

        if (dealNumber1 > 10) {
            dealNumber1 = 10;
        }

        if (dealNumber2 > 10) {
            dealNumber2 = 10;
        }

        int dealSum = dealNumber1 + dealNumber2;

        System.out.println("The dealer shows \n" + deal1 + "\nand has a card facing down \n" + faceDown());
        System.out.println("\nThe dealer's total is hidden.");
       
        String choice = hitOrStay();
        while (true) {
            if (choice.equals("hit")) {
                int cardNumber3 = drawRandomCard();
                String card3 = cardString(cardNumber3);
                if (cardNumber3 > 10) cardNumber3 = 10;
                cardSum += cardNumber3;
                System.out.println("\nYou get a \n" + card3);
                System.out.println("Your new total is " + cardSum);

                if (cardSum > 21) {
                    System.out.println("Bust! Player loses.");
                    System.exit(0);
                }

                choice = hitOrStay();
            } else if (choice.equals("stay")) {
                System.out.println("\nDealer's Turn");
                System.out.println("\n The dealer's cards are \n" + deal1 + "\nand a\n" + deal2);
                System.out.println("The dealer's total is " + dealSum);
                while (dealSum < 17) {
                    int dealNumber3 = drawRandomCard();
                    String deal3 = cardString(dealNumber3);
                    if (dealNumber3 > 10) dealNumber3 = 10;
                    dealSum += dealNumber3;
                    System.out.println("\nDealer gets a\n" + deal3);
                    System.out.println("\nDealer's new total is " + dealSum);

                    if (dealSum > 21) {
                        System.out.println("Bust! Dealer loses.");
                        System.exit(0);
                    }
                }
                break;
            }
        }
    
        if (cardSum > dealSum) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Dealer wins!");
        }

        scan.close();
    }

    /**
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard() {
        return (int) (Math.random() * 13) + 1;
    }

    /** 
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber) {
        switch (cardNumber) {
            case 1:
                return
                    "   _____ \n"+
                    "  |A _  |\n"+ 
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n";
            case 2:
                return
                    "   _____ \n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
            case 3:
                return
                    "   _____ \n" +
                    "  |3    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n";
            case 4:
                return
                    "   _____ \n"+
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n";
            case 5:
                return
                    "   _____ \n"+
                    "  |5    |\n"+
                    "  | o o |\n"+
                    "  |  o  |\n"+
                    "  | o o |\n"+
                    "  |____S|\n";
            case 6:
                return
                    "   _____ \n"+
                    "  |6    |\n"+
                    "  | o o |\n"+
                    "  | o o |\n"+
                    "  | o o |\n"+
                    "  |____6|\n";
            case 7:
                return
                    "   _____ \n"+
                    "  |7    |\n"+
                    "  | o o |\n"+
                    "  |o o o|\n"+
                    "  | o o |\n"+
                    "  |____7|\n";
            case 8:
                return
                    "   _____ \n"+
                    "  |8    |\n"+
                    "  |o o o|\n"+
                    "  | o o |\n"+
                    "  |o o o|\n"+
                    "  |____8|\n";
            case 9:
                return
                    "   _____ \n"+
                    "  |9    |\n"+
                    "  |o o o|\n"+
                    "  |o o o|\n"+
                    "  |o o o|\n"+
                    "  |____9|\n";
            case 10:
                return
                    "   _____ \n"+
                    "  |10  o|\n"+
                    "  |o o o|\n"+
                    "  |o o o|\n"+
                    "  |o o o|\n"+
                    "  |___10|\n";
            case 11:
                return
                    "   _____ \n"+
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            case 12:
                return
                    "   _____ \n"+
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
            case 13:
                return 
                    "   _____ \n"+
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
            default:
                return "INVALID OPTION";
        }
    }

    /**
     * Function name - faceDown
     * @return (String)
     * 
     * Inside the function:
     *  1. Returns a String drawing of a facedown card
     */
    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** 
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    public static String hitOrStay() {
        System.out.println("Please write 'hit' or 'stay'");
        String choice = scan.nextLine();
        while (!choice.equals("hit") && !choice.equals("stay")) {
            System.out.println("Invalid choice. Please write 'hit' or 'stay'");
            choice = scan.nextLine();
        }

        return choice;
    }
}