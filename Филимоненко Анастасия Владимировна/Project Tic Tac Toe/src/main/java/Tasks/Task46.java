package Tasks;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;


public class Task46 {
    public static void main(String[] args) throws IOException{
        Path path= Path.of("E:\\english");
        try (DirectoryStream<Path> paths= Files.newDirectoryStream(path)){
            for (Path path1: path){
                if (Files.isDirectory(path)){
                    System.out.println("Directory:" + path);
                }
                if (Files.isRegularFile(path)){
                    System.out.println("File" + paths);
                }
            }

        }
        }
}
