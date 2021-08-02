package tasks58_60.task58;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class fileWriter {
    public static void writeInFile(File file) {
        try(FileWriter fileWriter=new FileWriter(file, true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)) {
               bufferedWriter.write(String.valueOf(SomeStrings.getSomeStrings()));
         //      bufferedWriter.write(" \tпишется потоком "+Thread.currentThread().getName());

            }
         catch (Exception e) {
            e.printStackTrace();
        }
    }
}
