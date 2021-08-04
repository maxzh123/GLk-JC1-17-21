package WorkingWithFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task48 {
    public static void main(String[] args) {
        System.out.println(sumFromFile());
        System.out.println(sumFromFile1());

    }
    static int sumFromFile () {
        BufferedReader reader = null;
        int sum = 0;
        try {
            reader = new BufferedReader(new FileReader("D:\\1234.txt"));
            String string =null;
            while ((string = reader.readLine())!=null) {
                String [] array = string.split("[a-яА-ЯёЁa-zA-Z?!,.;:\\s]");

                for (String arrays: array){
                    if (arrays.length()>0)
                        sum+=Integer.parseInt(arrays);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }

    static int sumFromFile1 () {
        Set <Integer> a = new HashSet<Integer>();
        List <Integer> a1 = new ArrayList<Integer>();
        BufferedReader reader = null;
        int sum = 0;
        try {
            reader = new BufferedReader(new FileReader("D:\\1234.txt"));
            String string =null;
            while ((string = reader.readLine())!=null) {
                String[] array = string.split("[a-яА-ЯёЁa-zA-Z?!,.;:\\s]");

                for (String arrays : array) {
                    if (arrays.length() > 0) {
                        a1.add(Integer.parseInt(arrays));
                    }
                }
                for (String ar : array) {
                    if (ar.length() > 0)
                        a.add(Integer.parseInt(ar));
                }
                List<Integer> a2 = new ArrayList<Integer>(a);
                for (int i = 0; i < a2.size(); i++) {
                    sum += a2.get(i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }
}

