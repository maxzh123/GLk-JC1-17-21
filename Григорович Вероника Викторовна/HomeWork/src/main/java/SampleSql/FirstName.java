package SampleSql;

import java.util.Random;

public enum FirstName {
    Сергей, Коля, Маша, Саша, Вася, Эдуард, Сигизмун, Слава, Вероника, Леша, Лидия;
    static FirstName[] names=FirstName.values();
    static Random random=new Random();

    public static FirstName getNames() {
        int i=random.nextInt(names.length);
        return names[i];
    }
}
