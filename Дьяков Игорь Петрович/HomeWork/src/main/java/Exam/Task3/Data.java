package Exam.Task3;

public class Data {
    private final Names names;
    private final CarModels carModels;
    private final int engineCapacity;

    public Data(CarModels carModels, Names names, int engineCapacity) {
        this.carModels = carModels;
        this.names=names;
        this.engineCapacity=engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
    @Override
    public String toString() {
        return  "\n\nName=" + names +
                "\nCarmodel=" + carModels +
                "\nEngineCapacity=" + engineCapacity;
}
}
