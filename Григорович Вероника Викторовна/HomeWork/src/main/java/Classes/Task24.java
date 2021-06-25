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

    public Task24(int sec) { //Ну и кому он такой ущербьный нужен. надо чтобы он эти секунды распилил на часы и минуты и сам все честно себе заполнил.
        this.sec = sec;
    }
    //Держать ранер в бизнес обьекте- дурной тон, но для заданий - допустимо.
    //Еще хорошим тоном является переопределять toString().
    public static void main(String[] args) {
        Task24 time1 = new Task24(21, 16, 4);
        Task24 time2 = new Task24(873453);
        time1.checkTime();
        int totalSecond=time1.convertToSecond();
        System.out.println("Общее количество секунд в первом объекте составляет "+totalSecond+" сек");
        comparisonOfTwoObjects(time1.compareTo(time2));
        //Сделй пожалуйста destroyGalaxy для:
        Task24[] timeA = new Task24[30];
        //И пореопредели toString чтобы вот это стало красиво. Тыжеж девочка :-)
        System.out.println(java.util.Arrays.toString(timeA));
        java.util.Arrays.sort(timeA);
        System.out.println(java.util.Arrays.toString(timeA));


    }
    public void checkTime() { //метод который проверяет что введено
/*неа. метод, который что-то куда-то пишет. и я не смогу поменять что пишется и куда.
он либо должен возвращать true/false либо Null/Строка с описанием проблемы.
Либо выбрасывать Exception и пусть его обрабатывает кто хочет и как хочет, но exception должен содержать message.
А это метод который нельзя использовать никак кроме как показать мне.
*.
 */
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



