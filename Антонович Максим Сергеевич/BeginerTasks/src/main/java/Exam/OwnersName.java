package Exam;

import java.util.Random;

public enum OwnersName {
    Максим , Леша , Кристина, Оля, Джони;

    static OwnersName[] ownersNames= OwnersName.values();
    static Random random=new Random();

    public static OwnersName getOwnersName() {
        int i=random.nextInt(ownersNames.length);
        return ownersNames[i];
    }
}
