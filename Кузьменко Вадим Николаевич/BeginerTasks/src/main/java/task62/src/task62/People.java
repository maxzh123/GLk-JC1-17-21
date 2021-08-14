package task62;


public class People {
    private int age;
    private String surname;
    private String name;

    public People(String name, int age, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String getSurname () {
        return surname;
    }
}

