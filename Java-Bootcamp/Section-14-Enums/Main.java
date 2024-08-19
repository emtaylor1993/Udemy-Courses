/**
 * MAIN
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that simulates a Car driving.
 * 
 * @packages
 *    Model (Car, TrafficLight)
 */

import model.Car;
import static model.Car.TrafficLight.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", 2020);
        car.drive(RED);
    }
}
