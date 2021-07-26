package Tasks61_63;


import java.util.Random;

public class Person {
    Surnames[] surnames=Surnames.values();
    Names[] names=Names.values();
    Random random=new Random();
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
           return people[i]=new Person(String.valueOf(names[random.nextInt(names.length)]), String.valueOf(surnames[random.nextInt(surnames.length)]), (int) ((Math.random() * 15) + 15));

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
