package WorkBookTask.Task_46_51_WorkWithFile.Task_51;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterPerson {

    protected static void writeInFile(File file) {
        FileWriter output = null;
        try {
            output = new FileWriter(file, false); //false для того чтобы стирались данные старые.
            BufferedWriter writer = new BufferedWriter(output);
            for (int i = 0; i <Person.amount; i++) {
                writer.write(String.valueOf(Person.arrayPerson[i]+" \n"));
            }
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
