package task38;

public class Vehicle {
    private String name;


    public void getName(String name) {
        this.name = name;
}
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return " Ваше траспортное ср-во : " + getName();
    }
}


