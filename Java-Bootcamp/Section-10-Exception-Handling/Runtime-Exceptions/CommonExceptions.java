/**
 * COMMON EXCEPTIONS
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java common runtime exceptions.
 * 
 * @packages
 *    Java Utilities (Scanner)
 */

import java.util.Scanner;

public class CommonExceptions {
    public static void main(String[] args) {

        // To see the exceptions, remove the code and uncomment the lines.

        //**************ArrayIndexOutOfBounds**************//
        int[] grades = new int[] {96, 65, 56, 86};
        System.out.println(grades[3]);
        // System.out.println(grades[4]);

       //**************NullPointerException**************//
        String[] names = new String[7]; 
        names[0] = "John";
        names[1] = "Jim";
        names[2] = "Joe";

        for (String name : names) {
            if (name != null) {
                System.out.println(name.toUpperCase());
            }

            // System.out.println(name.toUpperCase());
        }

        //**************InputMismatchException**************//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a random integer");
        if (scanner.hasNextInt()) {
            scanner.nextInt();
        } else {
            scanner.next();
        }
        // scanner.nextInt();

        scanner.close();
    }
}