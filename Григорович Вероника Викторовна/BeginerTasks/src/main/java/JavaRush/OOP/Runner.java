package JavaRush.OOP;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Runner {
    public static ArrayList <Austronaut> austronauts=new ArrayList<Austronaut>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
       runWorkingProcess();
    }

    public static void createCrew() {
        austronauts.add(new Human());
        austronauts.add(new Human());
        austronauts.add(new Dog());
        austronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Austronaut astro : austronauts) {
            System.out.println(astro.getInfo());
        }
    }

    public static void runWorkingProcess() {
        for (Austronaut astro : austronauts) {
            if (astro instanceof Human) {
                Human human1=(Human) astro;
                pilot(human1);
            } else if (astro instanceof Dog) {
                Dog dog=(Dog) astro;
                guarding(dog);
            } else if (astro instanceof Cat) {
                Cat cat=(Cat) astro;
                sleeping(cat);
            }
        }
    }

//        Human human1 = (Human) austronauts.get(0);
//        pilot(human1);
//        Human human2 = (Human) austronauts.get(1);
//        pilot(human2);
//        Dog dog= (Dog)  austronauts.get(2);
//        guarding(dog);
//        Cat cat= (Cat) austronauts.get(3);
//sleeping(cat);


    public static void pilot(Human human) {
        System.out.println(human.getInfo()+" Пилотирует");
    }

    public static void guarding(Dog dog) {
        System.out.println(dog.getInfo()+" Охраняет");
    }

    public static void sleeping(Cat cat) {
        System.out.println(cat.getInfo()+ " Спит");
    }
}
