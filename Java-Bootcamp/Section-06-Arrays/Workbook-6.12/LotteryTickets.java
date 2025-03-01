/**
 * LOTTERY TICKETS
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that prints out lottery tickets.
 * 
 * @packages
 *    Java Utilities (Arrays)
 */

import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {        
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
        ticket2[2] = 54;

        System.out.print("Ticket 1 numbers: ");
        printTicketNumbers(ticket);  

        System.out.print("Ticket 2 numbers: ");
        printTicketNumbers(ticket2);  
    } 
    
    /**
     * Function Name: printTicketNumbers
     * @param ticket    (int[])
     * 
     * Inside the Function:
     *  1. Use a loop to print the numbers in one line.
     *  2. After the loop, print two new lines.
     */
    public static void printTicketNumbers(int[] ticket) {
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " ");
        }
        System.out.print("\n\n");
    }
}

