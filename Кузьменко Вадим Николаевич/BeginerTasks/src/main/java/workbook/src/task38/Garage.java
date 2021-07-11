package task38;

public class Garage<TYPE extends Vehicle> {
    private TYPE vehicle;

    public static void main(String[] args) {
        Car car = new Car("Octavia");
        Motorcecle motorcecle = new Motorcecle("Yamaha");
    }
        public TYPE getVehicle() {
            return vehicle;
    }

    public void setVehicle(TYPE vehicle) {
        this.vehicle = vehicle;
    }
}

