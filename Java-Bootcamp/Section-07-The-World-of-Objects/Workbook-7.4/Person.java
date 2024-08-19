/**
 * PERSON
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Person object.
 * 
 * @packages
 *    None
 */

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    /**
     * Function Name: Person
     * @param name        (String)
     * @param nationality (String)
     * @param dateOfBirth (String)
     * @param seatNumber  (int)
     * 
     * Constructor for the Person object.
     */
    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    /**
     * Function Name: Person
     * @param source (Person)
     * 
     * Copy constructor for the Person object.
     */
    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
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
     * Function Name: getNationality
     * @return (String)
     * 
     * Getter for the nationality attribute.
     */
    public String getNationality() {
        return this.nationality;
    }

    /**
     * Function Name: setNationality
     * @param nationality (String)
     * 
     * Setter for the nationality attribute.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Function Name: getDateOfBirth
     * @return (String)
     * 
     * Getter for the dateOfBirth attribute.
     */
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     * Function Name: setDateOfBirth
     * @param dateOfBirth (String)
     * 
     * Setter for the dateOfBirth attribute.
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Function Name: getSeatNumber
     * @return (int)
     * 
     * Getter for the seatNumber attribute.
     */
    public int getSeatNumber() {
        return this.seatNumber;
    }

    /**
     * Function Name: setSeatNumber
     * @param seatNumber (int)
     * 
     * Setter for the seatNumber attribute.
     */
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}