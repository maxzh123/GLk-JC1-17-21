package Tasks67_69Patterns.Task68.Builder;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите имя");
        String name=scanner.nextLine();
        System.out.println("Ввведите фамилию");
        String surname1=scanner.nextLine();
        System.out.println("Введите год рождения");
        int yearsOfBirth=scanner.nextInt();
        PersonBuilder personBuilder=new PersonBuilder();
        Person person= new Person();




    }
}
