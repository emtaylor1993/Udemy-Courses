/**
 * EVEN OR ODD
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java for loops used with
 *    if-else statements.
 * 
 * @packages
 *    None
 */

public class EvenOrOdd {
    public static void main(String[] args) {
        for (int i = 0; i <= 19; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - even");
            } else {
                System.out.println(i + " - odd");
            }
        }
    }
}
