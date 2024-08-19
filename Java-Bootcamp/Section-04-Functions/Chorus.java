/**
 * CHORUS
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that calls a function multiple times.
 * 
 * @packages
 *    None
 */

public class Chorus {
    public static void main(String[] args) {
        singChorus();
        singChorus();
        singChorus();
        singChorus();
        singChorus();
    }

    /**
     * Function Name: singChorus
     * 
     * Prints out the lyrics to the chorus.
     */
    public static void singChorus() {
        System.out.println("Don't blame it on the sunshine");
        System.out.println("Don't blame it on the moonlight");
        System.out.println("Don't blame it on good times");
        System.out.println("Don't blame it on the boogie\n");
    }
}