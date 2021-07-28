package Tasks46_51_Files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task46 {
    static Path p = Path.of("D:\\английский");


    public static void main(String[] args) throws IOException {
       try (DirectoryStream<Path> path = Files.newDirectoryStream(p)) {
            for (Path paths : path) {
                if (Files.isDirectory(paths)) {
                    System.out.println("Это директория: " + paths);
                }
                if (Files.isRegularFile(paths)) {
                    System.out.println("Это файл: " + paths);
                }
           }
       }
    }
}
