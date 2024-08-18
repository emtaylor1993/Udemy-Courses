/**
 * DOC COMMENTS
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java's doc comments.
 * 
 * @packages
 *    None
 */

public class DocComments {
    public static void main(String[] args) {
        greet();
        printText("Emmanuel", 22);
        System.out.println(calculateArea(1.2, 2.3));
    }

    /**
     * Function Name: greet
     * 
     * Inside the Function:
     *  1. prints: "Hi"
     */
    public static void greet() {
        System.out.println("Hi");
    }

    /**
     * Function Name: printText
     * @param name (String)
     * @param age  (int)
     * 
     * Inside the Function:
     *  1. prints the name and age as part of text.
     */
    public static void printText(String name, int age) {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    /**
     * Function Name: calculateArea
     * @param length (double)
     * @param width  (double)
     * @return       (double)
     * 
     * Inside the Function:
     *  1. Calculates the area and returns it.
     */
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
}