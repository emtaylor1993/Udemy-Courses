/**
 * CITY
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a City object.
 * 
 * @packages
 *    Java Utilities (Objects)
 */

import java.util.Objects;

public class City {
    private String name;
    private long population;

    /**
     * Function Name: City
     * @param name       (String)
     * @param population (long)
     * 
     * Constructor for the City object.
     */
    public City(String name, long population) {
        this.name = name;
        this.population = population;
    }

    /**
     * Function Name: City
     * @param source (City)
     * 
     * Copy constructor for the City object.
     */
    public City(City source) {
        this.name = source.name;
        this.population = source.population;
    }

    /**
     * Function Name: getName
     * @return (String)
     * 
     * Getter for the name attribute.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Function Name: setName
     * @param name (String)
     * 
     * Setter for the name attribute.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Function Name: getPopulation
     * @return (long)
     * 
     * Getter for the population attribute.
     */
    public long getPopulation() {
        return this.population;
    }

    /**
     * Function Name: setPopulation
     * @param population (long)
     * 
     * Setter for the population attribute.
     */
    public void setPopulation(long population) {
        this.population = population;
    }

    /**
     * Function Name: equals
     * @param o (Object)
     * 
     * Checks whether the Objects being compared are equal.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof City)) {
            return false;
        }
        City city = (City) o;
        return Objects.equals(name, city.name) && population == city.population;
    }

    /**
     * Function Name: hashCode
     * 
     * Checks whether the Objects' hash codes are equal.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }
}