package WorkBookTask.Task_46_51_WorkWithFile.Task_51;

import java.io.File;

public class CreatorFile {

 protected static File fileText;

    protected static  void createFiles(File file) {
        try {
             fileText= new File(file,"test.txt");
                fileText.createNewFile();

        } catch (Exception e) {
            System.out.println("Ошибка по файлу, не может создать.");
        }
    }
}
