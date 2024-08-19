/**
 * LAB
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Lab object.
 * 
 * @packages
 *    Java Utilities (ArrayList)
 */

package model;

import java.util.ArrayList;

public class Lab {
    private ArrayList<LabEquipment> labEquipments;

    /**
     * Function Name: Lab
     * 
     * Constructor for the Lab object.
     */
    public Lab() {
        this.labEquipments = new ArrayList<>();
    }

    /**
     * Function Name: getLabEquipment
     * @param index (int)
     * @return      (LabEquipment)
     * 
     * Getter for the LabEquipment object.
     */
    public LabEquipment getLabEquipment(int index) {
        return this.labEquipments.get(index).clone();
    }

    /**
     * Function Name: setLabEquipment
     * @param index        (int)
     * @param labEquipment (LabEquipment)
     * 
     * Setter for the LabEquipment object.
     */
    public void setLabEquipment(int index, LabEquipment labEquipment) {
        this.labEquipments.set(index, labEquipment.clone());
    }

    /**
     * Function Name: addLabEquipment
     * @param labEquipment (LabEquipment)
     * 
     * Adds the LabEquipment object to the list.
     */
    public void addLabEquipment(LabEquipment labEquipment) {
        this.labEquipments.add(labEquipment.clone());
    }
}
