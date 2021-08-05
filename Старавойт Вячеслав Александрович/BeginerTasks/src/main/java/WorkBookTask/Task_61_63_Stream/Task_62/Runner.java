package WorkBookTask.Task_61_63_Stream.Task_62;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Runner {

  static   ArrayList<String> listSurname= new ArrayList<String>();

    public static void main(String[] args) {
        List<Person> list =createPerson();
        createAndTransformers(list);
        printSurname();
    }


    private static List<Person> createPerson() {
        List<Person> list = new ArrayList<Person>();
        for (int i = 0; i < 100; i++) {
            Name name = Name.values()[(int) (Math.random() * 50)];
            Surname surname = Surname.values()[(int) (Math.random() * 16)];
            int age = (int) (Math.random() * 16) + 15; // интревал возраста [15-30]
            list.add(new Person(name, surname, age));
        }
        return list;
    }

    private static void   createAndTransformers(List<Person> list){
       listSurname= (ArrayList<String>) list.stream()
                .filter(a->a.getAge() <21)
                .peek(System.out::println)
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                 .map(Person::getSurname)
                .collect(Collectors.toList());
        System.out.println();
    }
    private static void printSurname(){
        listSurname.forEach(System.out::println);
    }

}
