import java.util.Scanner;

// Import user-defined packages.
import constants.BodyType;
import constants.Constants;
import model.Car;
import model.CarDealership;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String make = promptForMake(scanner);
        String model = promptForModel(scanner);
        BodyType bodyType = promptForBodyType(scanner);
        int year = promptForYear(scanner);
        double price = promptForPrice(scanner);

        Car newCar = new Car(make, model, bodyType, year, price);
        CarDealership dealership = new CarDealership();

        dealership.addCar(newCar);
        System.out.println("Car added to the dealership: " + newCar.getMake() + " " + newCar.getModel());

        // Prevents possible memory leak.
        scanner.close();
    }

    /**
     * Function Name: isNullOrBlank
     * @param input (String)
     * @return      (boolean)
     * 
     * Inside the Function:
     *  1. Return true if the input is null || blank.
     */
    public static boolean isNullOrBlank(String input) {
        return (input == null || input.isBlank());
    }

    /**
     * Function Name: invalidYear
     * @param year (int)
     * @return     (boolean)
     * 
     * Inside the Function:
     *  1. Returns true if the year is invalid.
     */
    public static boolean invalidYear(int year) {
        return (year < Constants.MINIMUM_YEAR);
    }

    /**
     * Function Name: invalidPrice
     * @param price (double)
     * @return      (boolean)
     * 
     * Inside the Function:
     *  1. Returns true if the price is invalid.
     */
    public static boolean invalidPrice(double price) {
        return (price < 0 || price > 200000);
    }

    /**
     * Function Name: invalidBodyType
     * @param bodyType (String)
     * @return         (boolean)
     * 
     * Inside the Function:
     *  1. Returns true if the bodyType is invalid.
     */
    public static boolean invalidBodyType(String bodyType) {
        try {
            BodyType.valueOf(bodyType.toUpperCase());
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    /**
     * Function Name: promptForBodyType
     * @param scanner (Scanner)
     * @return        (BodyType)
     * 
     * Inside the Function:
     *  1. Returns a valid car bodyType.
     */
    public static BodyType promptForBodyType(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car body type: ");
            String bodyType = scanner.nextLine();
            if (!invalidBodyType(bodyType)) {
                return BodyType.valueOf(bodyType.toUpperCase());
            }
        }
    }

    /**
     * Function Name: promptForMake
     * @param scanner (Scanner)
     * @return        (String)
     * 
     * Inside the Function:
     *  1. Returns a valid car make.
     */
    public static String promptForMake(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car make: ");
            String make = scanner.nextLine();
            if (!isNullOrBlank(make)) {
                return make;
            }
        }
    }

    /**
     * Function Name: promptForModel
     * @param scanner (Scanner)
     * @return        (String)
     * 
     * Inside the Function:
     *  1. Returns a valid car model.
     */
    public static String promptForModel(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car model: ");
            String model = scanner.nextLine();
            if (!isNullOrBlank(model)) {
                return model;
            }
        }
    }

    /**
     * Function Name: promptForYear
     * @param scanner (Scanner)
     * @return        (int)
     * 
     * Inside the Function:
     *  1. Returns a valid productionYear.
     */
    public static int promptForYear(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid production year: ");
            if (scanner.hasNextInt()) {
                int year = scanner.nextInt();
                if (!invalidYear(year)) {
                    return year;
                }
            } else {
                scanner.next();
            }
        }
    }

    /**
     * Function Name: promptForPrice
     * @param scanner (Scanner)
     * @return        (double)
     * 
     * Inside the Function:
     *  1. Returns a valid car price.
     */
    public static double promptForPrice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car price: ");
            if (scanner.hasNextDouble()) {
                double price = scanner.nextDouble();
                if (!invalidPrice(price)) {
                    return price;
                }
            } else {
                scanner.next();
            }
        }
    }
}