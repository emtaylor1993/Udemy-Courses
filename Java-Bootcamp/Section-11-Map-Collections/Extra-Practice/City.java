/**
 * CITY
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a City object.
 * 
 * @packages
 *    None
 */

public class City {
    private String name;
    private String country;
    private long population;

    /**
     * Function Name: City
     * @param name       (String)
     * @param country    (String)
     * @param population (long)
     * 
     * Constructor for the City object.
     */
    public City(String name, String country, long population) {
        setName(name);
        setCountry(country);
        setPopulation(population);
    }

    /**
     * Function Name: City
     * @param source (City)
     * 
     * Copy constructor for the City object.
     */
    public City(City source) {
        setName(source.getName());
        setCountry(source.getCountry());
        setPopulation(source.getPopulation());
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
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank.");
        }

        this.name = name;
    }

    /**
     * Function Name: getCountry
     * @return (String)
     * 
     * Getter for the country attribute.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Function Name: setCountry
     * @param country (String)
     * 
     * Setter for the country attribute.
     */
    public void setCountry(String country) {
        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException("Country cannot be null or blank.");
        }

        this.country = country;
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
        if (population <= 0) {
            throw new IllegalArgumentException("Population must be greater than 0.");
        }

        this.population = population;
    }
}