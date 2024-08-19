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
    Person[] people; // array that stores Person objects...

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
     * @param index (index)
     * @return      (Person)
     * 
     * Getter for the Person attribute.
     */
    public Person getPerson(int index) {
        Person person = this.people[index];
        return new Person(person); // copy constructor creates copy of object
    }

    /**
     * Function Name: setPerson
     * @param person (Person)
     * 
     * Setter for the Person attribute.
     */
    public void setPerson(Person person) {
        int index = person.getSeatNumber() - 1;
        this.people[index] = new Person(person);
    }

    /**
     * Function Name: createReservation
     * @param person (Person)
     * 
     * Creates a seat reservation for the person parameter.
     */
    public void createReservation(Person person) {
        while(this.people[person.getSeatNumber() - 1] != null) {
            System.out.print(person.getName() + ", seat: " + person.getSeatNumber() + " is already taken. Please choose another seat.\n");
            person.chooseSeat();
        }

        this.people[person.getSeatNumber() - 1] = new Person(person); 
        System.out.print("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".\n");
    }
}