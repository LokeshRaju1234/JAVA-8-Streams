package GUI.FileHandling;
import java.io.IOException;
import java.nio.file.*;
public class lpu {

    public static void main(String[] args) throws IOException {
        //Path is representing a file we use Path to create directory
        Path p = Paths.get("C:\\ramesh\\lpu\\cse");
        Files.createDirectories(p);
        //Paths.get will retrieve the content of the path
        //used to create a file
        Path p1 = Paths.get("C:\\ramesh\\lpu\\cse\\lpu.txt");
        Files.createFile(p1);
    }
}
