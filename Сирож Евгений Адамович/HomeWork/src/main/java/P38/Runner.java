package P38;

public class Runner {
    public static void main(String[] aerg) {
        Car car = new Car(" Opel Astra ");
        Moto moto = new Moto(" Minsk ");
        Garage<Car> carGarage = new Garage<>(car);
        Garage<Moto> motoGarage = new Garage<>(moto);
//        Garage<Vehicle> vehicleGarage = new Garage<>();
//        ArrayList<Vehicle> cars = new ArrayList<>();
//        cars.add(car);
//        cars.add(moto);
        carGarage.setVehicle(car);
        motoGarage.setVehicle(moto);

//        System.out.println(cars);
        System.out.println(carGarage);
        System.out.println(motoGarage);

    }
}
