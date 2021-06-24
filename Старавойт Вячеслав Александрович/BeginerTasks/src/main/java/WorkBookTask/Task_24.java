package WorkBookTask;

public class Task_24 {

    public static void main(String[] args) {

    }
    private static class DistanceTime{
        private int sec;
        private int minute;
        private  int hour;

        private DistanceTime(){     //1-конструктор получающий общее количество секунд

        }

        private DistanceTime(int hour,int minute, int sec){ // 2-конструктор получающий все параметры по отдельн





    }
    public int isSec(int hour,int minute,int sec){ //Метод для получения полного количества секунд в объекте;
        int sumSec= hour*3600 + minute*60 + sec;
        return sumSec;
    }

    public  boolean compareObject(Object n1,Object n2){ //Метод для сравнения двух объектов.

    }
}
