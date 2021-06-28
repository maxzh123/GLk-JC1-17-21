import java.util.Scanner;

public class task_11 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        int num = name.nextInt();
        if (num == 1)
            System.out.println("понедельник: " + "сидеть дома");
        else if (num == 2)
            System.out.println("вторник: " + "выгулять собаку");
        else if (num == 3)
            System.out.println("среда: " + "пойти в кино");
        else if (num == 4)
            System.out.println("четверг: " + "ждать пятницу");
        else if (num == 5)
            System.out.println("пятница: " + "время тусить");
        else if (num == 6)
            System.out.println("суббота: " + "выйти в парк");
        else if (num == 7)
            System.out.println("воскресенье: " + "ждать понедельника");
    }
}