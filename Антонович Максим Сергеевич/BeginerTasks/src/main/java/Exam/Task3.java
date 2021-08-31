package Exam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {

        List <Car> cars = new ArrayList<>();
        for (int i = 0; i<10; i++){
            cars.add(new Car(OwnersName.getOwnersName(), Carmodel.getCarmodel(), (int) (1 + Math.random() * 3)));
        }
        Map<Integer, List<Car>> sort;
        sort = cars.stream().collect(Collectors.groupingBy(Car::getEngineCapacity));
        System.out.println(sort);

        File file = new File ("D:\\Всякое\\1\\Test.txt");
        try (
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write(String.valueOf(sort.get(1)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


