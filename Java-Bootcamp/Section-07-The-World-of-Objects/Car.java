/**
 * CAR
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Car object.
 * 
 * @packages
 *    Java Utilities (Arrays)
 */


import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    /**
     * Function Name: Car
     * @param make  (String)
     * @param price (double)
     * @param year  (int)
     * @param color (String)
     * @param parts (String[])
     * 
     * Constructor for the Car object.
     */
    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    /**
     * Function Name: Car
     * @param source (Car)
     * 
     * Copy constructor for the Car object.
     */
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    /**
     * Function Name: getMake
     * @return (String)
     * 
     * Getter for the make attribute.
     */
    public String getMake() {
        return this.make;
    }

    /**
     * Function Name: setMake
     * @param make (String)
     * 
     * Setter for the make attribute.
     */
    public void setMake(String make) {
        this.make = make;
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
     * Function Name: getYear
     * @return (int)
     * 
     * Getter for the year attribute.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Function Name: setYear
     * @param year (int)
     * 
     * Setter for the year attribute.
     */
    public void setYear(int year) {
        this.year = year;
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
     * Function Name: getParts
     * @return (String[])
     * 
     * Getter for the parts attribute.
     */
    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    /**
     * Function Name: setParts
     * @param parts (String[])
     * 
     * Setter for the parts attribute.
     */
    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    /**
     * Function Name: drive
     * 
     * Prints out the Car object.
     */
    public void drive() {
        System.out.println("\nYou bought the beautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.");
    }

    /**
     * Function Name: toString()
     * @return (String)
     * 
     * toString object for the Car class.
     */
    public String toString() {
        return "Make: " + this.make + ".\n" 
            +  "Price: " + this.price + ".\n"
            +  "Year: " + this.year + ".\n"
            +  "Color: " + this.color + ".\n"
            +  "Parts: " + Arrays.toString(parts) + ".\n";
    }
}
