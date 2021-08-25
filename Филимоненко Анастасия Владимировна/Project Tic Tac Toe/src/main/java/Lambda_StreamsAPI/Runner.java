package Lambda_StreamsAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    static public ArrayList<Person> personsList = new ArrayList<>();
    static public ArrayList <String>acceptableSurnames= new ArrayList<>();
    static int age;
    static public Name name;
    static public Surname surname;

    public static void main(String[] args){
        CreatePersonsList();
        Stream<Person> streamPersons = personsList.stream();
        PrintList(personsList);
        System.out.println();
        acceptableSurnames = (ArrayList<String>) streamPersons.
                filter(x -> x.age < 21).
                peek(System.out::println).
                sorted(Comparator.comparing(Person::getSurname).
                thenComparing(Person::getName)).
                limit(4).
                map(Person::getSurname).
                collect((Collectors.toList()));
        System.out.println();
        PrintSurnameList(acceptableSurnames);
    }

    static void CreatePersonsList() {
        for (int i = 0; i < 100; i++) {
            age = (int) (15 + Math.random() * 15);
            name = Name.values()[(int) (Math.random() * 10)];
            surname = Surname.values()[(int) (Math.random() * 10)];
            Person person = new Person(name, surname, age);
            personsList.add(person);
        }
    }

    static void PrintList(ArrayList<Person> arrayList) {
        arrayList.forEach(System.out::println);
    }

    static void PrintSurnameList(ArrayList<String> arrayList) {
        arrayList.forEach(System.out::println);
    }
}
