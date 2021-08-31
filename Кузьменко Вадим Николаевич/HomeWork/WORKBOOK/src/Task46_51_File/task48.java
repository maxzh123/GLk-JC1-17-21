package Task46_51_File;

import java.io.*;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task48 {
    static int sum; //считаем сумму чисел
    static Pattern pattern;
    static Matcher matcher;
    static HashSet<Integer> numbers=new HashSet<Integer>(); //сюда будем заносить неповторяющиеся числа, коллекция хэшсет даст нам это сделать
    static String path = "C:\\Users\\WorkBook\\GLk-JC1-17-21\\java\\Tasks46_51_Files\\sample48.txt";
    static String path1 = "C:\\Users\\WorkBook\\GLk-JC1-17-21\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\sample49.txt";

    public static void main(String[] args) throws IOException {
        findNumbers();
        printNonDuplicateNumbers(numbers);
    }

    public static void findNumbers() throws FileNotFoundException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
             FileWriter fileWriter = new FileWriter(path1)) {
            while (bufferedReader.ready()) {
                String str = bufferedReader.readLine();
                pattern = Pattern.compile("[0-9]+");
                matcher = pattern.matcher(str);
                while (matcher.find()) {
                    int i = Integer.parseInt(matcher.group());
                    numbers.add(i);
                    System.out.print(i+" "); //нашли все числа
                    sum=sum+i;
                    fileWriter.write(String.valueOf(i)+" "); //йл

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Сумма найденных чисел: "+sum);
    }

    public static void printNonDuplicateNumbers(HashSet<Integer> numbers) {
        for(Integer numb : numbers) {
            System.out.print(numb+" ");
        }
    }
}