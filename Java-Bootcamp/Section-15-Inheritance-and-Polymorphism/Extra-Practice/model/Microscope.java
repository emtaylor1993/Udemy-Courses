/**
 * MICROSCOPE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Microscope object.
 * 
 * @packages
 *    Constants (Constants)
 */

package model;

import constants.Constants;

public class Microscope extends LabEquipment {
    private int magnification;

    /**
     * Function Name: Microscope
     * @param manufacturer  (String)
     * @param model         (String)
     * @param year          (int)
     * @param magnification (int)
     * 
     * Constructor for the Microscope object.
     */
    public Microscope(String manufacturer, String model, int year, int magnification) {
        super(manufacturer, model, year);
        setMagnification(magnification);
    }

    /**
     * Function Name: Microscope
     * @param source (Microscope)
     * 
     * Copy constructor for the Microscope object.
     */
    public Microscope(Microscope source) {
        super(source.getManufacturer(), source.getModel(), source.getYear());
        setMagnification(source.magnification);
    }

    /**
     * Function Name: getMagnification
     * @return (int)
     * 
     * Getter for the magnification attribute
     */
    public int getMagnification() {
        return this.magnification;
    }

    /**
     * Function Name: setMagnification
     * @param magnification (int)
     * 
     * Setter for the magnification attribute.
     */
    public void setMagnification(int magnification) {
        if (magnification < Constants.MINIMUM_MAGNIFICATION) {
            throw new IllegalArgumentException("Magnification must be greater than or equal to the minimum magnification.");
        }
        this.magnification = magnification;
    }

    /**
     * Function Name: performMaintenance
     * 
     * Returns a string on how to perform maintenance on the Microscope object.
     */
    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }

    /**
     * Function Name: clone
     * 
     * Clones the Microscope object.
     */
    @Override
    public LabEquipment clone() {
        return new Microscope(this);
    }
}
