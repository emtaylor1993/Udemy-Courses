/**
 * DEALERSHIP
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a seat reservation.
 * 
 * @packages
 *    Java Utilities (Arrays)
 */

import java.util.Arrays;

public class Dealership {
    private Car[] cars;

    /**
     * Function Name: Dealership
     * @param cars (Car[])
     * 
     * Constructor for the Dealership object.
     */
    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
        
        this.cars = Arrays.copyOf(cars, cars.length);
    }

    /**
     * Function Name: getCar
     * @param index (int)
     * @return      (Car)
     * 
     * Getter for the Car attribute.
     */
    public Car getCar(int index) {
        Car copyCar = new Car(this.cars[index]);
        return copyCar;
    }

    /**
     * Function Name: setCar
     * @param index  (int)
     * @param newCar (Car)
     * 
     * Setter for the Car attribute.
     */
    public void setCar(int index, Car newCar) {
        Car copyCar = new Car(newCar);
        this.cars[index] = copyCar;
    }

    /**
     * Function Name: toString
     * @return (String)
     * 
     * toString function for the Dealership class.
     */
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }
}
