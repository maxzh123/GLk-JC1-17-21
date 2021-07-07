package WorkBookTask.Task_37;

import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сезон года на латинице, я выведу тебе кол-во дней в месяце.");
        String nameSeason = scanner.nextLine();
        try {
            System.out.println(Season.valueOf(nameSeason.toUpperCase(Locale.ROOT)).getCountOfDay()); //храним только в верхнем регистре
        }
        catch (Exception e){
            System.out.println("Введен не правильный сезон года");
        }
    }
}
