package tasks58_60.task58;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class fileCreator {
    static File dir=new File("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\tasks58_60\\task58");
    static File file;
    static int countFiles;
    static List<File>fileList=new ArrayList<File>();

    public static void createNewFile(File file) {
        try {
            while (countFiles < 10) {
                countFiles++;
                file = new File(dir, "NewFile" + countFiles + ".txt");
                fileList.add(file);
          //      fileList.forEach(System.out::println);
                if (!file.createNewFile()) { //если файл такой уже есть, удаляем и заново записываем
                    file.delete();
                    fileList.clear();
                    file.createNewFile();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

