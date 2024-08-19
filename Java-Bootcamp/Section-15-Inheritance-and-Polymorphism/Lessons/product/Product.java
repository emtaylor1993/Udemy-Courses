/**
 * PRODUCT
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Product class.
 * 
 * @packages
 *    None
 */

package product;

public abstract class Product {
    private double price;
    private String color;
    private String brand;

    /**
     * Function Name: Product
     * @param price (double)
     * @param color (String)
     * @param brand (String)
     * 
     * Constructor for the Product object.
     */
    public Product(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
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

    /**
     * Function Name: getColor
     * @return (String)
     * 
     * Getter for the color attribute.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Function Name: setColor
     * @param color (String)
     * 
     * Setter for the color attribute.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Function Name: getBrand
     * @return (string)
     * 
     * Getter for the brand attribute.
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Function Name: setBrand
     * @param brand (String)
     * 
     * Setter for the brand attribute.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Function Name: fold
     * 
     * Returns instructions on how to fold the product.
     */
    public void fold() {
        System.out.println("\nFolding my " + this.getBrand() + " " + this.getClass().getSimpleName());
    }

    public abstract void wear();
}