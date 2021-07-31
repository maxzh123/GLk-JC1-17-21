package Samples.Encyclopedia;

//которое читает конфигурационный файл вкотором указываются параметры поискового механизма,
// имя текстового файла со словарем и имя файла в который должны сохранятся результаты.

import java.io.File;
import java.io.InputStream;

public  final  class ConfigScoring {

    protected static  String PATH ="c:\\"; // указываем путь где будем хранить файл куда будем записывать.
    protected static  String NAME_ENCYCLOPEDIA1 = "part1.txt";
    protected static  String NAME_ENCYCLOPEDIA2 = "part2.txt";

    protected static  String NAME_TEXT_FILE="findWord.txt"; //имя файла куда будет записываться

    protected static double THRESHOLD_VALUE = 0.95; //пороговое значение для нахождения соответсвия слов( около 80% )

}
