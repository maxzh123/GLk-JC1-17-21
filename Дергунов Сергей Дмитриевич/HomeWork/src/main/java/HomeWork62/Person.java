package HomeWork62;

public class Person {
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
        return surname + " " + name + ", Возраст: " + age;
    }

}


