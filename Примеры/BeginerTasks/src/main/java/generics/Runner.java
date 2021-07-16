package generics;

import java.util.ArrayList;

public class Runner {
    static public void main(String... args){
        Cell<Cat> catCell = new Cell<Cat>();
        Cell<Dog> dogCell = new Cell<Dog>();
        Cell<Animal> animalCell = new Cell<Animal>();
        catCell.addPet(new Cat());
        dogCell.addPet(new Dog(),new Dog());

        animalCell.addPet(new Dog(),new Cat() );
        Cell<Object> cell = new Cell<Object>();
        Utils.Покормить(dogCell);
        Utils.Покормить2(cell);
        Cat cat= Utils.getFirst(catCell,new ArrayList<Object>());
//        Utils.Покормить(cell );
//        Utils.Покормить2(dogCell);

    }
}
