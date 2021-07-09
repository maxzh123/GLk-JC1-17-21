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
        int count = 10;
        int minGrade = 4;
        grades = new ArrayList<>();
        Fill(count);
        System.out.println("До сессии: ");
        PrintList();
        RemoveNonAcceptableWithStream(minGrade);
        //RemoveNonAcceptable(4);
        System.out.println("После сессии: (с оценкой " +minGrade +" и ниже отчислены)");
        PrintList();
        System.out.println("Лучший студент :" + FindTheBestWithStream());
        //System.out.println("Лучший студент :" + FindTheBest());
        //но это не точно)).. их может быть несколько.. это надо доделывать.
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

    static void RemoveNonAcceptableWithStream(int grade) {
        Stream<Student> studentsStream = grades.stream();
         grades = (ArrayList<Student>) studentsStream.filter(x -> x.grade > grade).collect(Collectors.toList());
    }

    static void PrintList() {
        for (Student student : grades) {
            System.out.println(student);
        }
    }

    static Student FindTheBestWithStream() {
        Stream<Student> studentsStream = grades.stream();
        return studentsStream.max(HomeWork::compare).get();
    }

    private static int compare(Student std1, Student std2) {
        return (Integer.compare(std1.grade, std2.grade));
    }

    // 41. Создать список оценок учеников с помощью ArrayList,
    //заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.
    static Student FindTheBest() {
        Iterator <Student>iterator = grades.iterator();
        Student bestStudent= iterator.next();
        while (iterator.hasNext()){
           Student  tempStudent = iterator.next();
           if (bestStudent.grade< tempStudent.grade){
               bestStudent=tempStudent;}
        }
        return bestStudent;
    }

}
