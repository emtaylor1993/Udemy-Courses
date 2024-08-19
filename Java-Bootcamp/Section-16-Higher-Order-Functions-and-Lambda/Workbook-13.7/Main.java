/**
 * MAIN
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates how to use higher order 
 *    functions with data sources.
 * 
 * @packages
 *    Java IO (IOException)
 *    Java New IO (Files, Path, Paths)
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("emails.txt");
        Files.lines(path)
            .filter(line -> !line.startsWith("Spam"))
            .forEach(line -> System.out.println(line));
    }
}
