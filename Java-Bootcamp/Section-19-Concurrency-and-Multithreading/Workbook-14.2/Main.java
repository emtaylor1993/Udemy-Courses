/**
 * MAIN
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java I/O using Threads.
 * 
 * @packages
 *    Java IO (IOException)
 *    Java Net (URISyntaxException)
 *    Java New IO (Files, Path, Paths)
 */

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    static final String SALES = "data/sales.csv"; //Use backslash Windows users

    public static void main(String[] args) {
        try {
            Path path = Paths.get(Thread.currentThread().getContextClassLoader().getResource(SALES).toURI());
            Thread thread1 = new Thread(() -> average(path, "Furniture"));
            Thread thread2 = new Thread(() -> average(path, "Technology"));
            Thread thread3 = new Thread(() -> average(path, "Office Supplies"));
            Thread thread4 = new Thread(() -> totalAverage(path));

            System.out.println(thread2.getState());

            thread1.start();
            thread2.start();
            System.out.println(thread2.getState());
            thread2.interrupt();
            thread3.start();
            thread4.start();

            Thread.sleep(10);
            System.out.println(thread2.getState());

        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Please enter your name to access the Global Superstore dataset: ");
        // String name = scan.nextLine();
        // System.out.println("Access Denied. We apologize for the inconvenience. Have a good day " + name + ".");
        // scan.close();
    }

    /**
     * Function name: average
     * @param path (Path)
     * @param category (String)
     * @return Double
     * 
     * Inside the function:
     *   1. Runs through every line from the CSV file as a stream.
     *   2. Maps every element in the stream to an array of three String values.
     *   3. Filters every value by the @param category
     *   4. Maps every element in the stream to a double (price * quantity).
     *   5. Applies the terminal operation average.
     *   6. Returns the average as double.
     */
    public static Double average(Path path, String category) {
        if (Thread.currentThread().isInterrupted()) {
            return 0.0;
        }

        try {
            return Files.lines(path)
                .skip(1)
                .map(line -> line.split(","))
                .filter(values -> values[0].equals(category))
                .mapToDouble(values -> Double.valueOf(values[1]) * Double.valueOf(values[2]))
                .average().getAsDouble();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return 0.0;
        }
    }

    /**
     * Function name: totalAverage
     * @param path (Path)
     * @return Double
     * 
     * Inside the function:
     *   1. Runs through every line from the CSV file as a stream.
     *   2. Maps every element in the stream to an array of three values.
     *   3. Maps every element in the stream to a double: (price * quantity).
     *   4. Applies the terminal operation average.
     *   5. Returns the average as double.
     */
    public static Double totalAverage(Path path) {
        try {
            return Files.lines(path)
                .skip(1)
                .map(line -> line.split(","))
                .mapToDouble(values -> Double.valueOf(values[1]) * Double.valueOf(values[2]))
                .average().getAsDouble();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return 0.0;
        }
    }
}