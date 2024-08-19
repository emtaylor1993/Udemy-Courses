/**
 * CONTACT
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Contact class.
 * 
 * @packages
 *    Java Time (LocalDate, Period)
 */

import java.time.LocalDate;
import java.time.Period;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    /**
     * Function Name: Contact
     * @param name        (String)
     * @param phoneNumber (String)
     * @param birthDate   (String)
     * 
     * Constructor for the Contact object.
     */
    public Contact(String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }

    /**
     * Function Name: Contact
     * @param source (Contact)
     * 
     * Copy constructor for the Contact object.
     */
    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
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
     * @param name
     * Setter for the name attribute.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Function Name: getPhoneNumber
     * @return (String)
     * 
     * Getter for the phoneNumber attribute.
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Function Name: setPhoneNumber
     * @param phoneNumber (String)
     * 
     * Setter for the phoneNumber attribute.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Function Name: getBirthDate
     * @return (String)
     * 
     * Getter for the birthDate attribute.
     */
    public String getBirthDate() {
        return this.birthDate;
    }

    /**
     * Function Name: setBirthDate
     * @param birthDate (String)
     * 
     * Setter for the birthDate attribute.
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
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
    private void setAge(int age) {
        this.age = age;
    }

    /**
     * Function Name: toString
     * @return (String)
     * 
     * toString function for the Contact class.
     */
    public String toString() {
        return "Name: " + this.name + "\n" +
            "Phone number: " + this.phoneNumber + "\n" +
            "Birth Date: " + this.birthDate + "\n" +
            "Age: " + this.age + " year old\n";
    }

    /**
     * Function Name: toAge
     * @param birthDate (String)
     * @return age      (int)
     * 
     * Inside the Function:
     *  1. Convert birthDate String to LocalDate
     *  2. Get the current date
     *  3. Calculate the period between both dates
     *  4. Return the number of years
     */
    public int toAge(String birthDate) {
        LocalDate date = LocalDate.parse(birthDate);
        LocalDate now = LocalDate.now();
        Period period = Period.between(date, now);
        return period.getYears();
    }
}
