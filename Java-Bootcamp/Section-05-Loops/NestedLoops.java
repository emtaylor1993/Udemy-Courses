/**
 * NESTED LOOPS
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java nested for loops.
 * 
 * @packages
 *    None
 */

public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Run: " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println(j);
            }
        }
    }
}
