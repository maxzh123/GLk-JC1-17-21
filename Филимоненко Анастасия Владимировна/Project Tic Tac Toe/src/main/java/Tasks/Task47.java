package Tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task47 {
    public static int count = 0;
    public static int countWords = 0;
    private static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) throws IOException {
        String path = "E:\\english\\files.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        readingAndAdding(bufferedReader);
        findPunctuationAndWords();
        System.out.println("Количество знаков препинания + слов: " + count);

    }

    public static StringBuffer readingAndAdding(BufferedReader bufferedReader) throws IOException {
        String res = bufferedReader.readLine();
        while (res != null) {
            stringBuffer.append(res + " ");
            res = bufferedReader.readLine();
        }
        bufferedReader.close();
        return stringBuffer;
    }


    public static int findPunctuationAndWords() {
        Pattern pattern = Pattern.compile("[,!?.:«»\"]+");
        Pattern patternWords = Pattern.compile("[a-zA-z\\-]+[a-zA-Z]+");
        Matcher matcher = pattern.matcher(stringBuffer);
        Matcher matcherWords = patternWords.matcher(stringBuffer);
        while (matcher.find()) {
            System.out.print(" [" + matcher.group() + "] ");
            count++; }
        System.out.println();
        while (matcherWords.find()) {
            System.out.print(" [" + matcherWords.group() + "] ");
            count++; }
        System.out.println();
        return count;
    }
}
