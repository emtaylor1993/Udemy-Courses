/**
 * RETURN VALUES
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates return values from functions.
 * 
 * @packages
 *    None
 */

public class ReturnValues {
    public static void main(String[] args) {
        double area = calculateArea(2.3, 3.6);
        String englishExplanation = explainArea("English");

        System.out.println(englishExplanation);
        printArea(2.3, 3.6, area);
    }

    /**
     * Function Name: calculateArea
     * @param length (double)
     * @param width  (double)
     * @return       (double)
     * 
     * Calculates the area of a rectangle.
     */
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }

    /**
     * Function Name: explainArea
     * @param language (String)
     * @return         (String)
     * 
     * Explains how the area is calculated depending on
     * the language chosen.
     */
    public static String explainArea(String language) {
        switch(language) {
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longeur * la largeur";
            case "Spanish": return "Area es igual a largo * ancho";
            default: return "Language not available.";
        }
    }

    /**
     * Function Name: printArea
     * @param length (double)
     * @param width  (double)
     * @param area   (double)
     * 
     * Prints the area of a rectangle.
     */
    public static void printArea(double length, double width, double area) {
        System.out.println("A rectangle with a length of " + length + " and a width of " + width + " has an area of " + area);
    }
}