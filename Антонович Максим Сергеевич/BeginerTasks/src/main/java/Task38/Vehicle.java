package Task38;

public class Vehicle {
    private String name;
    public Vehicle (String name) {
        this.name = name;
    }
    @Override
    public String toString () {
        return "Марка в Garage: " + name;
    }
}
