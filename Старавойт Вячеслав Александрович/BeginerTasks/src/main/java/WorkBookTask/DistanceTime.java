package WorkBookTask;

public class DistanceTime implements Comparable<DistanceTime> {
    private int sec;
    private int minute;
    private  int hour;

    public static void main(String[] args) {
        DistanceTime distanceTime =new DistanceTime(1,31,40);// создали первый объект
        DistanceTime distanceTime1 =new DistanceTime(5500); //создали второй объект
        print(distanceTime.compareTo(distanceTime1)); // сравнили два объекта и передали на вывод.
    }

    private DistanceTime(int hour, int minute, int sec) { // 1-конструктор получающий все параметры по отдельности
        this.hour = hour;
        this.minute = minute;
        this.sec = sec;
        System.out.println("Промежуток в секундах объекта №1: "+isSec(hour, minute, sec) +" сек.");
    }

    private DistanceTime(int sec) {     //2-конструктор получающий общее количество секунд для второго объекта
        this.sec = sec;
        System.out.println("Промежуток в секундах обьекта №2 "+ sec + " сек." );
    }


    private int isSec(int hour, int minute, int sec) { //Метод для получения полного количества секунд в объекте;
        int sumSec = hour * 3600 + minute * 60 + sec;
        return sumSec;
    }

    public static void print(int i) { // метод для вывода
        if (i == 1) {
            System.out.println("Первый объект БОЛЬШЕ второго");
        } else if (i == -1) {
            System.out.println("Первый объект МЕНЬШЕ второго");
        } else System.out.println("Объекты равны");
    }

    @Override
    public int compareTo(DistanceTime o){
    if(o==null){ return 0; }
    else if(isSec(hour,minute,sec)>o.sec){ return 1;}
    else if (isSec(hour,minute,sec)<o.sec){ return -1;}
    return 0;
}
}

