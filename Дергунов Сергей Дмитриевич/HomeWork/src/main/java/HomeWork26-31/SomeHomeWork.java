import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SomeHomeWork {
    private static int count;
    private static Matcher match;

    public static void main(String[] args) {
        // write your code here

        String string = "<p id=”p1”> старый пень,  какое  тебе программирование0F, с  ТебяCD  , песок уже сыпется. <pfsf> ";
        //   Scanner name = new Scanner(System.in);
        System.out.println("Введите произвольную строку разумной длины, не увлекайтесь. Не \"Войну и мир\" пишите...");
//        String string = name.nextLine();
        System.out.println("Исходная строка: \n" + string);
        System.out.println("\nДлина строки: " + string.length());
        System.out.println("Количество знаков препинания : " + Punctuation(string));
        System.out.println("Количество слов: " + WordCount(string));
        System.out.println("Строка из последних символов слов: " + LastSymbols(string));
        System.out.println("Шестнадцатеричные числа: " + FindHEX(string));
        System.out.println("Исходная строка: \n" + string);
        System.out.println("Скорректированная строка: \n" + FindAndReplace(string));
    }

    //Задача 26
    public static int Punctuation(String string) {
        count = 0;
        Pattern punctuation = Pattern.compile("[,.:;]{1}");
        match = punctuation.matcher(string);
        while (match.find()) {
            count++;
        }
        return count;
    }

    //Задача 27
    public static int WordCount(String string) {
        count = 0;
        Pattern space = Pattern.compile("\\W?[0-9a-zA-Zа-яА-Я]+\\W?");
        match = space.matcher(string);
        while (match.find()) {
   //         System.out.println(string.substring(match.start(),match.end()));
            count++;
        }
        return count;
    }

    //задача 28
    public static String LastSymbols(String string) {
        StringBuilder outString = new StringBuilder();
        Pattern lastSymbol = Pattern.compile("\\W?[\\wa-zA-Zа-яА-Я]+\\W?");
        match = lastSymbol.matcher(string);
        while (match.find()) {
            outString.append(string.charAt(match.end() - 2));
        }
        return outString.toString();
    }
    //задача 29
    public static String FindHEX(String string) {
        StringBuilder outString = new StringBuilder();
        Pattern lastSymbol = Pattern.compile("[0-9A-F{1}][0-9A-F{1}]");
        match = lastSymbol.matcher(string);
        while (match.find()) {
            outString.append(string.substring(match.start(), match.end()));
            outString.append(" ");
        }
        return outString.toString();
    }
    //задача 30
    public static String FindAndReplace(String string) {
//        Pattern Symbols = Pattern.compile("<p.*?>");
//        match = Symbols.matcher(string);
//        while (match.find()) {
//            System.out.println(match.start() + " "+ match.end());
//        }

        string = string.replaceAll("<p.*?>", "<p>");
        //System.out.println(string);
        return string;
    }
}
