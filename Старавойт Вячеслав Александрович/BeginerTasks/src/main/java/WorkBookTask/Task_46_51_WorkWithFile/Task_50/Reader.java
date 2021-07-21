package WorkBookTask.Task_46_51_WorkWithFile.Task_50;

import java.io.*;
import java.util.ArrayList;

public class Reader {
static ArrayList<Integer> listGlobal =new ArrayList<Integer>();

    public static void readingFile(File[] array) {
        for (File file : array) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));) { // для автоматического закрытия потока или его очистки.
                String res;
                while ((res = bufferedReader.readLine()) != null) {
                    String[] strings = res.split("\\s+");
                    for (String str : strings) {
                        try {
                            int number = Integer.parseInt(str);
                            listGlobal.add(number);
                        } catch (NumberFormatException e) { // нужно для того чтобы если будут попадаться слова в файле, просто игнорировать и идти дальше.
                        e.printStackTrace();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
