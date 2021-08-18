package Tasks;

public class Vehicle {
    protected String name;

    public Vehicle(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return " Ваше траспортное средство : " + getName();
    }
}
