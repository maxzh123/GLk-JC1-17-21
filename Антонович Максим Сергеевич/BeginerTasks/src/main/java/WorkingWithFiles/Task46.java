package WorkingWithFiles;

import java.io.File;

public class Task46 {


    public static void main(String[] args) {

        File file1 = new File("D:\\Homework\\new literature");
        System.out.println("Список файлов");
        for (File files : file1.listFiles()) {
            if (files.isFile()) {
                System.out.println(files.getName());
            } }
        System.out.println("Список каталогов");
        for (File files : file1.listFiles()) {
            if ( files.isDirectory()){
                System.out.println(files.getName());
            }
        }
    }
}
