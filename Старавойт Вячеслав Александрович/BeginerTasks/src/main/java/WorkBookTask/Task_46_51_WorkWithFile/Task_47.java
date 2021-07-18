package WorkBookTask.Task_46_51_WorkWithFile;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Создать файл с текстом, прочитать подсчитать кол-во знаков препинания и слов, вывести на экран.
public class Task_47 {
    public static int count = 0;
    public static int countWords = 0;
    private static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) throws IOException {
        String path = "/Users/Победитель/GLk-JC1-17-21/Старавойт Вячеслав Александрович/BeginerTasks/src/main/java/WorkBookTask/Task_46_51_WorkWithFile/text1.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        readingAndAdding(bufferedReader);
        findPunctuationAndWords();
        System.out.println("Количество знаков препинания + слов в данном файле: " + count);

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
            System.out.print(" [" + matcher.group() + "] "); // для проверки.Потому как файл если лень искать.
            count++; }
            System.out.println();
        while (matcherWords.find()) { // подсчет слов.
            System.out.print(" [" + matcherWords.group() + "] ");
            count++; }
            System.out.println();
        return count;
    }
}

