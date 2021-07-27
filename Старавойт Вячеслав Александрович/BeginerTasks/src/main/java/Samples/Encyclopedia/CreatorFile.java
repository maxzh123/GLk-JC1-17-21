package Samples.Encyclopedia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatorFile {

    protected static File fileText;

    public static  void createFiles(File file) {
        try {
            fileText= new File(file,ConfigScoring.NAME_TEXT_FILE);
            fileText.createNewFile();
            cleaningFile(); // на случай если файл создан и там есть информация.
        } catch (Exception e) {
            System.out.println("Ошибка по файлу, не может создать.");
        }
    }
    private static void cleaningFile() {
        FileWriter output = null;
        try {
            output = new FileWriter(fileText,false); //false для того чтобы стирались данные старые.
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.flush();
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
