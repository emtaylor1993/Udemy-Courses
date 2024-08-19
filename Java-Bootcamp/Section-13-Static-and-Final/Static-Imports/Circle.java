/**
 * CIRCLE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Circle object.
 * 
 * @packages
 *    Java Lang (Math)
 */

import static java.lang.Math.*;

public class Circle {
    private double radius;

    /**
     * Function Name: Circle
     * @param radius (double)
     * 
     * Constructor for the Circle object.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Function Name: getCircumference
     * @return (double)
     * 
     * Returns the circumference.
     */
    public double getCircumference() {
        return 2 * PI * radius;
    }

    /**
     * Function Name: getArea
     * @return (double)
     * 
     * Returns the area.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Function Name: getLargerRadius
     * @param otherRadius (double)
     * @return            (double)
     * 
     * Returns the larger radius.
     */
    public double getLargerRadius(double otherRadius) {
        return max(radius, otherRadius);
    }

    /**
     * Function Name: getSmallerRadius
     * @param otherRadius (double)
     * @return            (double)
     * 
     * Returns the smaller radius.
     */
    public double getSmallerRadius(double otherRadius) {
        return min(radius, otherRadius);
    }

    /**
     * Function Name: getRadiusSquared
     * @return (double)
     * 
     * Returns the square of the radius.
     */
    public double getRadiusSquared() {
        return pow(radius, 2);
    }

    /**
     * Function Name: getRadiusSquareRoot
     * @return (double)
     * 
     * Returns the square root of the radius.
     */
    public double getRadiusSquareRoot() {
        return sqrt(radius);
    }
}