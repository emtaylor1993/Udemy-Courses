/**
 * SINGLE THREAD
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java single threaded applications.
 * 
 * @packages
 *    None
 */

public class SingleThread {
    public static void main(String[] args) {
        longTask();
        System.out.println("Doing other work on main thread");

    }

    /**
     * Function Name: longTask
     * 
     * Creates a long task to block the program.
     */
    public static void longTask() {
        long t = System.currentTimeMillis();
        long end = t + 3000;

        while (true) {
            if (System.currentTimeMillis() == end) {
                System.out.println("Finished long task");
                break;
            }
        }
    }
}