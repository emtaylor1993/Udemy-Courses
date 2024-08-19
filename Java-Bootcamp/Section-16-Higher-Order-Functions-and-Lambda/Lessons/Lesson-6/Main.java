/**
 * MAIN
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates creating streams from a data source.
 * 
 * @packages
 *    Java IO (IOException)
 *    Java New IO (Files, Path, Paths)
 *    Java Utilities (Arrays)
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating Stream from Datasource: Array
        String[] greetings = new String[]{"Hello!", "Hola!", "Bonjour!", "Hallo!"};
        Arrays.stream(greetings).forEach(greeting -> System.out.println(greeting));

        // Creating Stream from Datasource: File
        try {
            Path path = Paths.get("chorus.txt");
            Files.lines(path).forEach(line -> System.out.println(line));
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}