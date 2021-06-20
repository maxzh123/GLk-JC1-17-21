
import javax.swing.*;
import java.util.Scanner;
public class date {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int day = scanner.nextInt();
        choosingTheCorrectCase(day);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите месяц: ");
        int month = scanner1.nextInt();
        choosingTheCorrectCase(month);
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner2.nextInt();
        choosingTheCorrectCase(year);
    }
    private static void choosingTheCorrectCase(int day. int month, int year) {
        System.out.println(day+1 + "month" + "year");



        }
    }

