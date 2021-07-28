package Tasks52_54.task54;

import java.io.File;
import java.io.IOException;

public class CreateFiles {
    static File dir=new File("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks52_54\\task54");
   static File file;

   public static void createNewFile(File file) {
       try {
           CreateFiles.file = new File(CreateFiles.dir, "Task54.txt");
           if (!CreateFiles.file.createNewFile()) { //если файл такой уже есть, удаляем и заново записываем
               CreateFiles.file.delete();
               CreateFiles.file.createNewFile();
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}


