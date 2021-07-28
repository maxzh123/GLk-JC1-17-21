package Tasks61_63;


import java.util.Random;

public class Person {

  //  Names[] names=Names.values();

    String name;
    String surname;
    int age;
    static Person [] people=new Person[100];


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person generateNPerson() {
        for (int i=0; i< people.length; i++) {
           return people[i]=new Person(String.valueOf(Names.getNames()), String.valueOf(Surnames.getSurnames()), (int) ((Math.random() * 15) + 15));

        }
        return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
