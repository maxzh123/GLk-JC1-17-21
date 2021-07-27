package Task36;

import javax.swing.*;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sc = scanner.next();
        Enum season = Enum.valueOf(sc);

        switch (season) {
            case Winter:
                System.out.println("Spring");
                break;
            case Spring:
                System.out.println("Summer");
                break;
            case Summer:
                System.out.println("Autumn");
            case Autumn:
                System.out.println("Winter");
        }
    }
}