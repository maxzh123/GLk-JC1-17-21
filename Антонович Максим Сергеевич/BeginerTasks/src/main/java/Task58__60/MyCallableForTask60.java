package Task58__60;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

public class MyCallableForTask60 implements Callable {

    List<String> list = new ArrayList<String>();
    String string = "Hello World";

    @Override
    public List<String> call() throws Exception {
        synchronized (string) {
            Thread.sleep(1000);
            List<String> list = new ArrayList<String>();
            for (int i = 0; i < 10; i++) {
                File file = new File("D:\\New\\" + i + ".txt");
                try (FileWriter fileWriter = new FileWriter(file, true);
                     BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                    bufferedWriter.write(string + "___" + Thread.currentThread().getName() + "___" + new Date() + "\n");
                    list.add(file.getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return list;
        }
    }
}

