package WorkingWithFiles;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;

public class Person implements Serializable {
    private String name;
    private int age;
    private String  surname;
    String [] names = {"Света", "Ира", "Ира1", "Ира2", "Ир3а"};


    public Person (String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }
//    public String random () {
//       String    names1 = names [(int) (Math.random()*5)];
//       return names1;
//        }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public String[] getNames() {
        return names;
    }

//    public Random getRandom() {
//        return random;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
            //    ", names=" + Arrays.toString(names) +
                '}';
    }
}


