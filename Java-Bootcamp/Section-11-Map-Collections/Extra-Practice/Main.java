/**
 * MAIN
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a CityPopulationTracker system.
 * 
 * @packages
 *    Java Utilities (Scanner)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cityName = promptForCityName(scanner);
        String country = promptForCountry(scanner);
        int population = promptForPopulation(scanner);

        City newCity = new City(cityName, country, population);
        CityPopulationTracker tracker = new CityPopulationTracker();
        
        tracker.addCity(newCity);
        System.out.println("City added to the tracker: " + newCity.getName());

        scanner.close();
    }

    /**
     * Function Name: isNullOrBlank
     * @param input (String)
     * @return      (boolean)
     * 
     * Inside the Function
     *  1. Returns true if input is null or empty. Otherwise, returns false.
     */
    public static boolean isNullOrBlank(String input) {
        if (input == null || input.isBlank()) {
            return true;
        }

        return false;
    }

    /**
     * Function Name: incorrectPopulation
     * @param population (int)
     * @return           (boolean)
     * 
     * Inside the Function
     *  1. Returns true if population is <= 0. Otherwise, returns false.
     */
    public static boolean incorrectPopulation(int population) {
        if (population <= 0) {
            return true;
        }

        return false;
    }

    /**
     * Function Name: promptForCityName
     * @param scanner (Scanner)
     * @return        (String)
     * 
     * Inside the Function
     *  1. Keeps prompting user for a valid city name.
     */
    public static String promptForCityName(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid city name: ");
            String cityName = scanner.nextLine();
            if (!isNullOrBlank(cityName)) {
                return cityName;
            }
        }
    }

    /**
     * Function Name: promptForCountry
     * @param scanner (Scanner)
     * @return        (String)
     * 
     * Inside the Function
     *  1. Keeps prompting the user for a valid country.
     */
    public static String promptForCountry(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid country: ");
            String country = scanner.nextLine();
            if (!isNullOrBlank(country)) {
                return country;
            }
        }
    }

    /**
     * Function Name: promptForPopulation
     * @param scanner (Scanner)
     * @return        (int)
     * 
     * Inside the Function
     *  1. Keeps prompting the user for a valid population.
     */
    public static int promptForPopulation(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid population (greater than 0): ");
            if (scanner.hasNextInt()) {
                int population = scanner.nextInt();
                if (!incorrectPopulation(population)) {
                    return population;
                }
            } else {
                scanner.next();
            }
        }
    }
}