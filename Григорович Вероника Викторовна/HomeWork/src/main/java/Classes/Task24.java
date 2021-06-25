package Classes;

import java.sql.SQLOutput;

public class Task24 implements Comparable<Task24> {
    public int sec;
    public int min;
    public int hour;

    public Task24(int hour, int min, int sec) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public Task24(int sec) {
        this.sec = sec;
    }

    public static void main(String[] args) {
        Task24 time1 = new Task24(21, 16, 4);
        Task24 time2 = new Task24(873453);
        time1.checkTime();
        int totalSecond=time1.convertToSecond();
        System.out.println("Общее количество секунд в первом объекте составляет "+totalSecond+" сек");
        comparisonOfTwoObjects(time1.compareTo(time2));
    }

    public void checkTime() { //метод который проверяет что введено
        try {
            if (hour >= 24 || min >= 60 || sec >= 60) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Вводите часы меньше 24, минуты меньше 60, секунды меньше 60");
            ;
        }
    }

    public int convertToSecond() {
      int totalSecond = hour * 3600 + min * 60 + sec;
      return totalSecond;
    }

    @Override
    public int compareTo(Task24 o) {
        if (o == null) {
            return 0;
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



