package HomeWork39_42;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        @Override
        public String toString() {
            return "Имя: " + name + "\t Оценка : " + grade;
        }
    }

    //Создать список оценок учеников с помощью ArrayList,
    // заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.

    public static void main(String[] args) {
        int count = 12;//Количество студентов
        int minGrade = 4;//С оценкой ниже будут отчислены
        grades = new ArrayList<>();
        Fill(count);
        System.out.println("До сессии: ");
        PrintList(grades);
        RemoveNonAcceptableWithStream(minGrade);
        System.out.printf("После сессии: (с оценкой %d и ниже отчислены)\n",minGrade);
        PrintList(grades);
        System.out.println("Лучший(е) студент(ы) :");
        PrintList(FindTheBestsWithStream());
      }

    static void Fill(int count) {
        String[] names = new String[]{"Миша", "Маша", "Петя", "Вова", "Максим", "Игорь"};
        for (int i = 0; i < count; i++) {
            student = new Student(names[(int) (Math.random() * 6)], (int) (Math.random() * 10) + 1);
            grades.add(student);
        }
    }

    static void RemoveNonAcceptableWithStream(int grade) {
        Stream<Student> studentsStream = grades.stream();
         grades = (ArrayList<Student>) studentsStream.filter(x -> x.grade > grade).collect(Collectors.toList());
    }

    static void PrintList(ArrayList<Student> arrayList) {
        for (Student student : arrayList) {
            System.out.println(student);
        }
    }

    static ArrayList FindTheBestsWithStream() {
        Stream<Student> studentsStream = grades.stream();
        Student bestStudent = studentsStream.max(HomeWork::compare).get();
        studentsStream = grades.stream();
        ArrayList theBests = (ArrayList<Student>) studentsStream.filter(x -> x.grade == bestStudent.grade).collect(Collectors.toList());
        return theBests;
    }

    private static int compare(Student std1, Student std2) {
        return (Integer.compare(std1.grade, std2.grade));
    }

}
