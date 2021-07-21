package WorkBookTask.Task_46_51_WorkWithFile.Task_50;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void writeInFile2(File file) {
        // Это писалка. Ей фиолетово что и куда писать. Она просто делает свою работу.
        Writer2 writer=new Writer2(file);
        //А здесь мы абстрагируемся от внутренностей писалки, и просто реализуем свою идею.
        for (int i = 1; i < 11; i++) { // заполняем 10 случайными числами.
            int random = (int)(Math.random()*1000);
            writer.write(String.valueOf(random)+" ");
        }
        writer.close();
    }

    protected static void writeInFile(File file) {
        FileWriter output = null;
        try {
            output = new FileWriter(file, false); //false для того чтобы стирались данные старые.
            BufferedWriter writer = new BufferedWriter(output);
            for (int i = 1; i < 11; i++) { // заполняем 10 случайными числами.
                int random = (int)(Math.random()*1000);
                writer.write(String.valueOf(random)+" ");
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
        protected static void writeInFileGlobal(File file) { // метод для записи всех файлов в один.
            FileWriter output = null;
            try {
                output = new FileWriter(file, false);
                BufferedWriter writer = new BufferedWriter(output);
                for (int i = 0; i < Reader.listGlobal.size(); i++) {
                    writer.write(String.valueOf(Reader.listGlobal.get(i))+" ");
            }
                writer.flush();
            } catch (NullPointerException e1){
                System.out.println(" А записать в глобальный файл не вышло."); }
              catch (IOException e) {
                e.printStackTrace(); }
            finally {
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
    protected static void writeInFileDirectory(File file) { //метод для записи какие файлы хранятся в папке.
        FileWriter output = null;
        try {
            output = new FileWriter(file, false); //false для того чтобы стирались данные старые.
            BufferedWriter writer = new BufferedWriter(output);
            File folder = new File(Runner.directory);
            for (File f : folder.listFiles())
            {
                writer.write(f.getName()+"\n "); //для вывода файлов столбиком)
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
