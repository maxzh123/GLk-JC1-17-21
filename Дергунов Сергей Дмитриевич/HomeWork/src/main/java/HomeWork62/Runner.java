package HomeWork62;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Создайте класс Person с полями name, surname, age. Сгенерируйте группу из 100 человек в возрасте от 15 до 30. Напишите ОДНУ НЕПРЕРЫВНУЮ цепочку stream вызовов, которая:
        1) выбирает объекты, возраст которых меньше 21;
        2) распечатывает их на экран;
        3) сортирует по фамилии, а потом по имени (использовать thenComparing у объекта Comparator);
        4) берет 4 первых объекта;
        5) формирует коллекцию из фамилий объектов;
        6) агрегирует все в коллекцию.*/

public class Runner {
    static public ArrayList <Person>personsList = new ArrayList<>();
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
                filter(x -> x.age < 21).                            //Фильтр возраст менее 21
                peek(System.out::println).                          //напечатать
                sorted(Comparator.comparing(Person::getSurname).    //сортировать по фамилии
                thenComparing(Person::getName)).                    //затем по имени
                limit(4).                                           //лимит элементов - первые 4
                map(Person::getSurname).                            //взять фамилии
                collect((Collectors.toList()));                     // положить в коллекцию
        System.out.println();
        PrintSurnameList(acceptableSurnames);
      }

    static void CreatePersonsList(){
        for(int i=0; i<100;i++){
            age=(int)(15+Math.random()*15);
            name = Name.values()[(int)(Math.random()*10)];
            surname= Surname.values()[(int)(Math.random()*10)];
            Person person= new Person (name,surname,age);
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
