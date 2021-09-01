package Exam.Task3;
/*
     Сгенерировать 10 объектов класса Car у которых характеристики name(String),
     carModel (Enum с тремя объектами-значениями), engineСapacity(int в диапазоне 1-3).
     Сгруппировать их по engineСapacity используя Map<Integer, List<Car>>
     Для произвольного значения engineСapacity записать в файл соответствующий список объектов в формате:
     <name> : <carModel> : engineСapacity
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RunnerT3 {
    public static void main(String[] args) {

        List<Data>cars=new ArrayList<>();
        for(int i=0;i<10;i++){
        cars.add(new Data(CarModels.getCarModels(),Names.getNames(),(int)(Math.random()*3+1)));
            }

   Map<Integer, List<Data>> sort;
   sort = cars.stream().collect(Collectors.groupingBy(Data::getEngineCapacity));
       System.out.println(sort);

    File file = new File ("D:\\Learning\\Task3.txt");
    try (
    FileWriter fileWriter = new FileWriter(file);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
        bufferedWriter.write(String.valueOf(sort.get(1)));
    }
    catch (Exception e) { e.printStackTrace();}
    }
}
