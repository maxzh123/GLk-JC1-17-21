import java.util.Random;

public class task11 {
    public static void main(String[] args) {
        DayOfWeek[] day = DayOfWeek.values();
        Random random = new Random();
        int index = random.nextInt(day.length);
        System.out.println(day[index]);
        plansOfWeek(index);
    }

        public static void plansOfWeek(int index) {
        switch (index) {
            case 0:
                System.out.println("работать");
                break;
            case 1:
                System.out.println("усиленно работать");
                break;
            case 2:
                System.out.println("ждать пятницу");
                break;
            case 3:
                System.out.println("думать про пятницу");
                break;
            case 4:
                System.out.println("пить");
                break;
            case 5:
                System.out.println("есть шашлыки");
                break;
            case 6:
                System.out.println("рыдать перед понедельником");
                break;
            default:
                System.out.println("другое");
        }
    }
}
