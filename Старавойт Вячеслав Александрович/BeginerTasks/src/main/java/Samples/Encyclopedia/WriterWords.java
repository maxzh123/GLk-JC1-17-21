package Samples.Encyclopedia;

import WorkBookTask.Task_46_51_WorkWithFile.Task_51.Person;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterWords {

    protected static void writeInFile(String s) {
        FileWriter output = null;
        try {
            output = new FileWriter(CreatorFile.fileText, true);
            BufferedWriter writer = new BufferedWriter(output);
                writer.write(String.valueOf(s+" \n"));
            writer.flush();
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

