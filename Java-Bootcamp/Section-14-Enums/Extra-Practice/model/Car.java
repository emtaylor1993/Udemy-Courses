/**
 * CAR
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Car object.
 * 
 * @packages
 *    Constants (BodyType, Constants)
 */

package model;

import constants.BodyType;
import static constants.Constants.*;

public class Car {
    private String make;
    private String model;
    private BodyType bodyType;
    private int productionYear;
    private double price;

    /**
     * Function Name: Car
     * @param make           (String)
     * @param model          (String)
     * @param bodyType       (BodyType)
     * @param productionYear (int)
     * @param price          (double)
     * 
     * Constructor for the Car object.
     */
    public Car(String make, String model, BodyType bodyType, int productionYear, double price) {
        setMake(make);
        setModel(model);
        setBodyType(bodyType);
        setProductionYear(productionYear);
        setPrice(price);
    }

    /**
     * Function Name: Car
     * @param source (Car)
     * 
     * Copy constructor for the Car object.
     */
    public Car(Car source) {
        setMake(source.make);
        setModel(source.model);
        setBodyType(source.bodyType);
        setProductionYear(source.productionYear);
        setPrice(source.price);
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
        if (make == null || make.isBlank()) {
            throw new IllegalArgumentException("Make cannot be null or blank.");
        }
        this.make = make;
    }

    /**
     * Function Name: getModel
     * @return (String)
     * 
     * Getter for the model attribute.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Function Name: setModel
     * @param model (String)
     * 
     * Setter for the model attribute.
     */
    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model cannot be null or blank.");
        }
        this.model = model;
    }

    /**
     * Function Name: getBodyType
     * @return (BodyType)
     * 
     * Getter for the bodyType attribute.
     */
    public BodyType getBodyType() {
        return this.bodyType;
    }

    /**
     * Function Name: setBodyType
     * @param bodyType (BodyType)
     * 
     * Setter for the bodyType attribute.
     */
    public void setBodyType(BodyType bodyType) {
        if (bodyType == null) {
            throw new IllegalArgumentException("BodyType cannot be null.");
        }
        this.bodyType = bodyType;
    }

    /**
     * Function Name: getProductionYear
     * @return (int)
     * 
     * Getter for the productionYear attribute
     */
    public int getProductionYear() {
        return this.productionYear;
    }

    /**
     * Function Name: setProductYear
     * @param productionYear (int)
     * 
     * Setter for the productionYear attribute
     */
    public void setProductionYear(int productionYear) {
        if (productionYear < MINIMUM_YEAR) {
            throw new IllegalArgumentException("Production year must be greater than or equal to the minimum year.");
        }
        this.productionYear = productionYear;
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
        if (price < MINIMUM_PRICE || price > MAXIMUM_PRICE) {
            throw new IllegalArgumentException("Price must be within a valid range.");
        }
        this.price = price;
    }
}