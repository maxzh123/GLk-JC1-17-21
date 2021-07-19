package WorkBookTask.Task_46_51_WorkWithFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
//Задание создать файл с тескстом в котором присутствуют числа.Найти все числа , вывести на экран, посчитать сумму, убрать все повторяющиеся числа и снова вывести на экран.

public class Task_48 {

    private static int sum=0;
    private static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        String path = "/Users/Победитель/GLk-JC1-17-21/Старавойт Вячеслав Александрович/BeginerTasks/src/main/java/WorkBookTask/Task_46_51_WorkWithFile/textnumber.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        NumberFormat f = NumberFormat.getInstance(); // чтобы красиво выводило сумму чисел в бухг. ввиде.
        readingAndAdding(bufferedReader);
        printNumbers();
        sumNumbers();
        System.out.println("Сумма чисел в файле: " + f.format(sum));
        deleteCopyNumbers();
    }


    public static ArrayList<Integer> readingAndAdding(BufferedReader bufferedReader) throws IOException {
        String res;
        while ((res = bufferedReader.readLine()) != null) {
            String[] strings = res.split("\\s+");
            for (String str : strings) {
                try {
                    list.add(Integer.parseInt(str));
                } catch (NumberFormatException e) { // нужно для того чтобы если будут попадаться слова в файле, просто игнорировать и идти дальше.
                    continue;
                }
            }
        }
        return list;
    }

    public static void printNumbers() {
        System.out.println("Чтение чисел из текстового файла:");
        System.out.println(list);
    }

    public static int sumNumbers() {
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static ArrayList<Integer> deleteCopyNumbers() {
        ArrayList<Integer> copyList = new ArrayList<>(list);
        for (int i = 0; i < copyList.size(); i++) {
            for (int j = i + 1; j < copyList.size(); j++)
                if (copyList.get(i).equals(copyList.get(j))) {
                    copyList.remove(j);
                    j--;
                }
        }
        printWithoutCopyNumbers(copyList);
        return copyList;
    }

    public static void printWithoutCopyNumbers(ArrayList<Integer> copyList) {
        System.out.println("Следующий результат после удаления:");
        for (Integer n : copyList) {
            System.out.print("[" + n + "] ");
        }
    }

    @Override
    public String toString() {
        return "[" + list + "] ";
    }

}



