package WorkingWithFiles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task49 {
    public static void main(String[] args) throws IOException {


        List<Integer> array = new ArrayList<Integer>();
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\a.txt"));
            for (int i = 0; i < 20; i++) {
                dos.writeInt(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            DataInputStream d = new DataInputStream(new FileInputStream("D:\\a.txt"));
            for (int i = 0; i < 20; i++) {
                i = d.readInt();
                array.add(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        double summ = 0;
        System.out.println(array);
        for (int i = 0; i < array.size(); i++) {
            summ += i;
        }
        double average = summ/array.size();
        System.out.println("Среднее арифметическое чисел: "+average);
    }
}

