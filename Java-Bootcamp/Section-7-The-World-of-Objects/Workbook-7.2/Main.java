 public class Main {
    public static void main(String[] args) {
        Person person = new Person("Emmanuel Taylor", "American", "01/01/1111", 11);
 
        System.out.println("Name: " + person.name + "\n" + "Nationality: " 
            + person.nationality+ "\n" + "Date of Birth: " + person.dateOfBirth + 
            "\n" + "Seat Number: " + person.seatNumber + "\n");
    }
}
