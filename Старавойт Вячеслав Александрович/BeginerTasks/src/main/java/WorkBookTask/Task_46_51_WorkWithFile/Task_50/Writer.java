package WorkBookTask.Task_46_51_WorkWithFile.Task_50;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void writeInFile(File file) {
        // Это писалка. Ей фиолетово что и куда писать. Она просто делает свою работу.
        Writer2 writer = new Writer2(file);
        //А здесь мы абстрагируемся от внутренностей писалки, и просто реализуем свою идею.
        for (int i = 1; i < 11; i++) { // заполняем 10 случайными числами.
            int random = (int) (Math.random() * 1000);
            writer.write(String.valueOf(random) + " ");
        }
        writer.close();
    }

    public static void writeInFileGlobal(File file) {
        Writer2 writerGlobal = new Writer2(file);
        for (int i = 0; i < Reader.listGlobal.size(); i++) {
            writerGlobal.write(String.valueOf(Reader.listGlobal.get(i)) + " ");
        }
        writerGlobal.close();
    }

    public static void writeInFileDirectory(File file) {
        Writer2 writerDirectory = new Writer2(file);
        File folder = new File(Runner.directory);
        for (File f : folder.listFiles()) {
            writerDirectory.write(f.getName() + "\n "); //для вывода файлов столбиком)
        }
        writerDirectory.close();
    }
}
