package Tasks61_63;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunnerTask62 {

static ArrayList<Person> personList=new ArrayList<Person>();
static ArrayList<String> nextPersonList=new ArrayList<String>();
    public static void main(String[] args) {
        Person person = new Person("name", "surname", 1);
        addToList(person);
        Stream<Person> personStream=personList.stream();
         nextPersonList= (ArrayList<String>) personStream //мне так предложила сделать джава, приведение типов, как оказалось все правильно
                .filter(person1 -> person1.age<21)
                .peek(System.out::println)
                .sorted(Comparator.comparingInt(person1 -> person1.surname.length()))
                .sorted(Comparator.comparingInt(person1 -> person1.name.length()))
                .limit(4)
                .map(person1 -> person1.surname)
                .collect(Collectors.toList());
        System.out.println("___________________________");
        nextPersonList.forEach(System.out::println);

    }

    public static ArrayList<Person> addToList(Person person) {
        for (int i=0;i<100;i++) {
            personList.add(person.generateNPerson());
        }
        return personList;
    }
}
