/**
 * SHAPE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Shape object.
 * 
 * @packages
 *    None
 */

package shape;

public class Shape { 
    private double radius;
    
    /**
     * Function Name: getRadius
     * @return (double)
     * 
     * Getter for the radius attribute.
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Function Name: setRadius
     * @param radius (double)
     * 
     * Setter for the radius attribute.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
}