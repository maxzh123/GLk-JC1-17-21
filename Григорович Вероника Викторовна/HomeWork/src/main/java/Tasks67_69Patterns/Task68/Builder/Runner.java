package Tasks67_69Patterns.Task68.Builder;

import java.util.Scanner;

public class Runner {
    //task68 Создайте класс Person с полями: имя, фамилия и класс рождения.
    //реализуйте у этого класса паттерн строитель. Введите поля с клавиатуры и заполните объект
    //класса Person с помощью паттерна Строитель
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите имя");
        String name1=scanner.nextLine();
        System.out.println("Ввведите фамилию");
        String surname1=scanner.nextLine();
        System.out.println("Введите год рождения");
        int yearsOfBirth=scanner.nextInt();

        Person person=new Person.PersonBuilder().withName(name1).withSurname(surname1).withYearOfBirth(yearsOfBirth).build();
        System.out.println(person);





    }
}
