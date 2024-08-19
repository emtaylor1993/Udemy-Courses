/**
 * AIRLINE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Airline object.
 * 
 * @packages
 *    None
 */

public class Airline {
    Person[] people; //array that stores Person objects...

    /**
     * Function Name: Airline
     * 
     * Constructor for the Airline object.
     */
    public Airline() {
        this.people = new Person[11];
    }

    /**
     * Function Name: getPerson
     * @param index (int)
     * @return      (Person)
     * 
     * Getter for the Person attribute.
     */
    public Person getPerson(int index) {
        Person personCopy = new Person(this.people[index]);
        return personCopy;
    }

    /**
     * Setter Name: setPerson
     * @param person (Person)
     * 
     * Inside the setter:
     *  1. Index the array, and set that element equal to the Person object.
     */
    public void setPerson(Person person) {
        Person personCopy = new Person(person);
        this.people[person.getSeatNumber() - 1] = personCopy;
    }
}
