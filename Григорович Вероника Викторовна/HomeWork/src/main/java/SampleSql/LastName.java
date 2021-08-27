package SampleSql;

import java.util.Random;

public enum LastName {
    Бракоренко, Кац, Туц,Фигельман,Якименко, Кириенко, Тополенко, Иваненко, Фаер;
    static LastName[] lastNames= LastName.values();
    static Random random=new Random();

    public static LastName getNames() {
        int i=random.nextInt(lastNames.length);
        return lastNames[i];
    }
}
