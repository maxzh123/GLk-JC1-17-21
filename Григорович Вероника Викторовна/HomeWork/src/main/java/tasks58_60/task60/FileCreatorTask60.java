package tasks58_60.task60;

import Tasks52_54.task54.CreateFiles;

import java.io.File;
import java.io.IOException;

public class FileCreatorTask60 {

        static File dir=new File("C:\\Users\\grigorovich\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\tasks58_60\\task60");
        static File file;

        public static void createNewFile(File file) {
            try {
                FileCreatorTask60.file = new File(FileCreatorTask60.dir, "Task60.txt");
                if (!FileCreatorTask60.file.createNewFile()) { //если файл такой уже есть, удаляем и заново записываем
                    FileCreatorTask60.file.delete();
                    FileCreatorTask60.file.createNewFile();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


