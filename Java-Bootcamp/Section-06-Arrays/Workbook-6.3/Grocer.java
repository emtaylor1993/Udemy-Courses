/**
 * GROCER
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java Arrays.
 * 
 * @packages
 *    None
 */

public class Grocer {
    public static void main(String[] args) {
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        System.out.println("\nDo you sell coffee?");
        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i].equals("coffee")) {
                System.out.println("\nWe have that in aisle: " + i);
            }
        }
    }
}
