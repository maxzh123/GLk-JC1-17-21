package WorkBookTask.Task_46_51_WorkWithFile.Task_50;

import java.io.*;

// Задание создать три подкаталога, 5 файлов, записать туда 10 произвольных чисел.Содержимое всех файлов записать в один файл.Создать файл который будет содержать список файлов данного каталога.
public class Runner {

    public static String directory = "C:\\Users\\Победитель\\GLk-JC1-17-21\\Старавойт Вячеслав Александрович\\BeginerTasks\\src\\main\\java\\WorkBookTask\\Task_46_51_WorkWithFile\\Task_50\\test1\\test2\\test3\\";

    public static void main(String[] args) {
        File file = new File(directory);
        if (!file.exists()) { //проверяем есть ли такие каталоги,если нет то создаем.
            file.mkdirs(); }// создали цепочку из трех папок.
        Creater creater =new Creater();

        creater.createFiles(file); // создание файлов по условию 5 штук.
        creater.сreateFileGlobal(file); // общий файл который будет хранить всю информацию из 5 файлов.
        creater.сreateFileDirectory(file);// файл который будет содержать список файлов данного каталога.

         for (int i =0; i<Creater.array.length;i++){  // запись данных в файлы,будут записаны числа рандомом.
               Writer.writeInFile(Creater.array[i]);
         }
            Reader.readingFile(Creater.array); // передаем в чтение файлы которые нужно прочитать и обработать.
            Writer.writeInFileGlobal(Creater.global); // запись данных в в один общий файл
            Writer.writeInFileDirectory(Creater.directoryList); // запись в файл всех файлов хранящихся в данном каталоге.
    }
}