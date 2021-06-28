/* Задание:
1. запустить убедится, что работает.
2. изменить количество повторений.
* */

import java.util.Arrays;
import java.util.Comparator;

public class Sample2 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample2

    public static void destroyGalaxy(int[][] arrays,int length){
        for (int i = 0; i < arrays.length ; i++) {
            //arrays[i]=new int[length];
            for (int j = 0; j < arrays[i].length ; j++) {
                arrays[i][j]=(int)(Math.random()*50);
            }
        }

    }

    public static void main (String[] arg) { //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        long start=System.currentTimeMillis();
        int[][] array = new int[5000][];
        destroyGalaxy(array, 80);
        for (int i = 0; i < array.length; i++) {
            System.out.print(i);
            System.out.print(" -> [");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println("]");
        }
        System.out.println(System.currentTimeMillis()-start);
        int[] arr2 = new int[5000];
        for(int i:arr2){
            System.out.println(i);
        }

    }

}
