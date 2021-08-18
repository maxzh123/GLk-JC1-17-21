package task68;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilderImplem().setName("Ivan").setYear(1994).setSurname("Ivanov").build();
        Person person1 = new PersonBuilderImplem().setName("Валера").setYear(1996).setSurname("Бирюков").build();
        Person person2 = new PersonBuilderImplem().setName("Стас").setYear(1985).setSurname("Стасов").build();
        Person person3 = new PersonBuilderImplem().setName("Алексей").setYear(1956).setSurname("Дмитриев").build();
        person.print();
        person1.print();
        person2.print();
        person3.print();
    }
}
