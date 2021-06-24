package WorkBookTask;

public class DistanceTime implements Comparable<DistanceTime> {
    private int sec;
    private int minute;
    private  int hour;

    public static void main(String[] args) {
        DistanceTime distanceTime =new DistanceTime(1,31,40);// создали первый объект
        DistanceTime distanceTime1 =new DistanceTime(9123); //создали второй объект
        print(distanceTime.compareTo(distanceTime1)); // сравнили два объекта и передали на вывод.
    }

    private DistanceTime(int hour, int minute, int sec) { // 1-конструктор получающий все параметры по отдельности
        this.hour = hour;
        this.minute = minute;
        this.sec = sec;
        System.out.println("Промемужуток в часах, минутах, секундах, объекта №1:  " + hour+" ч. "+minute+" мин. "+ sec + " сек.");
        System.out.println("Промежуток в секундах, объекта №1: "+toSec(hour, minute, sec) +" сек.");// отправляем в метод для подсчета секунд.
        System.out.println(); // добавил пустую струку для наглядности вывода.
    }

    private DistanceTime(int sec) {     //2-конструктор получающий общее количество секунд для второго объекта
        this.sec = sec;                 // По условию Максима добавил в конструктор перевод с секунд обратно в часы, мин,сек
        int hour=sec/3600;
        int newSec =0;
        int minute=0;
            if (sec>3600){
                 minute= (sec%3600)/60;
                 newSec=sec- (hour*3600)-(minute*60);
            }
            else {
                 minute = sec / 60;
                newSec=sec-minute*60;
            }
        System.out.println("Промемужуток в часах, минутах, секундах, объекта №2:  " + hour+" ч. "+minute+" мин. "+newSec + " сек.");
        System.out.println("Промежуток в секундах, обьекта №2: "+ sec + " сек." );
        System.out.println();


    }


    private int toSec(int hour, int minute, int sec) { //Метод для получения полного количества секунд в объекте;
        int sumSec = hour * 3600 + minute * 60 + sec;
        return sumSec;
    }



    public static void print(int i) { // метод для вывода
        if (i == 1) {
            System.out.println("Объект №1 БОЛЬШЕ Объекта №2");
        } else if (i == -1) {
            System.out.println("Объект №1 МЕНЬШЕ Объекта №2");
        } else System.out.println("Объекты РАВНЫ");
    }

    @Override
    public int compareTo(DistanceTime o){
    if(o==null){ return 0; }
    else if(toSec(hour,minute,sec)>o.sec){ return 1;}
    else if (toSec(hour,minute,sec)<o.sec){ return -1;}
    return 0;
}
}

