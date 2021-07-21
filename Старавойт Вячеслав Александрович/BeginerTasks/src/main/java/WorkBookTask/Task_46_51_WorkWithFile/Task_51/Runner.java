package WorkBookTask.Task_46_51_WorkWithFile.Task_51;

import java.io.File;
// Задача созать объект Person c полями name,surname,age. Сгенерировать 10 объектов класс Person  со случайными полями, создать файл куда эти данные все запишуться.
public class Runner {
    protected static String directory = "C:\\Users\\Победитель\\GLk-JC1-17-21\\Старавойт Вячеслав Александрович\\BeginerTasks\\src\\main\\java\\WorkBookTask\\Task_46_51_WorkWithFile\\Task_51\\test\\";

    public static void main(String[] args) {
        Person person = new Person(10); // создаем рандомом 10 персон, можно ввести любое кол-во персон до 10 и будет работью
        File file = new File(directory);

        CreatorDirectory.creatorDirectoryNow(file); // cоздаем каталог если требуется.
        CreatorFile.createFiles(file); // создаем файл куда будем записывать
        WriterPerson.writeInFile(CreatorFile.fileText);
    }
}
