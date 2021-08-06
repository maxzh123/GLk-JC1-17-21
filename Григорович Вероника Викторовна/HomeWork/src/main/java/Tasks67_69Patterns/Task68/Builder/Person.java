package Tasks67_69Patterns.Task68.Builder;

public class Person {
     String name;
     String surname;
     int yearOfBirth;


//    public Person(String name, String surname, int yearOfBirth) {
//        this.name = name;
//        this.surname = surname;
//        this.yearOfBirth = yearOfBirth;
//    }
//
//    public Person() {
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public int getYearOfBirth() {
//        return yearOfBirth;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public void setYearOfBirth(int yearOfBirth) {
//        this.yearOfBirth = yearOfBirth;
//    }

    public boolean examination() {
        return ( name!=null && !name.trim().isEmpty() && surname!=null && !surname.trim().isEmpty() && yearOfBirth >=1900);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }


}
