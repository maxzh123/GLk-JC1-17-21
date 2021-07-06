package JavaRush;
//1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
//2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
//3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
//4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
//5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
//6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
//Каждое животное с новой строки
import java.util.HashSet;
import java.util.Set;

public class task8_2 {
    public static void main(String[] args) {
        Set<Cat> cats =createCats();
        Set<Dog> dogs =createDogs();
        Set<Object> pets =join(cats,dogs);

        removeCats(pets,cats);
        printPets(pets);

    }
    public static Set<Cat> createCats(){
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }
    public static Set<Dog> createDogs(){
        Set<Dog> result = new HashSet<Dog>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }
    public static Set<Object> join(Set<Cat> cats ,Set<Dog> dogs){
        Set<Object> result = new HashSet<Object>();
        result.addAll(cats);
        result.addAll(dogs);

        return result;
    }
    public static void removeCats(Set<Object> pets,Set<Cat> cats ){
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets){
     for( Object pets1 : pets){
         System.out.println(pets1);
     }
    }

    public static class Cat{
    }

    public static class Dog{
    }
}
