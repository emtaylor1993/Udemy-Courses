/**
 * MAIN
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Movie store.
 * 
 * @packages
 *    Java IO (FileInputStream, FileNotFoundException)
 *    Java Utilities (Scanner)
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Store store = new Store();

    public static void main(String[] args) {
        try {
            loadMovies("movies.txt");
            printStore();
            userInput();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Function Name: userInput
     * 
     * Gathers Movie information from the User.
     */
    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        String status = "continue";
    
        while (status.equals("continue")) {
            int choice = (promptForChoice(scanner));
            Movie movie = store.getMovie(choice);
            double rating = promptForRating(scanner, movie.getName());
    
            movie.setRating(rating);
            store.setMovie(choice, movie);
            printStore();
            System.out.print("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }
        scanner.close();
    }

    /**
     * Function Name: promptForChoice
     * @param scanner (Scanner)
     * @return        (int)
     * 
     * Asks the user to choose a number between 0 and 9.
     */
    public static int promptForChoice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (!incorrectChoice(choice)) {
                    return choice;
                }
            }
        }
    }

    /**
     * Function Name: incorrectChoice
     * @param choice (int)
     * @return       (boolean)
     * 
     * Checks whether the User made a valid integer choice.
     */
    public static boolean incorrectChoice(int choice) {
        if (choice < 0 || choice > 9) {
            return true;
        }

        return false;
    }

    /**
     * Function Name: promptForRating
     * @param scanner (Scanner)
     * @param name    (String)
     * @return        (double)
     * 
     * Asks the User to enter a new rating for the movie.
     */
    public static double promptForRating(Scanner scanner, String name) {
        while (true) {
            System.out.print("\nSet a new rating for " + name + ": ");
            if (scanner.hasNextDouble()) {
                double choice = scanner.nextDouble();
                if (!incorrectRating(choice)) {
                    return choice;
                }
            }
         }
    }

    /**
     * Function Name: incorrectRating
     * @param rating (double)
     * @return       (boolean)
     * 
     * Checks whether the User made a valid rating entry.
     */
    public static boolean incorrectRating(double rating) {
        if (rating < 0 || rating > 10) {
            return true;
        }

        return false;
    }

    /**
     * Function Name: loadMovies
     * @param fileName (String)
     * @throws FileNotFoundException
     * 
     * Load the list of movies from the movies.txt file.
     */
    public static void loadMovies(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            String[] words = line.split("--");
            store.addMovie(new Movie(words[0], words[1], Double.parseDouble(words[2])));
        }
        scanFile.close();
    }

    /**
     * Function Name: printStore
     * 
     * Prints the contents of the Movie store.
     */
    public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }
}