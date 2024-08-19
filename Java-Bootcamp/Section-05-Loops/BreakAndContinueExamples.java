/**
 * BREAK AND CONTINUE EXAMPLES
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java break and continue
 *    statements.
 * 
 * @packages
 *    None
 */

public class BreakAndContinueExamples {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println();

        int number = 20;
        while (number % 3 != 0) {
            number++;
            System.out.println(number);
        }

        System.out.println();

        // Example 4: Print all even numbers from 1 to 20, and skip odd numbers (using continue)
        // TODO: Write a loop that prints all even numbers from 1 to 20, skipping odd numbers using the 'continue' statement
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
