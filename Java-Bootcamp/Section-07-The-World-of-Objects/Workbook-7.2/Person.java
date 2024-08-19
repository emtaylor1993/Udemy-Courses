/**
 *PERSON
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
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;
 
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
}
