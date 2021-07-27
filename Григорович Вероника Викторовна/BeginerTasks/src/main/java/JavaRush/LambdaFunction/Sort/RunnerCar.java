package JavaRush.LambdaFunction.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class RunnerCar {
    public static void main(String[] args) {
        ArrayList <Car> cars=new ArrayList<Car>();
        Collections.addAll(cars,
                new Car("Subary", false),
                new Car("Mazda", true),
                new Car("Honda", true),
                new Car("Range Rover", true),
                new Car("Kia", false));
        Stream<Car> carStream=onlyElectricCars(cars);
        carStream.forEach(System.out::println);

    }
    public static Stream<Car> onlyElectricCars(ArrayList <Car> cars) {
        return cars.stream()
                .filter(Car -> Car.isElectric()); //Car::isElectric
    }
}
