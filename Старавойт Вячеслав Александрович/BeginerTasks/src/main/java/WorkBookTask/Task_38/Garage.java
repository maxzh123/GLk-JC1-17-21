package WorkBookTask.Task_38;

// согласно условия  нужен класс дженерик который может хранить только объекты наследуемые от Vehicle

public class Garage<TYPE extends Vehicle> {
    private TYPE  vehicle;

    public static void main(String[] args) {
    Car car=new Car("Volkswagen");
    Motorcycle moto = new Motorcycle("Suzuki GSX-1000");
    Boat boat = new Boat("Аврора");
    Garage<Motorcycle> motoG=new Garage<Motorcycle>();
    Garage<Car> carG=new Garage<Car>();
    Garage<Vehicle> justGarage=new Garage<Vehicle>();
    motoG.setVehicle(moto);
    //motoG.setVehicle(car); Не покатит. Гараж тока для мотоциклов.
    //carG.setVehicle(moto); Не покатит. Гараж только для машин.
    carG.setVehicle(car);
    justGarage.setVehicle(moto);//А это универсальный гараж
    justGarage.setVehicle(car);//А это универсальный гараж
        //И да все это работает хотя вы написали всего один гараж, но это шаблон гаража и нужный вам гараж жава напишет сама по шаблону.

        System.out.println(car);
        System.out.println(moto);
        System.out.println(boat);
        System.out.println(motoG);

    }

    public TYPE getVehicle() {
        return vehicle;
    }

    public void setVehicle(TYPE vehicle) {
        this.vehicle = vehicle;
    }
}
