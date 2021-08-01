package P38;

public abstract class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "В гараже стоит: " + getName();
    }

    public String getName() {
        return name;
    }
}

