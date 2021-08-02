package tasks58_60.task58;

import java.util.Random;

public enum SomeStrings { //отсюда будем брать произвольную строку и записывать в файл
    Лето, Осень, Зима, Река, Собака, Кот, Мышка, Пляж, Шляпа, Сапоги, Стул, Стол, Пиво;
    static SomeStrings[] someStrings=SomeStrings.values();
    static Random random=new Random();

    public static SomeStrings getSomeStrings() {
        int i=random.nextInt(someStrings.length);
        return someStrings[i];
    }

}
