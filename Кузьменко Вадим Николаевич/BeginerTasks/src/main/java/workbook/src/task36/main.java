package task36;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.lineSeparator());
        String Season = scanner.nextLine();
        if (Season == season.SPRING) Season = season.SUMMER;
        if (Season == season.SUMMER) Season = season.AUTUMN;
        if (Season == season.AUTUMN) Season = season.WINTER;
        if (Season == season.WINTER) Season = season.SPRING;
        System.out.println(Season);
    }
}
