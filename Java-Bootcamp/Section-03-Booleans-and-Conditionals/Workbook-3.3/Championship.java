/**
 * CHAMPIONSHIP
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that determines whether Gryffindor or
 *    Ravenclaw wins the house championship.
 * 
 * @packages
 *    None
 */

public class Championship {
    public static void main(String[] args) {
        int gryffindor = 100;
        int ravenclaw = 500;
        int margin = gryffindor - ravenclaw;

        if (margin >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        } else if (margin >= 0) {
            System.out.println("In second place, Gryffindor!");
        } else if (margin > -100) {
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }
    }
}
