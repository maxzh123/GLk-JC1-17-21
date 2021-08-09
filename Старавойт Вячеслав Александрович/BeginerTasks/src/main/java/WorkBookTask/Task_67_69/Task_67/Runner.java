package WorkBookTask.Task_67_69.Task_67;

import java.util.Date;
//Задание создать простейший сервис с методом, который выводит на экран текущую дату.Сделайте его Singleton,используйте телепрограммы.
public class Runner {

    public static void main(String[] args) {
        Date date =DateNow.getDate();
        System.out.println(date);
    }
}
