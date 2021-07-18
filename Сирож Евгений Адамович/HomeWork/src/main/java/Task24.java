

import java.util.Arrays;

public class Task24 {


    private int hour;
    private int min;
    private long sec;
    private int i;
    private int i1;

    public Task24(long sec) {
        this.sec = sec;
        int s = (int) (sec % 60);
        int m = (int) ((sec - s) / 60);
        int min = m % 60;
        int hour = (m - min) / 60;
        System.out.println("Время для второго объекта " + hour + " часов " + min + " минут " + s + " секунд");
    }


    public Task24(int hour, int min, int sec) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
        System.out.println("Время для первого объекта "+hour+" часов " + min + " минут " + sec + " секунд");

    }

    public static void main(String[] args) {
        Task24 time1 = new Task24(1, 1, 1);
        Task24 time2 = new Task24(0);
        comparisonOfTwoObjects(time1.compareTo(time2));

        Task24[] timeA = new Task24[1];
        for (int i = 0; i < timeA.length; i++) {
            timeA[i] = new Task24(1);
            timeA[i] = new Task24(10);
            timeA[i] = new Task24(100);
            timeA[i] = new Task24(1000);
            timeA[i] = new Task24(10000);
            timeA[i] = new Task24(100000);
            timeA[i] = new Task24(1000000);

            timeA[i] = new Task24((int) (Math.random() * 5));

        }


//        System.out.println(java.util.Arrays.toString(timeA));
//        System.out.println();
//        System.out.println(Arrays.toString(timeA));
//        System.out.println("_______________________________");

//        System.out.println(java.util.Arrays.toString(timeA));
        System.out.println(Arrays.toString(timeA));
    }

    @Override
    public String toString() {
        return String.format("%10d секунд", this.sec);
    }


    public int convertToSecond() {
        int hour = 0;
        int min = 0;
        int totalSecond = Math.toIntExact(hour * 3600 + min * 60 + sec);
        return totalSecond;
    }


    public int compareTo(Task24 o) {
        if (o == null) {
            return -1;
        } else if (convertToSecond() > o.sec) {
            return 1;
        } else if (convertToSecond() < o.sec) {
            return -1;
        }
        return 0;
    }

    public static void comparisonOfTwoObjects(int comparison) {
        if (comparison == 1) {
            System.out.println("Объект time1 больше, чем time2");
        } else if (comparison == -1) {
            System.out.println("Объект time1 меньше, чем time2");
        } else {
            System.out.println("два объекта равны между собой");
        }
    }

    public int getI1() {
        return i1;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

