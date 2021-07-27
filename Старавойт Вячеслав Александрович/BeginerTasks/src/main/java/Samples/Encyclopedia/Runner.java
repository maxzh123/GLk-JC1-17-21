package Samples.Encyclopedia;
//Описание алгоритмы нечеткого сравнения (на примере Запись Записи):
//
//Привести обе строки в верхний регистр.
//бьем первое слово на группы по 1 символу (з а п и с ь) Каждую группу пытаемся найти во второй строке. за каждую находку - начисляем 1 .балл.
//бьем первое слово на группы по 2 символа (за ап пи ис сь) Каждую группу пытаемся найти во второй строке. за каждую находку - начисляем 4 .балл.
//бьем первое слово на группы по 2 символа (зап апи пис ись) Каждую группу пытаемся найти во второй строке. за каждую находку - начисляем 8 .баллов.
//бьем первое слово на группы по 2 символа (запи апис пись) Каждую группу пытаемся найти во второй строке. за каждую находку - начисляем 10 .баллов.
//результат выражаем в доле от единицы. путем деления фактически набранных балов, на теоретически возможный максимум для данной пары.
//повторяем шаги 2-6, поменяв слова местами.
//получаем финальный результат путем перемножения 2=х результатов.
//Оформляем код так, чтобы вы смогли оперативно делать реализации в которых будут меняться настройки скоринга и максимальная длинна группы, пороговое значение, чтобы считать что слова похожи.
//Прикручивание к файлу энциклопедии должно стоять в следующем:
//
//на выходе должно получится консольное приложение, которое читает конфигурационный файл вкотором указываются параметры поискового механизма, имя текстового файла со словарем и имя файла в который должны сохранятся результаты.
//программа должна запускаться из консоли принимать читать первый аргумент командной строки как строку для поиска и выводить в файл вывода, все статьи заглавное слово которых, похоже на заданное в командной строке.
//Код оформлять так, чтобы при необходимости реализацию поиска можно было подменять.


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {

 private static final Scanner scanner =new Scanner(System.in);
 static String word;
 static File fileEncyclopedia;

    public static void main(String[] args) {

        File file =new File(ConfigScoring.PATH); // в скобках указали директрию из ConfigScoring куда создавать файл.
        CreatorFile.createFiles(file); // создаем файл куда будем записывать результат поиска.
        // Че это за порнография? fileEncyclopedia =new File(file,ConfigScoring.NAME_ENCYCLOPEDIA); // создаем Тип <Файл> для нашей энцеклопедии.
       // word = WordInput.readerWordInput(); // делаем запрос на ввод слова, и обработки.
          word ="ОМПЛУА"; // для проверки и отладки
        try {
            ReaderBook.readingFile(Runner.class.getClassLoader().getResourceAsStream(ConfigScoring.NAME_ENCYCLOPEDIA1)); // будем читать нашу энциклопедию и производить всю магию.
            ReaderBook.readingFile(Runner.class.getClassLoader().getResourceAsStream(ConfigScoring.NAME_ENCYCLOPEDIA2)); // будем читать нашу энциклопедию и производить всю магию.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
