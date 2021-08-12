package Task58__;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<List<String>> {
    List<String> list = new ArrayList<String>();
    @Override
    public List<String> call() throws Exception {

        Thread.sleep(1000);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            File file = new File("D:\\a." + i + ".txt");
            try (FileWriter fileWriter = new FileWriter(file, true);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write("s"+"\n"+Thread.currentThread().getName());
                list.add(file.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
