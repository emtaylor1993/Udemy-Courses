/**
 * REFERENCE TRAP
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java Arrays and the Reference Trap
 *    that can occurs when you don't use Arrays.copyOf().
 * 
 * @packages
 *    Java Utilities (Arrays)
 */

import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        // String[] staffThisYear = staffLastYear - Uncomment this and remove the next line to see the reference trap.
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);

        staffThisYear[1] = "Abby";
        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(staffLastYear));
    }
}