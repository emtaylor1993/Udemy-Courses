/**
 * PANTS
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Pants object.
 * 
 * @packages
 *    None
 */

package product;

public class Pants extends Product {
    private int waist;
    private int length;

    /**
     * Function Name: Pants
     * @param price  (double)
     * @param color  (String)
     * @param brand  (String)
     * @param waist  (int)
     * @param length (int)
     * 
     * Constructor for the Pants object.
     */
    public Pants(double price, String color, String brand, int waist, int length) {
        super(price, color, brand);
        this.waist = waist;
        this.length = length;
    }

    /**
     * Function Name: getWaist
     * @return (int)
     * 
     * Getter for the waist attribute.
     */
    public int getWaist() {
        return this.waist;
    }

    /**
     * Function Name: setWaist
     * @param waist (int)
     * 
     * Setter for the waist attribute.
     */
    public void setWaist(int waist) {
        this.waist = waist;
    }

    /**
     * Function Name: getLength
     * @return (int)
     * 
     * Getter for the length attribute.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Function Name: setLength
     * @param length (int)
     * 
     * Setter for the length attribute.
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Function Name: fold
     * 
     * Returns instructions on how to fold pants.
     */
    @Override
    public void fold() {
        super.fold();
        System.out.println("Hold pants upright.");
        System.out.println("Fold one leg over the other.");
        System.out.println("Fold pants from bottom in thirds.");
    }

    /**
     * Function Name: wear
     * 
     * Returns a string on wearing the pants.
     */
    @Override
    public void wear() {
        System.out.println("The " + this.waist + " " + this.length + " pants look great on you.");
    }
}