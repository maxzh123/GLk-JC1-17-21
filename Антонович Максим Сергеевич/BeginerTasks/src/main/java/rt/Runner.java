package rt;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(2));
        test(listOfAnimal);
    }

    private static void test (List <Animal> list){
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }
}
