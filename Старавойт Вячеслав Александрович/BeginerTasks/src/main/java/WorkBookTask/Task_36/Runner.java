package WorkBookTask.Task_36;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countSeason = scanner.nextInt();
//        int winter =Season.WINTER.getId() ;
//        int spring =Season.SPRING.getId();
//        int summer =Season.SUMMER.getId();
        Season.WINTER.nameNext(countSeason);
        if (countSeason>0 && countSeason<5){
            nameNext(countSeason);
        }

        }



    }
