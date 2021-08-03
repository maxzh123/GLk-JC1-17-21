package tasks58_60.task58;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;



public class fileWriter {
    public static void writeInFile(File file) {

        try(FileWriter fileWriter=new FileWriter(file, true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)) {
               bufferedWriter.write(String.valueOf(SomeStrings.getSomeStrings()));
               bufferedWriter.write(" \tпишется потоком "+Thread.currentThread().getName());
               bufferedWriter.write("\n");

            }
         catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeInGlobalFile(File file) {
        try(FileWriter fileWriter=new FileWriter(file, false);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Список файлов в папке");
            bufferedWriter.write("\n");
            for (File s : fileCreator.fs) {
                bufferedWriter.write(s.getName());
                bufferedWriter.write("\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
