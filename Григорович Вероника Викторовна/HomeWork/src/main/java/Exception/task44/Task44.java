package Exception.task44;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task44 {
    static ArrayList<String> studentsList;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //   TestClass.checkNumbers();
        ArrayList<String> studentsList = Task44.myStudents();
        try {
            choosingWhoWillAnswer(studentsList);
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println("Введите целое число, а не строку или ещё что нибудь или не выходите за пределы списка" + e);
            //continue;
        }
    }

    static public ArrayList<String> myStudents() {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Петя");
        students.add("Маша");
        students.add("Катя");
        students.add("Лена");
        students.add("Саша");
        students.add("Женя");
return students;
    }

    public static void choosingWhoWillAnswer(ArrayList<String> studentsList) throws InputMismatchException, IndexOutOfBoundsException {
        System.out.println("Введите номер студента по списку");
        int studentId = scanner.nextInt();
        System.out.println("Отвечает " + studentsList.get(studentId));
    }
}
