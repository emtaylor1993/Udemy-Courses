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
        person.chooseSeat();
        
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");
        
        if (person.applyPassport() == true) {
            System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");    
        } else {
            System.out.println("We are sorry " + person.getName() + ". We cannot process your application.");
        }
    }
}