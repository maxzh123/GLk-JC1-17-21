package PreviousTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task14 { //я тут переделала немного, чтобы long не вводить
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите целое положительное число");
            String str = scanner.nextLine();
        try {
            int i = Integer.parseInt(str);
            char[] ch = str.toCharArray();
            for (char character : ch) {
            if(i>Integer.MAX_VALUE) {
                throw new InputMismatchException();
            } else if (!(Character.isDigit(character))) {
                throw new NumberFormatException();
                    }
                }
            int ostotdelenia = 0;
            int summ = 0;
            do {
                ostotdelenia = i % 10;
                summ = summ + ostotdelenia;
                i = i / 10;
            } while (i > 0);
            System.out.println(summ);
        } catch (InputMismatchException  e) {
            System.out.println("Вы ввели слишком большое число, введите число меньше 2 147 483 647" + e);
        }
        catch (NumberFormatException exp) {
           System.out.println("Введите числовое представление числа, например не один, а 1 " + exp);
                   }
                }
            }


