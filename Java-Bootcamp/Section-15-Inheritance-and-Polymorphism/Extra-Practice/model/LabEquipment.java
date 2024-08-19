/**
 * LAB EQUIPMENT
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the LabEquipment object..
 * 
 * @packages
 *    Constants (Constants)
 */

package model;

import constants.Constants;

public abstract class LabEquipment {
    private String manufacturer;
    private String model;
    private int year;

    /**
     * Function Name: LabEquipment
     * @param manufacturer (String)
     * @param model        (String)
     * @param year         (int)
     * 
     * Constructor for the LabEquipment object.
     */
    public LabEquipment(String manufacturer, String model, int year) {
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
    }

    /**
     * Function Name: LabEquipment
     * @param source (LabEquipment)
     * 
     * Copy constructor for the LabEquipment object.
     */
    public LabEquipment(LabEquipment source) {
        setManufacturer(source.manufacturer);
        setModel(source.model);
        setYear(source.year);
    }

    /**
     * Function Name: getManufacturer
     * @return (String)
     * 
     * Getter for the manufacturer attribute.
     */
    public String getManufacturer() {
        return this.manufacturer;
    }

    /**
     * Function Name: setManufacturer
     * @param manufacturer (String)
     * 
     * Setter for the manufacturer attribute.
     */
    public void setManufacturer(String manufacturer) {
        if (manufacturer == null || manufacturer.isBlank()) {
            throw new IllegalArgumentException("Manufacturer cannot be null or blank.");
        }
        this.manufacturer = manufacturer;
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
        if (year < Constants.MINIMUM_YEAR) {
            throw new IllegalArgumentException("Year must be greater than or equal to the minimum year.");
        }
        this.year = year;
    }

    public abstract String performMaintenance();
    public abstract LabEquipment clone();
}