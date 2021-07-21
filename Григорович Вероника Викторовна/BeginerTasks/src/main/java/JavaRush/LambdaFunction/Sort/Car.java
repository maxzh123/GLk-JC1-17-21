package JavaRush.LambdaFunction.Sort;

public class Car {
    String model;
    boolean isElectric;


    public Car(String model, boolean isElectric) {
        this.model = model;
        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }
}
