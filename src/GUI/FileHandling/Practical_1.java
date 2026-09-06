package GUI.FileHandling;
import java.io.IOException;
import java.nio.file.*;
public class Practical_1 {
    public static void main(String[] args) throws IOException
    {
        Path source = Paths.get("File1.txt");
        Path dest = Paths.get("File2.txt");
//        Files.copy(source,dest); //if destination file is no there
        Files.copy(source,dest,StandardCopyOption.REPLACE_EXISTING);//use when destination is already exists
    }
}
