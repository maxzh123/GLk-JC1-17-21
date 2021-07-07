package WorkBookTask.Task_26_31_reg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_31 {
   public static String sum;
    public static int count =0;
   public static String simples ="aaabbbccc";

    public static void main(String[] args) {
        TimeStringBuilder();
        TimeSumString();

    }

    public static void SumString() {
        count=0;
        while (count < 200000) {
            sum += simples;
            count++;
        }
    }

    public static void TimeSumString() {
        long startTime = System.currentTimeMillis();
        SumString();
        long endTime = System.currentTimeMillis();
        System.out.println("Время операции с обычным сложением: " + (endTime - startTime)  + " ms");
    }


    public static void SumStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        count = 0;
        while (count < 200000) {
            stringBuilder.append(simples);
            count++;
        }
    }


    public static void  TimeStringBuilder(){
        long startTime = System.currentTimeMillis();
       SumStringBuilder();
        long endTime = System.currentTimeMillis();
        System.out.println("Время операции со StringBuilder: " + (endTime-startTime) + " ms");
    }
}

