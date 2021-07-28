package Tasks46_51_Files;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task47 {
        public static int countWords; //количество слов в тексте
       public static int punctuationMarks; //количество знаков препинания
        static List<String> strings;
        static Path path = Path.of("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\sample47.txt");
        public static String str = "\"На какое дело хочу покуситься и в то же время каких пустяков боюсь! — подумал он с странною улыбкой.\n" +
                " — Гм... да... всё в руках человека, и всё-то он мимо носу проносит, единственно от одной трусости... это уж аксиома...\n" +
                "Любопытно, чего люди больше всего боятся? Нового шага, нового собственного слова они всего больше боятся...\n" +
                "А впрочем, я слишком много болтаю. Оттого и ничего не делаю, что болтаю. Пожалуй, впрочем, и так: оттого болтаю, что ничего не делаю.\n" +
                "Это я в этот последний месяц выучился болтать, лежа по целым суткам в углу и думая... о царе Горохе. \n" +
                "Ну зачем я теперь иду? Разве я способен на это? Разве это серьезно? Совсем не серьезно. \n" +
                "Так, ради фантазии сам себя тешу; игрушки! Да, пожалуй что и игрушки!!\"";

        public static void main(String[] args) throws IOException {
            writeSomething();
            strings = readFile();
            // for(String str : strings) { //проверяла правильно ли выводится
            //       System.out.println(str);
           //  }
           countWordsAndPunctuationMarks(strings);
        }

        public static void writeSomething() { //в этом методе я записывала строку в sample.txt
            try (FileWriter fileWriter = new FileWriter("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\sample47.txt")) {
                fileWriter.write(str);
            } catch (Exception e) {
                System.out.println("Что то не так " + e);
            }
       }

        public static List<String> readFile() throws IOException {
            return strings = Files.readAllLines(Path.of(String.valueOf(path)));
        }

        public static void countWordsAndPunctuationMarks(List<String> strings) {
            for (String str : strings) {
              Pattern patternPunctuationMarks = Pattern.compile("\\.{3}|,|;|:|—|!|\\.|\\?|\"");
               Matcher matcherPunctuationMarks = patternPunctuationMarks.matcher(str);
                while (matcherPunctuationMarks.find()) {
                    punctuationMarks++;
                }
                Pattern patternWords=Pattern.compile("([а-яА-ЯЁё]+-[а-яА-ЯЁё]+)|([а-яА-ЯЁё]+)");
                Matcher matcherWords=patternWords.matcher(str);
                while (matcherWords.find()) {
                    countWords++;
                }
            }
           System.out.println("Количество слов в тексте: "+countWords+". Количество знаков препинания в тексте "+punctuationMarks);
        }
    }






