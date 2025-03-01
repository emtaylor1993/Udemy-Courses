/**
 * MAIN
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a seat reservation.
 * 
 * @packages
 *    Java Utilities (Arrays)
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Emmanuel Taylor";
        person.nationality = "American";
        person.dateOfBirth = "01/01/1111";
        person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};
        person.seatNumber = 11;

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
    }
}
