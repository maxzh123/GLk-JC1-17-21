package examTasks.Task4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class WriterInFile {

    public synchronized void writeInFile(File f, List<Player> players) {

        try (FileWriter fileWriter = new FileWriter(f, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(String.valueOf(players));
     //       bufferedWriter.write(" \tпишется потоком " + Thread.currentThread().getName());
            bufferedWriter.write("\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

