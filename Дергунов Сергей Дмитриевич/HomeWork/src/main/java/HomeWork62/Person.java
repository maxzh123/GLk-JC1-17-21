package HomeWork62;

import java.util.Comparator;

public class Person implements Comparator {
    public Surname surname;
    public Name name;
    public int age;


    public Person(Name name, Surname surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name.toString();
    }

    public String getSurname() {
        return surname.toString();
    }

    @Override
    public String toString() {
        return  surname + " " + name + ", Возраст: " + age;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return (o1.toString().compareTo(o2.toString()));
    }
}

