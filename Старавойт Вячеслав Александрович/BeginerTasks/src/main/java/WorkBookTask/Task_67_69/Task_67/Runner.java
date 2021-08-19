package WorkBookTask.Task_67_69.Task_67;

import java.time.LocalDate;
//Задание создать простейший сервис с методом, который выводит на экран текущую дату.Сделайте его Singleton,используйте телепрограммы.
public class Runner {

    public static void main(String[] args) {
        LocalDate date =DateNow.getInst();
        System.out.println(date);
    }
}
