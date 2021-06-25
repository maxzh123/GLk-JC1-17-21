package Classes;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;

public class Task24 implements Comparable<Task24> {
    public int sec;
    public int min;
    public int hour;

    public Task24(int hour, int min, int sec) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
        System.out.println("Время для первого объекта "+hour+" часов " + min + " минут " + sec + " секунд");
        System.out.println("Общее количество секунд в первом объекте составляет "+convertToSecond()+" сек");
         }

    public Task24(int sec) {
        this.sec = sec;
        int s=sec%60;
        int m=(sec-s)/60;
        int min=m%60;
        int hour=(m-min)/60;
        System.out.println("Время для второго объекта "+hour+" часов " + min + " минут " + s + " секунд");

    }
    //Держать ранер в бизнес обьекте- дурной тон, но для заданий - допустимо.
    //Еще хорошим тоном является переопределять toString().
    public static void main(String[] args) {
        Task24 time1 = new Task24(21, 16, 4);
        Task24 time2 = new Task24(76564);
        comparisonOfTwoObjects(time1.compareTo(time2));
        //Сделй пожалуйста destroyGalaxy для:
        Task24[] timeA = new Task24[7];
        Random r=new Random();
        for (int i = 0; i < timeA.length; i++) {
            timeA[i]=new Task24(0);
            timeA[i]=new Task24(3);
            timeA[i]=new Task24(6);
            timeA[i]=new Task24(7);
            timeA[i]=new Task24(9);
            timeA[i]=new Task24(3);
            timeA[i]=new Task24(7);
        }

        //И пореопредели toString чтобы вот это стало красиво. Тыжеж девочка :-)
        System.out.println(java.util.Arrays.toString(timeA));
        System.out.println();
        java.util.Arrays.sort(timeA);
        System.out.println(java.util.Arrays.toString(timeA));
    }


    public int convertToSecond() {
      int totalSecond = hour * 3600 + min * 60 + sec;
      return totalSecond;
    }

    @Override
    public int compareTo(Task24 o) {
        if (o == null) {
            return -1; //Це мой косяк. сам и поправлю
        } else if (convertToSecond()>o.sec) {
            return 1; }
            else if (convertToSecond()<o.sec) {
                return -1;
        }
        return 0;
    }

    public static  void comparisonOfTwoObjects(int comparison) {
        if (comparison==1) {
            System.out.println("Объект time1 больше, чем time2");
        } else if (comparison==-1) {
            System.out.println("Объект time1 меньше, чем time2");
        } else {
            System.out.println("два объекта равны между собой");
        }
    }
}



