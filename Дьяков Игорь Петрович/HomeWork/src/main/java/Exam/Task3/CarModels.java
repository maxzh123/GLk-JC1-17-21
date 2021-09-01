package Exam.Task3;
import java.util.Random;
public enum CarModels {
    Volkswagen, Ford, Nissan, Chevrolet;
    static CarModels[] carModels=CarModels.values();
    static Random random=new Random();

    public static CarModels getCarModels() {
        int i=random.nextInt(carModels.length);
        return carModels[i];

    }
}
