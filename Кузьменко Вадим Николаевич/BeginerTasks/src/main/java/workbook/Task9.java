package workbook;

import javax.swing.*;
import java.util.Scanner;

    public class Task9 {
        public static void main (String [] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int day = scanner.nextInt();
            //FIXME choosingTheCorrectCase(day);//Эта строка не собирается
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Введите месяц: ");
            int month = scanner1.nextInt();//Эта строка не собирается
            //FIXME choosingTheCorrectCase(month);
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Введите год: ");
            int year = scanner2.nextInt();
            //FIXME choosingTheCorrectCase(year);//Эта строка не собирается
            //Вы определили один метод с 3-мя параметрами и пытаетесь его вызвать 3 раза с 1. так не получится.
        }
        private static void choosingTheCorrectCase(int day, int month, int year) {
            System.out.println(String.valueOf(day) + String.valueOf(month) + String.valueOf(year));



        }
    }

