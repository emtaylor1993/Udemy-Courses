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
}