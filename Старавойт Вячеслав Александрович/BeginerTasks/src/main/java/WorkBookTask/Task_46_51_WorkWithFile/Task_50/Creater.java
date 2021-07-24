package WorkBookTask.Task_46_51_WorkWithFile.Task_50;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Creater {

    public static File file1, file2, file3, file4, file5, global, directoryList;
    public static File[] array = new File[]{file1, file2, file3, file4, file5};
    public static String[] arrayNameFile = new String[]{"tes1.txt", "tes2.txt", "tes3.txt", "tes4.txt", "tes5.txt"};

    public  void createFiles(File file) {
        try {
            for (int i = 0; i < arrayNameFile.length; i++) {
                array[i] = new File(file, arrayNameFile[i]);
                array[i].createNewFile();
            }
        } catch (Exception e) {
            System.out.println("Ошибка по файлу, не может создать.");
        }
    }

    public void сreateFileGlobal(File file) { //метод для создания одного общего файла.
        try {
            global = new File(file, "global.txt");
            global.createNewFile();
        } catch (Exception e) {
            System.out.println("Ошибка по файлу, не может создать."); }
    }

    public void сreateFileDirectory(File file){ //метод для создания файла хранящий список файлов данного каталога.
        try{
            directoryList=new File(file,"directoryList.txt");
            directoryList.createNewFile();
        }
        catch (Exception e){
            System.out.println("Ошибка по файлу, не может создать.");
        }
    }
}
