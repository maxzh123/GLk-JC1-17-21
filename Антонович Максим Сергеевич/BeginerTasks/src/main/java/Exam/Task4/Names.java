package Exam.Task4;


import java.util.Random;

public enum Names {
    Максим , Леша , Кристина, Оля, Джони;

    static Names[] names= Names.values();
    static Random random=new Random();

    public static Names getNames() {
        int i=random.nextInt(names.length);
        return names[i];
    }
}
