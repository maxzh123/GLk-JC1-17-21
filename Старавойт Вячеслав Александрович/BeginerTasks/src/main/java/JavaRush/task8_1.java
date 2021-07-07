package JavaRush;

import java.util.HashSet;
import java.util.Set;

public class task8_1 {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.iterator().next());
        printCats(cats);
    }
    public static  Set<Cat> createCats(){
       Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat("Валет"));
        result.add(new Cat("Красавчик"));
        result.add(new Cat("Молодец"));

        return result ;
    }
    public static void printCats(Set<Cat> cats) {
        for(Cat cat:cats){
            System.out.println(cat.toString());
    }
    }
    public static class Cat {
  private String name;

            public Cat(String name){
                this.name=name;
            }
    }

    }

