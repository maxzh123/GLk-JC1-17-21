package tasks58_60.task60;

import Tasks52_54.task54.NewArray;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class WriterTask60 {

    public static synchronized  void writeInFile(File file) {

        try(FileWriter fileWriter=new FileWriter(file, true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)) {
                bufferedWriter.write("Hello World "+new Date());
               bufferedWriter.write(" \tпишется потоком "+Thread.currentThread().getName());
                bufferedWriter.append('\n');
            }
         catch (Exception e) {
            e.printStackTrace();
        }
    }
}
