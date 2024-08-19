/**
 * ITEM
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents an Item object.
 * 
 * @packages
 *    None
 */

public class Item {   
    private String name;
    private double price;

    /**
     * Function Name: Item
     * @param name  (String)
     * @param price (double)
     * 
     * Constructor for the Item object.
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Function Name: getName
     * @return (String)
     * 
     * Getter for the name attribute.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Function Name: setName
     * @param name (String)
     * 
     * Setter for the name attribute.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Function Name: getPrice
     * @return (double)
     * 
     * Getter for the price attribute.
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Function Name: setPrice
     * @param price (double)
     * 
     * Setter for the price attribute.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}