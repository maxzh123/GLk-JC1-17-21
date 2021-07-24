package main.java;

public class Quest31 {
    public static String string="aaabbbccc";
    public static int count;
    public static String sum;
    public static void main(String[] args) {
        timeofAdditionOfLines();
        timeofBuilder();
    }
    public static void timeofAdditionOfLines() {
        long start = System.currentTimeMillis();
        additionOfLines();
        long end = System.currentTimeMillis();
        System.out.println("Время работы метода сложения строк - " + (end-start) + " мс");
    }
    public static void timeofBuilder() {
        long start = System.currentTimeMillis();
        additionWithBuilder();
        long end = System.currentTimeMillis();
        System.out.println("Время работы метода строителя - " + (end-start) + " мс");
    }
    public static void additionOfLines() {
        count=0;
        while (count<100000) {
            sum=sum+string;
            count++;
        }
    }
    public static void additionWithBuilder() {
        count=0;
        StringBuilder stringBuilder=new StringBuilder();
        while (count<100000) {
            stringBuilder.append(string);
            count++;
        }
        //FIXME нет получения результата. Вы сравниваете половину работы с целой работой
    }
}

