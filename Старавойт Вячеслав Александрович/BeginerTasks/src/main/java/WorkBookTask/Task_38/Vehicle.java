package WorkBookTask.Task_38;

public abstract class Vehicle {

    protected String name;

    public Vehicle(String name){
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
