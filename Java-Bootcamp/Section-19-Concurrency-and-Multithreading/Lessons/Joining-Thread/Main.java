/**
 * MAIN
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates joining threads in Java.
 * 
 * @packages
 *    Java Utilities (Scanner)
 *    Java Utilities Concurrent (ExecutorService, Executors, Future)
 */

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    static double[] targets = new double[] {0.5, 0.8, 0.3};
    static final double PRECISION = 0.0000001;
    static double result = 0;

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Future<Double> future1 = executor.submit(() -> generateNumber(0));
        Future<Double> future2 = executor.submit(() -> generateNumber(1));
        Future<Double> future3 = executor.submit(() -> generateNumber(2));
        Future<Double> future4 = executor.submit(() -> generateNumber(1));
        Future<Double> future5 = executor.submit(() -> generateNumber(2));

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a name to generate a number: ");
        scan.nextLine();

        try {
            future1.get();
            future2.get();
            future3.get();
            future4.get();
            future5.get();
            executor.shutdown();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Finished running background operations.");
        scan.close();
    }

    /**
     * Function name: generateNumber
     * @return double
     * 
     * Inside the function:
     *   1. Generates a number close to the TARGET to a precision of PRECISION.
     */
    public static double generateNumber(int index) {
        double number = Math.random();
        double difference = difference(number, index);
        while (difference > PRECISION) {
            number = Math.random();
            difference = difference(number, index);
        }
        return number;
    }

    /**
     * Function Name: difference
     * @param number (double)
     * @param index  (int)
     * @return       (double)
     * 
     * Inside the Function:
     *  1. Returns the difference between the numbers.
     */
    public static double difference(double number, int index) {
        return Math.abs(targets[index] - number);
    }
}