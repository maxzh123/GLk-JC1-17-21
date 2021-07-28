package Task37;


import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("ВВедите название месяца");
        try {
            String sc = scanner.next();
            Enum season = Enum.valueOf(sc);
            switch (season) {
                case Winter:
                    System.out.println(Enum.Winter);
                    break;
                case Spring:
                    System.out.println(Enum.Spring);
                    break;
                case Summer:
                    System.out.println(Enum.Summer);
                    break;
                case Autumn:
                    System.out.println(Enum.Autumn);
                    break;
            }
        }catch (IllegalArgumentException e) {
            System.out.println("Вы ввели что-то отличное от названия месяца по английски");
        }
    }
}
