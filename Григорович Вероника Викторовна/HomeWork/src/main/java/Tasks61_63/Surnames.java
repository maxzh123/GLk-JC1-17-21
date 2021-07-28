package Tasks61_63;

import java.util.Random;

public enum Surnames {
    Иваненко, Лагодич, Смирноненко, Антоненко, Акулич, Налегович, Игнатенко, Тарасенок, Кац;
    static Surnames[] surnames=Surnames.values();
    static Random random=new Random();

    public static Surnames getSurnames() {
        int i=random.nextInt(surnames.length);
        return surnames[i];
    }
}
