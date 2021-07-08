package HomeWork39_42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork{
    public static ArrayList<Student> grades;
    private static Student student;

    public static class Student {
        String name;
        int grade;

        Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    //Создать список оценок учеников с помощью ArrayList,
    // заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.

    public static void main(String[] args) {
        int count = 10;
        grades = new ArrayList<>();
        Fill(count);
        System.out.println("До сессии: ");
        PrintList();
        RemoveNonAcceptable(4);
        System.out.println("После сессии: (с оценкой ниже 5 отчислены)");
        PrintList();
    }

    static void Fill(int count) {
        String[] names = new String[]{"Миша", "Маша", "Петя", "Вова", "Максим", "Игорь"};
        for (int i = 0; i < count; i++) {
            student = new Student(names[(int) (Math.random() * 6)], (int) (Math.random() * 10) + 1);
            grades.add(student);
        }
    }

    static void RemoveNonAcceptable(int grade) {
        int i = 0;
        while (i < grades.size()) {
            student = grades.get(i);
            if (student.grade <= grade) {
                grades.remove(student);
            } else i++;
        }
    }

    static void PrintList() {
        for (Student student : grades) {
            System.out.println("Имя: " + student.name + "\t Оценка : " + student.grade);
        }
    }
}
