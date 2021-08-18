package Tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task48 {
    private static int sum=0;
    private static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        String path = "/E:\\GLk-JC1-17-21\\Филимоненко Анастасия Владимировна\\Project Tic Tac Toe\\src\\main\\java\\Tasks\\files.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        NumberFormat f = NumberFormat.getInstance();
        readingAndAdding(bufferedReader);
        printNumbers();
        sumNumbers();
        System.out.println("The sum of the numbers: " + f.format(sum));
        deleteCopyNumbers();
    }


    public static ArrayList<Integer> readingAndAdding(BufferedReader bufferedReader) throws IOException {
        String res;
        while ((res = bufferedReader.readLine()) != null) {
            String[] strings = res.split("\\s+");
            for (String str : strings) {
                try {
                    list.add(Integer.parseInt(str));
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        }
        return list;
    }

    public static void printNumbers() {
        System.out.println("Reading numbers:");
        System.out.println(list);
    }

    public static int sumNumbers() {
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static void  deleteCopyNumbers() {
        Set<Integer> set =new HashSet<>(list);
        printWithoutCopyNumbers(set);
    }

    public static void printWithoutCopyNumbers(Set<Integer> set) {
        System.out.println("Result after conversion:");
        for (Integer n : set) {
            System.out.print("[" + n + "] ");
        }
    }

    @Override
    public String toString() {
        return "[" + list + "] ";
    }
}
