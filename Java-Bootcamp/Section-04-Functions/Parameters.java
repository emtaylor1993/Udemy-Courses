/**
 * PARAMETERS
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java's parameters in functions.
 * 
 * @packages
 *    None
 */

public class Parameters {
    public static void main(String[] args) {
        calculateArea(2.3, 3.6);
        calculateArea(1.6, 2.4);
        calculateArea(2.6, 4.2);
    }

    /**
     * Function Name: calculateArea
     * @param length (double)
     * @param width  (double)
     * 
     * Calculates the area of a rectangle.
     */
    public static void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area: " + area);
    }
}
