

import java.util.Scanner;

public class Task35 {
    public static final Scanner scanner=new Scanner(System.in);
    public static final Seasons [] seasons=Seasons.values();

    public static void main(String[] args) {
        leapYearCheck();
        if (leapYearCheck().equals("обычный")) {
            describeSeasons();
        } else { describeSeasonsLeapYear();
        }
        showNextSeason();
    }

    public static String leapYearCheck() {
        System.out.println("Введите год от 1 до 3000");
        int year=scanner.nextInt();
        if (year%4==0) {
            return "високосный";
        } else if (year%100==0) {
            return "обычный";
        } else if (year%400==0) {
            return "високосный";
        } else { return "обычный";
        }
    }


    public static void describeSeasons(){
        System.out.println("Год не високосный");
        System.out.println("Сезон: "+Seasons.WINTER.description+". Количество дней в сезоне: "+Seasons.WINTER.countOfDays);
        System.out.println("Сезон: "+Seasons.SPRING.description+". Количество дней в сезоне: "+Seasons.SPRING.countOfDays);
        System.out.println("Сезон: "+Seasons.SUMMER.description+". Количество дней в сезоне: "+Seasons.SUMMER.countOfDays);
        System.out.println("Сезон: "+Seasons.AUTUMN.description+". Количество дней в сезоне: "+Seasons.AUTUMN.countOfDays);

    }

    public static void describeSeasonsLeapYear(){
        System.out.println("Год високосный");
        System.out.println("Сезон: "+Seasons.WINTERLEAPYEAR.description+". Количество дней в сезоне: "+Seasons.WINTERLEAPYEAR.countOfDays);
        System.out.println("Сезон: "+Seasons.SPRING.description+". Количество дней в сезоне: "+Seasons.SPRING.countOfDays);
        System.out.println("Сезон: "+Seasons.SUMMER.description+". Количество дней в сезоне: "+Seasons.SUMMER.countOfDays);
        System.out.println("Сезон: "+Seasons.AUTUMN.description+". Количество дней в сезоне: "+Seasons.AUTUMN.countOfDays);
    }

    public static void showNextSeason() {

    }

}
