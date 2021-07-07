package task26_31;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26_29 {
    public static int count;
    public static Matcher matcher;
    public static String str="\"На какое дело хочу покуситься и в то же время каких пустяков боюсь! — подумал он с странною улыбкой.\n" +
    " — Гм... да... всё в руках человека, и всё-то он мимо носу проносит, единственно от одной трусости... это уж аксиома...\n" +
    "Любопытно, чего люди больше всего боятся? Нового шага, нового собственного слова они всего больше боятся...\n" +
    "А впрочем, я слишком много болтаю. Оттого и ничего не делаю, что болтаю. Пожалуй, впрочем, и так: оттого болтаю, что ничего не делаю.\n"+
    "Это я в этот последний месяц выучился болтать, лежа по целым суткам в углу и думая... о царе Горохе. \n" +
    "Ну зачем я теперь иду? Разве я способен на это? Разве это серьезно? Совсем не серьезно. \n" +
    "Так, ради фантазии сам себя тешу; игрушки! Да, пожалуй что и игрушки!!\"";

    public static void main(String[] args) {
        countPunctuation();
        countWords();
        lastLetterText();
        findHexNumber();

    }
   public static void countPunctuation() { //task 26
       Pattern pattern=Pattern.compile("\\.{3}|,|;|:|—|!|\\.|\\?|\"");
       matcher=pattern.matcher(str);
      while (matcher.find()) {
         count++;
       }
       System.out.println("Количество знаков препинания в тексте: "+count);
    }

    public static void countWords() { //task27
        int count=0;
        Pattern pattern=Pattern.compile("[\\s\\S]?[а-яА-ЯЁ-ё\\-]+[\\s\\S]?");
        matcher=pattern.matcher(str);
        while (matcher.find()) {
            count++;
        }
        System.out.println("Количество слов в тексте: "+count);
    }

    public static void lastLetterText() { //task28
        Pattern pattern=Pattern.compile("[A-Яa-яЁ-ё\\-]+");
        matcher=pattern.matcher(str);
        StringBuffer buffer=new StringBuffer();
        while (matcher.find()) {
            buffer.append(str.charAt(matcher.end()-1));
        }
        System.out.println(buffer);
    }

    public static void findHexNumber() { //task29
        String st="0x141D12 0x0 0xXedff 123 0b234 0XABC11";
        Pattern pattern=Pattern.compile("(0[xX])[0-9A-F]+");
        matcher=pattern.matcher(st);
        while (matcher.find()) {
            int start=matcher.start();
            int end= matcher.end();
            System.out.print("Шестнадцатеричное число: " + st.substring(start,end)+" ");
            System.out.println();
        }
    }
    }



