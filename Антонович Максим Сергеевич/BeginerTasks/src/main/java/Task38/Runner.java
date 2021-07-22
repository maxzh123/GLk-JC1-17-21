package Task38;

import rt.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Garage<Car> carGarage = new Garage<Car>();
        carGarage.addTransport(new Car("Audi"), new Car("BMW"));
        System.out.println(carGarage);
        Garage<Motorcycle> motorcycleGarage = new Garage<Motorcycle>();
        motorcycleGarage.addTransport(new Motorcycle("Suzuki"));
        System.out.println(motorcycleGarage);
        test(Collections.singletonList(carGarage)); // просто смотрел разные методы
    }

    private static void test(List<Garage> list) {
        for (Garage vehicle : list) {
            System.out.println(vehicle);
        }
    }
}

