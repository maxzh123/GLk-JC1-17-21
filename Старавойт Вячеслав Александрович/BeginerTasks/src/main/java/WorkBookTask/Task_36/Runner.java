package WorkBookTask.Task_36;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countSeason = scanner.nextInt();
//        int winter =Season.WINTER.getId() ;
//        int spring =Season.SPRING.getId();
//        int summer =Season.SUMMER.getId();
        switch (countSeason){
            case Season.WINTER.getId():
                System.out.println("Следующее Весна");
        }
             case Season.WINTER.getId() :
        System.out.println("Следующее лето");


    }
}