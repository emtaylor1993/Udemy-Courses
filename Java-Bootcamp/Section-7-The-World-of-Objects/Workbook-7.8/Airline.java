public class Airline {
    Person[] people; //array that stores Person objects...

    public Airline() {
        this.people = new Person[11];
    }

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
