package WorkBookTask.Task_67_69.Task_67;


import java.time.LocalDate;
import java.time.LocalTime;

//Задание создать простейший сервис с методом, который выводит на экран текущую дату.Сделайте его Singleton,используйте телепрограммы.
public class Runner {

    public static void main(String[] args) {

        LocalDate date =DateNow.getInst(); // Double Checked Locking & volatile
        LocalTime time= DateNow1.INSTANCE; //  Static field
        System.out.println(date);
        System.out.println(time);
    }
}
