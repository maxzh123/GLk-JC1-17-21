package Tasks46_51_Files.Task51;

import java.util.Random;

public class Person {
    Surname [] surnames=Surname.values();
    Name [] names=Name.values();
    Random random=new Random();
    String name;
    String surname;
    int age;
    Person [] people=new Person[10];

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }



    public  void generateTenPerson() {

        for (int i=0; i< people.length; i++) {
            people[i]=new Person(String.valueOf(names[random.nextInt(names.length)]), String.valueOf(surnames[random.nextInt(surnames.length)]), (int) ((Math.random() * 99) + 1));
            System.out.println(people[i]);
        }

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
