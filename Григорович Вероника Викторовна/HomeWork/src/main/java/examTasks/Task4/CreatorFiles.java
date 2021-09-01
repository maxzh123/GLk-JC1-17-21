package examTasks.Task4;

import java.io.File;
import java.io.IOException;

public class CreatorFiles {
    static File dir = new File("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\TxtFiles");
    File file;
    static File [] fs=dir.listFiles();
    int countFiles;

    public void createFile() throws IOException {
        while (countFiles < 20) {
            countFiles++;
            file = new File(dir, "NewFile" + countFiles + ".txt");
            if (!file.createNewFile()) { //если файл такой уже есть, удаляем и заново записываем
                file.delete();
                file.createNewFile();
            }
        }
    }
}
