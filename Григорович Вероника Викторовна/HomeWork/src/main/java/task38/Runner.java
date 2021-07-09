package task38;

public class Runner {
    public static void main(String[] args) {
        Car car=new Car("Хёндай акцент");
        Motorcycle motorcycle=new Motorcycle("Хонда");
        Truck truck=new Truck("Скания");
        Garage <Vehicle> universalGarage=new Garage<Vehicle>();
        Garage <Car> carGarage=new Garage<Car>();
        Garage <Motorcycle> motorcycleGarage=new Garage<Motorcycle>();
        //  Garage <Truck> truckGarage=new Garage<Truck>(); не дает создать потому что трак не extends от Vehicle
        carGarage.setVehicle(car);
        //     carGarage.setVehicle(motorcycle); не принимает
        motorcycleGarage.setVehicle(motorcycle);
        universalGarage.setVehicle(car);

        System.out.println(carGarage);
        System.out.println(motorcycleGarage);

    }
}
