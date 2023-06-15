package model;

import constants.Constants;

public class Microscope extends LabEquipment {
    private int magnification;

    public Microscope(String manufacturer, String model, int year, int magnification) {
        super(manufacturer, model, year);
        setMagnification(magnification);
    }

    public Microscope(Microscope source) {
        super(source.getManufacturer(), source.getModel(), source.getYear());
        setMagnification(source.magnification);
    }

    public int getMagnification() {
        return this.magnification;
    }

    public void setMagnification(int magnification) {
        if (magnification < Constants.MINIMUM_MAGNIFICATION) {
            throw new IllegalArgumentException("Magnification must be greater than or equal to the minimum magnification.");
        }
        this.magnification = magnification;
    }

    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }

    @Override
    public LabEquipment clone() {
        return new Microscope(this);
    }
}
