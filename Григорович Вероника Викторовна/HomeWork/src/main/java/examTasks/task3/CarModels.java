package examTasks.task3;

import java.util.Random;

public enum CarModels {
    hatchback, sedan, cabriolet;

    public static CarModels getCarModel() {
        CarModels[] models= CarModels.values();
        Random random=new Random();
        int i=random.nextInt(models.length);
        return models[i];
    }
}
