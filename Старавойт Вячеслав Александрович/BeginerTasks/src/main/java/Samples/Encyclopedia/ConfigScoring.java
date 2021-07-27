package Samples.Encyclopedia;

//которое читает конфигурационный файл вкотором указываются параметры поискового механизма,
// имя текстового файла со словарем и имя файла в который должны сохранятся результаты.

import java.io.File;

public  final  class ConfigScoring {

    protected static  String PATH ="C:\\Users\\Победитель\\Desktop\\"; // указываем путь где будем хранить файл куда будем записывать.
    protected static  String NAME_ENCYCLOPEDIA = "Словарь.txt";
    protected static  String NAME_TEXT_FILE="findWord.txt"; //имя файла куда будет записываться

    protected static double THRESHOLD_VALUE = 0.95; //пороговое значение для нахождения соответсвия слов( около 80% )
    protected static  int ONE_COMPLIANCE = 1; // начислять будем один бал за одно соответсвие одной буквы.
    protected static  int TWO_COMPLIANCE = 4; // соответвсвие по 2 буквы - 4 балла.
    protected static  int THREE_COMPLIANCE = 8; //3 буквы -8 баллов.
    protected static  int FOUR_COMPLIANCE = 10; //4 буквы - 10 баллов.
}
