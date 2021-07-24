package Tasks46_51_Files.Task51;

import java.io.File;
import java.io.FileWriter;

public class Writer {
   public static void writeInFile(File file)  {
       try(FileWriter fileWriter=new FileWriter(file, false)) {
           for (int i=0; i<Person.people.length; i++) {
               fileWriter.write(Person.people[i] + " \n");
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
