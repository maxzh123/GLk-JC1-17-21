package Tasks46_51_Files;

import java.io.*;

public class Task49 {

    static String path = "C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\sample49_BinaryFile.dat";
    static int count; //чтобы записать 20 случ чисел
    static int sum;

    public static void main(String[] args) {
        writeNumbers();
        readNumbers();
    }

    public static void writeNumbers() {
        try (DataOutputStream file = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)))) {
            while (count < 20) {
                file.writeInt((int) (Math.random() * 10+1));
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readNumbers() {
        try (DataInputStream data=new DataInputStream (new BufferedInputStream( new FileInputStream(path)))) {
            while (data.available()>0) {
                int i= data.readInt();
                System.out.print(i+" "); //вывели все числа
                sum=sum+i;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Среднее арифметическое чисел: "+((int)Math.round(sum/count)));
    }
}
