package tasks58_60.task58;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fileCreator {
    static File dir = new File("C:\\Users\\grigorovich\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\tasks58_60\\task58\\txtFiles");
    static File file;
    static File generalFile;
    static File [] fs=dir.listFiles();
    static int countFiles;


    public static void createFile(File file) throws IOException {
        while (countFiles < 10) {
            countFiles++;
            file = new File(dir, "NewFile" + countFiles + ".txt");
            if (!file.createNewFile()) { //если файл такой уже есть, удаляем и заново записываем
                file.delete();
                file.createNewFile();
            }
        }
//       for (File s : fs) { проверялав правильно ли выводит
//           System.out.println(s);
 //      }
    }

    public static void createGeneralFile(File files) throws IOException {
        generalFile=new File(dir, "Generalfile.txt");
        if (!generalFile.createNewFile()) { //если файл такой уже есть, удаляем и заново записываем
            generalFile.delete();
            generalFile.createNewFile();
        }
    }
}


