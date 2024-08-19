/**
 * SPHERE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Sphere object.
 * 
 * @packages
 *    None
 */

package shape;

public class Sphere extends Shape {

    /**
     * Function Name: Sphere
     * @param radius (double)
     * 
     * Constructor for the Sphere object.
     */
    public Sphere(double radius) {
        super(radius);
    }

    /**
     * Function Name: getArea
     * 
     * Returns the area of the Sphere.
     */
    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(super.getRadius(), 2);
    }
    
    /**
     * Function Name: getVolume
     * 
     * Returns the volume of the Sphere.
     */
    @Override
    public double getVolume() {
        return ((4 / 3) * Math.PI * Math.pow(super.getRadius(), 3));
    }
}