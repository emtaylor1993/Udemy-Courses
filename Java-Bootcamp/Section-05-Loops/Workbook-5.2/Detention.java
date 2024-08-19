/**
 * DETENTION
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java for loops.
 * 
 * @packages
 *    Java Utilities (Scanner)
 */

import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        String line = scan.nextLine();

        for (int i = 0; i < 99; i++) {
            System.out.println((i + 1) + ". " + line);
        }

        scan.close();
    }
}
