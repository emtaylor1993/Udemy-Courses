/**
 * CITY POPULATION TRACKER
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a CityPopulationTracker object.
 * 
 * @packages
 *    Java Utilities (HashMap)
 */

import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String, City> cityPopulations;

    /**
     * Function Name: CityPopulationTracker
     * 
     * Constructor for the CityPopulationTracker object.
     */
    public CityPopulationTracker() {
        this.cityPopulations = new HashMap<>();
    }

    /**
     * Function Name: getCity
     * @param city (String)
     * @return     (City)
     * 
     * Getter for the City attribute.
     */
    public City getCity(String city) {
        return new City(this.cityPopulations.get(city));
    }

    /**
     * Function Name: setCity
     * @param city (City)
     * 
     * Setter for the City attribute.
     */
    public void setCity(City city) {
        this.cityPopulations.put(city.getName(), new City(city));
    }

    /**
     * Function Name: addCity
     * @param city (City)
     * 
     * Adds the City object to the list.
     */
    public void addCity(City city) {
        this.cityPopulations.put(city.getName(), new City(city));
    }
}
