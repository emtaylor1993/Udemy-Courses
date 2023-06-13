import java.util.Arrays;

public class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
        
        this.cars = Arrays.copyOf(cars, cars.length);
    }

    public Car getCar(int index) {
        Car copyCar = new Car(this.cars[index]);
        return copyCar;
    }

    public void setCar(int index, Car newCar) {
        Car copyCar = new Car(newCar);
        this.cars[index] = copyCar;
    }

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
