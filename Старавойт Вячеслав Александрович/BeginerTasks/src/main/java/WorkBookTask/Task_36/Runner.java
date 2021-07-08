package WorkBookTask.Task_36;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countSeason = scanner.nextInt();
// Зима-1, Весна-2, Лето-3,Осень-4
// согласно условия вывел следующий сезон который человек ввел.
        if (countSeason>0 && countSeason<5){
            Season cArray[] = Season.values();
            if(countSeason==4){
                System.out.println(cArray[countSeason-countSeason]);
            }
            else{
            System.out.println(cArray[countSeason]);
            }
        }
        else{
            System.out.println("Нет такого числа сезонов всего 4.");
        }

    }
    }
