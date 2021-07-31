package WorkingWithFiles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task47 {
    public static int count1 = 0;
    public static int count2 = 0;
    public static void main(String[] args) throws IOException {
        List <String> stringSumm = new ArrayList<String>();
        BufferedReader m1 = new BufferedReader(new FileReader("D:\\Homework\\new literature\\Read34.txt"));
        String line = m1.readLine();
        while (line!=null) {
            System.out.println(line);
            stringSumm.add(line);
            line = m1.readLine();

        }
        for (String string : stringSumm) {
            Pattern regularExpressionForFindSpaces = Pattern.compile("[.?,;:!()-]+");
            Pattern regularExpressionForWords = Pattern.compile("\\b[а-яА-ЯёЁ]*[^0-9]\\b");
            Matcher m = regularExpressionForFindSpaces.matcher(string);
            Matcher v = regularExpressionForWords.matcher(string);
            while (m.find()){
                count1++;
            }
            while (v.find()){
                count2++;
            }
        }
        System.out.println("Количество знаков препинания: " +count1);
        System.out.println("Количество слов: " +count2);
        m1.close();
    }
}




