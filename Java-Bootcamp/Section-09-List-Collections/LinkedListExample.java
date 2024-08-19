/**
 * LINKED LIST EXAMPLE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Java LinkedList.
 * 
 * @packages
 *    Java Utilities (LinkedList, List)
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating cities LinkedList.
        List<String> cities = new LinkedList<String>();

        // Adding elements to the LinkedList.
        cities.add("Paris");
        cities.add("Florence");
        cities.add("Venice");
        cities.add("Versailles");
        cities.add("London");
        cities.add("Petra");
        cities.add("Oslo");
        cities.add("Rome");
        cities.add("Madrid");
        cities.add("Tokyo");
        cities.add("Prague");
        cities.add("Dublin");
        cities.add("Athens");
        cities.add("Marseille");
        cities.add("Chicago");

        System.out.println(cities.size());
        System.out.println(cities.get(5));
        System.out.println(cities.get(8));

        // Updating the element in second index of the LinkedList.
        cities.set(2, "Naples");

        // Removing an element at the fifth index of the LinkedList.
        cities.remove(5);
    }
}