package task34;

public class Runner {
    public static void main(String[] args) {
        Engineer engineer=new Engineer(600, 6);
        engineer.printInfo();
        Chief chief=new Chief(800, 11,3000,5);
        chief.printInfo();
        CarDriver carDriver=new CarDriver(500, 2);
        carDriver.printInfo();
        TruckDriver truckDriver=new TruckDriver(0, 7,11,170);
        truckDriver.printInfo();
    }
}
