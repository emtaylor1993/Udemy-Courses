/**
 * SCOPE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java's scope when it
 *    comes to variables.
 * 
 * @packages
 *    None
 */

public class Scope {
    // Global variables to store the rectangle's length and width (accessible within the whole class)
    // static double length = 2;
    // static double width = 4;

    public static void main(String[] args) {
        double length = 2;
        double width = 4;

        calculateArea(length, width);
        calculatePerimeter(length, width);
    }

    /**
     * Function Name: calculateArea
     * @param param1 (double)
     * @param param2 (double)
     * 
     * Calculates the area of a rectangle.
     */
    public static void calculateArea(double param1, double param2) {
        // Local variable to store the area (accessible only within this function)
        double area = param1 * param2;
        System.out.println("Area of the rectangle: " + area);
    }

    /**
     * Function Name: calculatePerimeter
     * @param param1 (double)
     * @param param2 (double)
     * 
     * Calculates the perimeter of a rectangle.
     */
    public static void calculatePerimeter(double param1, double param2) {
        // Local variable to store the perimeter (accessible only within this function)
        double perimeter = 2 * (param1 + param2);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
