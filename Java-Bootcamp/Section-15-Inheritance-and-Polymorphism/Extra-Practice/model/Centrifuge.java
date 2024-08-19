/**
 * CENTRIFUGE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Centrifuge object.
 * 
 * @packages
 *    None
 */

package model;

import constants.Constants;

public class Centrifuge extends LabEquipment {
    private int maxRPM;

    /**
     * Function Name: Centrifuge
     * @param manufacturer (String)
     * @param model        (String)
     * @param year         (int)
     * @param maxRPM       (int)
     * 
     * Constructor for the Centrifuge object.
     */
    public Centrifuge(String manufacturer, String model, int year, int maxRPM) {
        super(manufacturer, model, year);
        setMaxRPM(maxRPM);
    }

    /**
     * Function Name: Centrifuge
     * @param source (Centrifuge)
     * 
     * Copy constructor for the Centrifuge object.
     */
    public Centrifuge(Centrifuge source) {
        super(source.getManufacturer(), source.getModel(), source.getYear());
        setMaxRPM(source.maxRPM);
    }

    /**
     * Function Name: getMaxRPM
     * @return (int)
     * 
     * Getter for the maxRPM attribute.
     */
    public int getMaxRPM() {
        return this.maxRPM;
    }

    /**
     * Function Name: setMaxRPM
     * @param maxRPM (int)
     * 
     * Setter for the maxRPM attribute.
     */
    public void setMaxRPM(int maxRPM) {
        if (maxRPM < Constants.MINIMUM_RPM) {
            throw new IllegalArgumentException("Max RPM must be greater than or equal to the minimum RPM.");
        }
        this.maxRPM = maxRPM;
    }

    /**
     * Function Name: performMaintenance
     * 
     * Returns a string on how to perform maintenance for the Centrifuge.
     */
    @Override
    public String performMaintenance() {
        return "Centrifuge maintenance: Check the rotor, clean the chamber, and lubricate the spindle.";
    }

    /**
     * Function Name: clone
     * 
     * Clones the Centrifuge object.
     */
    @Override
    public LabEquipment clone() {
        return new Centrifuge(this);
    }
}
