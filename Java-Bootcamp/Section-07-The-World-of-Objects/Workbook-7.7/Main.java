/**
 * MAIN
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a seat reservation.
 * 
 * @packages
 *    None
 */

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
 
        if (person.applyPassport() == true) {
            person.setPassport();
        }

        System.out.println(person);
    }
}
