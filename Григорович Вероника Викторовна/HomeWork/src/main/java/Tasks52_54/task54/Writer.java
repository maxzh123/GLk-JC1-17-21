package Tasks52_54.task54;

import Tasks46_51_Files.Task51.Person;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Writer {
    public static void writeInFile(File file)  {
        try(FileWriter fileWriter=new FileWriter(file, false);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)) {
            for (int i = 0; i< NewArray.array.length; i++) {
                bufferedWriter.write(NewArray.array[i] + " \n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
