/**
 * CYLINDER
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Cylinder object.
 * 
 * @packages
 *    None
 */

package shape;

public class Cylinder extends Shape {
    private double height;

    /**
     * Function Name: Cylinder
     * @param radius (double)
     * @param height (double)
     * 
     * Constructor for the Cylinder object.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    /**
     * Function Name: getHeight
     * @return (double)
     * 
     * Getter for the height attribute.
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Function Name: setHeight
     * @param height (double)
     * 
     * Setter for the height attribute.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Function Name: getArea
     * 
     * Returns the area of the Cylinder.
     */
    @Override
    public double getArea() {
        return (2 * Math.PI + Math.pow(super.getRadius(), 2) + 2 * Math.PI * super.getRadius() * this.height);
    }

    /**
     * Function Name: getVolume
     * 
     * Returns the volume of the Cylinder.
     */
    @Override
    public double getVolume() {
        return (Math.PI * Math.pow(super.getRadius(), 2) * this.height);
    }
}