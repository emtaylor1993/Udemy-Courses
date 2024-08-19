/**
 * CONTACT
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Contact object.
 * 
 * @packages
 *    Java Utilities (Objects)
 */

import java.util.Objects;

public class Contact {
    private String name;
    private int age;

    /**
     * Function Name: Contact
     * @param name (string)
     * @param age  (int)
     * 
     * Constructor for the Contact object.
     */
    public Contact(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Function Name: Contact
     * @param source (Contact)
     * 
     * Copy constructor for the Contact object.
     */
    public Contact(Contact source) {
        this.name = source.name;
        this.age = source.age;
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
     * Function Name: getAge
     * @return (int)
     * 
     * Getter for the age attribute.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Function Name: setAge
     * @param age (int)
     * 
     * Setter for the age attribute.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Function Name: equals
     * @param o (Object)
     * 
     * Checks whether the objects being compared are equal.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && age == contact.age;
    }

    /**
     * Function Name: hashCode
     * 
     * Checks whether the objects' hash codes are equal.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
