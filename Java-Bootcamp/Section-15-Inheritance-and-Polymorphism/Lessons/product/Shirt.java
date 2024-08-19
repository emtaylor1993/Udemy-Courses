/**
 * PRODUCT
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Shirt object.
 * 
 * @packages
 *    None
 */

package product;

public class Shirt extends Product {
    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    /**
     * Function Name: Shirt
     * @param price (double)
     * @param color (String)
     * @param brand (String) 
     * @param size  (Size)
     * 
     * Constructor for the Shirt object.
     */
    public Shirt(double price, String color, String brand, Size size) {
        super(price, color, brand);
        this.size = size;
    }

    /**
     * Function Name: getSize
     * @return (Size)
     * 
     * Getter for the size attribute.
     */
    public Size getSize() {
        return this.size;
    }

    /**
     * Function Name: setSize
     * @param size (Size)
     * 
     * Setter for the size attribute.
     */
    public void setSize(Size size) {
        this.size = size;
    }

    /**
     * Function Name: fold
     * 
     * Returns instructions on how to fold shirts.
     */
    @Override
    public void fold() {
        super.fold();
        System.out.println("Lay the shirt on a flat surface.");
        System.out.println("Fold the shirt sideways.");
        System.out.println("Bring sleeves in.");
        System.out.println("Fold from the bottom up.");
    }

    /**
     * Function Name: wear
     * 
     * Returns a string for wearing a shirt.
     */
    @Override
    public void wear() {
        System.out.println("The " + this.size + " shirt suits you well.");
    }
}