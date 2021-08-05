package WorkBookTask.Task_61_63_Stream.Task_62;

public class Person {
    private  Name name;
    private Surname surname;
    private int age;

    public Person(Name name, Surname surname, int age) {
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    public String getName() {
        return name.toString();
    }

    public String getSurname() {
        return surname.toString();
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "[ " + name + " " + surname + ". Возраст " + age + "лет ]";
    }
}
