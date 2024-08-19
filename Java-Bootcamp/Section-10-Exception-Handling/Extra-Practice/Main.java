/**
 * MAIN
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Magazine Library.
 * 
 * @packages
 *    Java Utilities (Scanner)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
        Magazine magazine2 = new Magazine("Magazine 2", "Publisher 2", 2, 2021);
        MagazineLibrary library = new MagazineLibrary();
        
        // Test the addMagazine method
        library.addMagazine(magazine1);
        library.addMagazine(magazine2);

        // Test the getMagazine method
        Magazine retrievedMagazine = library.getMagazine(0);
        System.out.println(retrievedMagazine.getTitle());

        // Test the setMagazine method
        Magazine newMagazine = new Magazine("Magazine 3", "Publisher 3", 3, 2022);
        library.setMagazine(0, newMagazine);

        // Verify that the magazine was updated
        retrievedMagazine = library.getMagazine(0);
        System.out.println(retrievedMagazine.getTitle());

        String title = promptForTitle(scanner);
        String publisher = promptForPublisher(scanner);
        int issueNumber = promptForIssueNumber(scanner);
        int publicationYear = promptForPublicationYear(scanner);

        Magazine newMagazine2 = new Magazine(title, publisher, issueNumber, publicationYear);
        MagazineLibrary library2 = new MagazineLibrary();
        library2.addMagazine(newMagazine2);

        System.out.println("Magazine added to the library: " + newMagazine.getTitle());
    }

    /**
     * Function Name: isNullOrBlank
     * @param input (String)
     * @return      (boolean)
     * 
     * Inside the Function:
     *  1. Returns true if the input is null or blank.
     */
    public static boolean isNullOrBlank(String input) {
        if (input == null || input.isBlank()) {
            return true;
        }

        return false;
    }

    /**
     * Function Name: incorrectIssueNumber
     * @param issueNumber   (int)
     * @return              (boolean)
     * 
     * Inside the Function:
     *  1. Returns true if issueNumber <= 0.
     */
    public static boolean incorrectIssueNumber(int issueNumber) {
        if (issueNumber <= 0) {
            return true;
        }

        return false;
    }

    /**
     * Function Name: incorrectPublicationYear
     * @param publicationYear   (int)
     * @return                  (boolean)
     * 
     * Inside the Function:
     *  1. Returns true if publicationYear is <= 0.
     */
    public static boolean incorrectPublicationYear(int publicationYear) {
        if (publicationYear <= 0) {
            return true;
        }

        return false;
    }

    /**
     * Function Name: promptForTitle
     * @param scanner   (Scanner)
     * @return          (String)
     * 
     * Inside the Function:
     *  1. Keeps prompting the user for a valid title.
     */
    public static String promptForTitle(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid title: ");
            String title = scanner.nextLine();
            if (!isNullOrBlank(title)) {
                return title;
            }
        }
    }

    /**
     * Function Name: promptForPublisher
     * @param scanner   (Scanner)
     * @return          (String)
     * 
     * Inside the Function:
     *  1. Keeps prompting user for a valid publisher.
     */
    public static String promptForPublisher(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid publisher: ");
            String publisher = scanner.nextLine();
            if (!isNullOrBlank(publisher)) {
                return publisher;
            }
        }
    }

    /**
     * Function Name: promptForIssueNumber
     * @param scanner   (Scanner)
     * @return          (int)
     * 
     * Inside the Function:
     *  1. Keeps prompting user for a valid issueNumber.
     */
    public static int promptForIssueNumber(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid issue number (greater than 0): ");
            if (scanner.hasNextInt()) {
                int issueNumber = scanner.nextInt();
                if (!incorrectIssueNumber(issueNumber)) {
                    return issueNumber;
                }
            } else {
                scanner.next();
                continue;
            }
        }
    }

    /**
     * Function Name: promptForPublicationYear
     * @param scanner   (Scanner)
     * @return          (int)
     * 
     * Inside the Function:
     *  1. Keeps prompting user for a valid publicationYear.
     */
    public static int promptForPublicationYear(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid publication year (greater than 0): ");
            if (scanner.hasNextInt()) {
                int publicationYear = scanner.nextInt();
                if (!incorrectPublicationYear(publicationYear)) {
                    return publicationYear;
                }
            } else {
                scanner.next();
                continue;
            }
        }
    }
}