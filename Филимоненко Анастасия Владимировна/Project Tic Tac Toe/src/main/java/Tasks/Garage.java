package Tasks;

public class Garage<TYPE extends Vehicle> {
    private TYPE  vehicle;

    public static void main(String[] args) {
        Car car=new Car("Mercedes");
        Motorcycle moto = new Motorcycle("Yamaha YZF R1");
        Garage<Motorcycle> motoG=new Garage<Motorcycle>();
        Garage<Car> carG=new Garage<Car>();
        Garage<Vehicle> justGarage=new Garage<Vehicle>();
        motoG.setVehicle(moto);
        carG.setVehicle(car);
        justGarage.setVehicle(moto);
        justGarage.setVehicle(car);

        System.out.println(car);
        System.out.println(moto);
        System.out.println(motoG);

    }

    public TYPE getVehicle() {
        return vehicle;
    }

    public void setVehicle(TYPE vehicle) {
        this.vehicle = vehicle;
    }
}
