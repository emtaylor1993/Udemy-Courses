/**
 * TIP
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that simulates a waiter being tipped by calling
 *    the tipTheWater function.
 * 
 * @packages
 *    None
 */

public class Tip {
    public static void main(String[] args) {
        double bill = 53.5;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
        tipTheWaiter(bill);
    }

    /**
     * Function name: tipTheWaiter - calculates a tip and prints it.
     * @param bill (double).
     * 
     * Inside the function:
     *  1. Calculates a tip that's 15 percent of bill.
     *  2. Prints: Your service was wonderful! Please, accept this tip: $<tip>
     */
    public static void tipTheWaiter(double bill) {
        double tip = bill * 0.15;
        System.out.println("Your service was wonderful! Please, accept this tip: $" + tip);
    }
}