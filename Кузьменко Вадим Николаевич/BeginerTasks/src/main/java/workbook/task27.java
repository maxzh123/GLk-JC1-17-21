package workbook;

import java.util.Scanner;

//FIXME 1. Исходники должны выть валидными и корректными.
//FIXME 2. Посмотрите как работает для: "... ... ... ...". Это задание на регулярки
public class task27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Предложение введи" );
        String input = sc.nextLine();
        int count = 0;

        if(input.length() !=0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt (i) == ' ') {
                    count++;

                }
            }
            System.out.println("ты ввел" + ' ' + count + ' ' + "слов");
        }
    }
}
