import java.util.InputMismatchException;
import java.util.Scanner;

public class task14 { //я тут переделала немного, чтобы long не вводить
    public static void main (String [] args) {
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Введите целое положительное число");
            String str=scanner.nextLine();
            int i=Integer.parseInt(str);
            int ostotdelenia=0;
            int summ=0;
            do {
                ostotdelenia=i%10;
                summ=summ+ostotdelenia;
                i=i/10;
            } while (i>0);
            System.out.println(summ);
        } catch (NumberFormatException exp) {
            System.out.println("Введите числовое представление числа, например не один, а 1 " + exp);
    } catch (InputMismatchException e) {
            System.out.println("Вы ввели слишком большое число, введите число меньше 2 147 483 647" + e);
        }
    }
}
