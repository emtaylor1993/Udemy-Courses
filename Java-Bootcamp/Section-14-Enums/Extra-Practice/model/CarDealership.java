/**
 * CAR DEALERSHIP
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the CarDealership object.
 * 
 * @packages
 *    Java Utilities (ArrayList)
 */

package model;

import java.util.ArrayList;

public class CarDealership {
    private ArrayList<Car> cars;

    /**
     * Function Name: CarDealership
     * 
     * Constructor for the CarDealership object.
     */
    public CarDealership() {
        this.cars = new ArrayList<>();
    }

    /**
     * Function Name: getCar
     * @param index (int)
     * @return      (Car)
     * 
     * Getter for the Car attribute.
     */
    public Car getCar(int index) {
        return new Car(cars.get(index));
    }

    /**
     * Function Name: setCar
     * @param index (int)
     * @param car   (Car)
     * 
     * Setter for the Car attribute.
     */
    public void setCar(int index, Car car) {
        this.cars.set(index, new Car(car));
    }

    /**
     * Function Name: addCar
     * @param car (Car)
     * 
     * Adds the Car object to the list.
     */
    public void addCar(Car car) {
        this.cars.add(new Car(car));
    }
}