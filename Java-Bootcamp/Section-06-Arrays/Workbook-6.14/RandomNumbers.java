/**
 * RANDOM NUMBERS
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that creates a 2D array of random numbers.
 * 
 * @packages
 *    None
 */

public class RandomNumbers {
    public static void main(String[] args) {
        int[][] array = new int[100][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumber();
            }
        }

        print2DArray(array);
    }

    /**
     * Function Name: randomNumber
     * @return (int)
     * 
     * Inside the function:
     *  1. Returns a random number from 0 to 100.
     */
    public static int randomNumber() {
        double randomNumber = Math.random() * 100;
        return (int) randomNumber;
    }

    /**
     * Function Name: print2DArray
     * @param array (int[][])
     * 
     * Inside the function:
     *  1. Nested Loop:
     */
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
