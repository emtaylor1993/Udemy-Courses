/**
 * WEATHER
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that calculates an Array of temperatures
 *    in Celsius to Fahrenheit.
 * 
 * @packages
 *    Java Utilities (Arrays)
 */

import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusToFahrenheit(celsius);

        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");
    }

    /**
     * Function Name: celsiusToFahrenheit
     * @param celsius (double[])
     * @return        (double[])
     * 
     * Inside the Function:
     *  1. Creates a double[] array called 'fahrenheit'
     *  2. Copies all the valuse from celsius to fahrenheit.
     *  3. Updates the fahrenheit values (F = (C/5 * 9) + 32).
     *  4. return fahrenheit.
     */
    public static double[] celsiusToFahrenheit(double[] celsius) {
        double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);
        for (int i = 0; i < celsius.length; i++) {
            fahrenheit[i] = (celsius[i]/ 5 * 9) + 32;
        }
        return fahrenheit;
    }

    /**
     * Function Name: printTemperatures
     * @param temp      (double[])
     * @param tempType  (String)
     * 
     * Inside the Function:
     *  1. System.out.print(type + ": ");
     *  2. A loop prints the temperatures in ONE line
     *  3. Prints a new line after the loop.
     */
    public static void printTemperatures(double[] temp, String tempType) {
        System.out.print(tempType + ": ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}
