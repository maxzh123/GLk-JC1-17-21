package examTasks.task3;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.List;

public class Car {
    String name;
    String carModel;
    int engineCapacity;


    public Car(String name, String carModel, int engineCapacity) {
        this.name = name;
        this.carModel = carModel;
        this.engineCapacity = engineCapacity;
    }

    public Car() {
    }

    public List<Car> generate10Car() {
        List<Car> carList = new ArrayList<Car>();
        for (int i = 0; i < 10; i++) {
            carList.add(new Car("Audi", String.valueOf(CarModels.getCarModel()), (int) (Math.random() * 3 + 1)));
        }
        System.out.println(carList);
        return carList;
    }

    public Multimap<Integer, Car> groupingByEngineCapacity(List<Car> carList ) {
        Multimap<Integer, Car> carMap = ArrayListMultimap.create();
        for (Car car : carList) {
            carMap.put(car.engineCapacity, car);
        }
        System.out.println(carMap);
        return carMap;
    }

    @Override
    public String toString() {
        return "<name>" + name + ":" +
                "<carModel>" + carModel + ":" +
                "<engineCapacity>" + engineCapacity;
    }
}
