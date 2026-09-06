package GUI.FileHandling;
import java.nio.file.*;
import java.io.IOException;
public class RelativePathPractice {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("lpufile.txt");
        if(!Files.exists(p)){
            Files.createFile(p);
        }
       //how to convert relative path to absolute path
        System.out.println(p); //p will be the only file
        p = p.toAbsolutePath();
        System.out.println(p);//p will be the path
        System.out.println(p.getFileName());
        System.out.println(p.getParent());
        System.out.println(p.getRoot());
        System.out.println(Files.isRegularFile(p));
        System.out.println(Files.isDirectory(p));

        Path p1 = Paths.get("abc");
        Files.createDirectories(p1);
        System.out.println(Files.isDirectory(p1));
    }
}
