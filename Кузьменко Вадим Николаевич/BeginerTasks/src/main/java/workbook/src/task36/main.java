package task36; /// Не понимаю чего не работает
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите сезон");
        String translation = scanner.nextLine();

        if (translation == "Лето") translation = "Summer";
        else if (translation == "Осень") translation = "Winter";
        else if (translation == "Зима") translation = "Spring";
        else if (translation == "Весни") translation = "Autumn";


        System.out.println(translation);
    }
}

