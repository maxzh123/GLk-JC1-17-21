package WorkBookTask.Task_46_51_WorkWithFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Задание: вывести список файлов и каталогов выбранного файла на диске.
// Файлы и каталоги должны быть распечатаны отдельно.

public class Task_46 {
    public static void main(String[] args) throws IOException {
        String path = "./BeginerTasks"; // выбрал каталог
        File file = new File(path);
        File[] array =file.listFiles();
        List<File> list = Arrays.asList(array);

        CheckIsDirectory(list);
        System.out.println("--------------И собственно ниже файлы которые хранятся в этой директрии: ");
        CheckIsFile(list);
    }


    static void CheckIsDirectory(List<File> list) {
        for (int i = 0; i < list.size(); i++) {
         if(list.get(i).isDirectory()){
             System.out.println(list.get(i));
         }
        }
    }
    static void CheckIsFile(List<File> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).isFile()){
                System.out.println(list.get(i));
            }
        }
    }
}
