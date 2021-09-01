package examTasks.task3;


import com.google.common.collect.Multimap;

import java.util.List;

public class RunnerTask3 {
    public static void main(String[] args) {
        Car car = new Car();
        List<Car> carList=car.generate10Car();
        Multimap<Integer, Car> carMap=car.groupingByEngineCapacity(carList);
        WriterInFile writer=new WriterInFile();
        writer.writeInFile(carMap);
    }
}

