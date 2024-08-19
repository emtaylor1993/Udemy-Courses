/**
 * MAIN
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates how to sort Java Lists.
 * 
 * @packages
 *    Java Utilities (Arrays, List)
 */

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(25, 19, 23, 45, 38, 23, 59, 12);

        /**************IMPERATIVE APPROACH**************
         * 
                for (int i = 0; i < integers.size(); i++) {
                    for (int j = i + 1; j < integers.size(); j++) {
                        if (integers.get(i).compareTo(integers.get(j)) > 0) {
                            int temp = integers.get(i);
                            integers.set(i, integers.get(j));
                            integers.set(j, temp);
                        }
                    }
                }
        */

        // Sorting in ascending order.
        integers.sort((right, left) -> right.compareTo(left));
        integers.forEach(integer -> System.out.print(integer + " "));

        System.out.println("\n");
        
        // Sorting in descending order.
        integers.sort((right, left) -> left.compareTo(right));
        integers.forEach(integer -> System.out.print(integer + " "));
    }
}

