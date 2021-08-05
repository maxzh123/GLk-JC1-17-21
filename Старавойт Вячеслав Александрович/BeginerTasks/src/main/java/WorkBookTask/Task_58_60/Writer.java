package WorkBookTask.Task_58_60;

import WorkBookTask.Task_46_51_WorkWithFile.Task_50.Writer2;

import java.io.File;
import java.util.Date;


public class Writer {
    private final static String[] strings = new String[]{"Привет","Опа привет!","Здрасце!","Хай ла лэй!","Доброе утро!","Привет чувачок","Надоело, пошли кушать!","Пошли гулять!","Трындец!","Это конец!"};

    public static void writeInFile(File file) {
        ObjectStateWriter writer = new ObjectStateWriter(file); //создали объект с состоянием
        for (int i = 0; i <10 ; i++) { // заполняем двумя случайными строками.
            String random =strings[(int) (Math.random() * 10)]; //генерируем числа 0-9 именно размерность массива)
            writer.write(random +" -записал это поток под названием "+Thread.currentThread().getName()+""+
                    " Время записи "+new Date() + "\n");
        }
        writer.close();
    }
}
