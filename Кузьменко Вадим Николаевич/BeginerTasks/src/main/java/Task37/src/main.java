package Task37.src;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи название сезона на английском");
        String nameSeason = scanner.nextLine();

            System.out.println(Season.valueOf(nameSeason).DAY());

    }
}
