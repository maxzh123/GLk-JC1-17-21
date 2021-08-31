package Exam;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        int x = (int) (1+ Math.random()*10);
        // System.out.println(x);
        int y = (int) (1+ Math.random()*10);
        // System.out.println(y);
        int z = (int) (1+ Math.random()*10);
        //  System.out.println(z);
        result (x, y, z);
        average(x, y, z);
    }
    public static void result (int x, int y, int z){
        if (x>z){
            int summ = x+y;
            System.out.println("сумма x+y: "+summ);
        }
        else  {
            System.out.println("значение z: "+z);
        }
    }
    public static void average (int x, int y, int z) {
        double calculationResult = (double) (x+y+z)/3;
        System.out.println("среднее арифметическое: "+calculationResult);
    }
}
