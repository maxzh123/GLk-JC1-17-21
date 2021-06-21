import java.util.Scanner;

public class Task_11 {


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите день недели для проверки рассписания, цифрой: ");
        days(scanner.nextInt());
    }


    public static void  days( int day){
        switch (day){
            case 1:
                System.out.println("Встреча в 10-00 с директором Epam");
                System.out.println("Тренировка - 18-00");
                break;
            case 2:
                System.out.println("Пойти в кино -22:00");
                break;
            case 3:
                System.out.println("Учеба It Academy - 18:30");
                break;
            case 4:
                System.out.println("Сделать все д.з. - all day");
                break;
            case 5:
                System.out.println("Ресторан - 19:00");
                break;
            case 6:
                System.out.println("Пляж - 14:00");
                break;
            case 7:
                System.out.println("Поездка в лес");
                break;
        }

    }
}
