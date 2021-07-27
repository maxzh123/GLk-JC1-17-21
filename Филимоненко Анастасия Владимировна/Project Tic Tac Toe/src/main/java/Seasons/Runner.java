package Seasons;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static final Scanner scanner=new Scanner(System.in);
    public static final Seasons [] seasons=Seasons.values();
    public static Seasons[] newSeasons= Arrays.copyOfRange(seasons, 1, seasons.length);

    public static void main(String[] args) {
        if (leapYearCheck().equals("не високосный")) {
            describeSeasons();
        } else { describeSeasonsLeapYear();
        }
        showNextSeason();
        showNumbersOfDaysInSeason();
    }

    public static String leapYearCheck() {
        System.out.println("Введите год от 1 до 3000");
        int year=scanner.nextInt();
        if (year%4==0) {
            return "високосный";
        } else if (year%100==0) {
            return "не високосный";
        } else if (year%400==0) {
            return "високосный";
        } else { return "не високосный";
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
        System.out.println("Сезон: "+Seasons.LEAPYEAR.description+". Количество дней в сезоне: "+Seasons.LEAPYEAR.countOfDays);
        System.out.println("Сезон: "+Seasons.SPRING.description+". Количество дней в сезоне: "+Seasons.SPRING.countOfDays);
        System.out.println("Сезон: "+Seasons.SUMMER.description+". Количество дней в сезоне: "+Seasons.SUMMER.countOfDays);
        System.out.println("Сезон: "+Seasons.AUTUMN.description+". Количество дней в сезоне: "+Seasons.AUTUMN.countOfDays);
    }

    public static void showNextSeason() {
        System.out.println("Введите число от 1 до 4");
        int nextSeason=scanner.nextInt();
        switch (nextSeason) {
            case 1:
                System.out.println("Следующий сезон после "+newSeasons[0]+" - это "+newSeasons[1]);
                break;
            case 2:
                System.out.println("Следующий сезон после "+newSeasons[1]+" - это "+newSeasons[2]);
                break;
            case 3:
                System.out.println("Следующий сезон после "+newSeasons[2]+" - это "+newSeasons[3]);
                break;
            case 4:
                System.out.println("Следующий сезон после "+newSeasons[3]+" - это "+newSeasons[0]);
                break;
            default:
                System.out.println("Вы ввели неправильное число");
        }
    }
    public static void showNumbersOfDaysInSeason() {
        System.out.println("Введите число от 1 до 4");
        int nextSeason=scanner.nextInt();
        switch (nextSeason) {
            case 1:
                System.out.println("Текущий сезон  "+newSeasons[0]+". Количество дней в сезоне: "+Seasons.WINTER.countOfDays);
                break;
            case 2:
                System.out.println("Текущий сезон  "+newSeasons[1]+". Количество дней в сезоне: "+Seasons.SPRING.countOfDays);
                break;
            case 3:
                System.out.println("Текущий сезон  "+newSeasons[2]+". Количество дней в сезоне: "+Seasons.SUMMER.countOfDays);
                break;
            case 4:
                System.out.println("Текуший сезон  "+newSeasons[3]+". Количество дней в сезоне: "+Seasons.AUTUMN.countOfDays);
                break;
            default:
                System.out.println("Вы ввели неправильное число");
        }

    }
}
