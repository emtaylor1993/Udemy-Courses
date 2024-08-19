/**
 * SIGN IN
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java while loops
 *    by using a sign in application.
 * 
 * @packages
 *    None
 */

import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = "Samantha";
        String password = "Java <3";

        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        String usernameEntry = scan.nextLine();
        System.out.print("- Password: ");
        String passwordEntry = scan.nextLine();

        while (!usernameEntry.equals(username) || !passwordEntry.equals(password)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("- Password: ");
            passwordEntry = scan.nextLine();
        }
        
        scan.close();    
    }
}
