/**
 * EXAMPLE TWO
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates a FileNotFoundException.
 * 
 * @packages
 *    Java IO (FileInputStream, FileNotFoundException)
 *    Java Utilities (Scanner)
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        try {
            readFile("greetings.txt");
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Process Complete.");
        }
    }
    
    /**
     * Function Name: readFile
     * @param fileName (String)
     * @throws FileNotFoundException
     * 
     * Reads the contents of the greetings.txt file.
     */
    public static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("greetings.txt");
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}