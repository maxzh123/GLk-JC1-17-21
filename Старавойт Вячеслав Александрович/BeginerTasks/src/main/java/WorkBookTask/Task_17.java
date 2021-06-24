package WorkBookTask;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        NumberFormat f = NumberFormat.getInstance(); // использовали библиотеку для разбивания числа в бухгалтерсом ввиде
        System.out.println(f.format(number));
    }
}

    /*    int number = scanner.nextInt();
        while (number!=0) {
            arrays.add(number % 1000);
            number/=1000;
        }
        for(int i=arrays.size()-1;i>=0;i--){
            System.out.print(arrays.get(i)+" ");
        }
    }
}

    */