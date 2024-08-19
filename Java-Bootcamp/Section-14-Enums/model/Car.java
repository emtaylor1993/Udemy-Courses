/**
 * CAR
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Car object.
 * 
 * @packages
 *    None
 */

package model;

public class Car {
    private String make;
    private int year;

    public enum TrafficLight { RED, GREEN, YELLOW };

    /**
     * Function Name: Car
     * @param make (String)
     * @param year (int)
     * 
     * Constructor for the Car object.
     */
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
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
     * Function Name: drive
     * @param trafficLight (TrafficLight)
     * 
     * Prints out which action should occur based on the color
     * of the TrafficLight.
     */
    public void drive(TrafficLight trafficLight) {
        if (trafficLight == null) throw new IllegalArgumentException("Traffic Light cannot be null");
        switch (trafficLight) {
            case RED: System.out.println("STOP"); break;
            case GREEN: System.out.println("DRIVE"); break;
            case YELLOW: System.out.println("SLOW DOWN"); break;
        }
    }
}
