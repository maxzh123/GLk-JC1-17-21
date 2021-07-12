package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Task39and41 {
    static ArrayList<Student> badStudents = new ArrayList<Student>();

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        addStudents(list);
        System.out.println();
        badStudentsWithIterator(list);
        System.out.println();
        deleteBadGrades(list);
        System.out.println();
        deleteBadGradesWithIterator(list);
        System.out.println();
        findBestGrades(list);

    }

    public static void addStudents(ArrayList<Student> list) {
        list.add(new Student("Маша", (int) (Math.random() * 10)));
        list.add(new Student("Паша", (int) (Math.random() * 10)));
        list.add(new Student("Сережа", (int) (Math.random() * 10)));
        list.add(new Student("Лена", (int) (Math.random() * 10)));
        list.add(new Student("Саша", (int) (Math.random() * 10)));
        list.add(new Student("Петя", (int) (Math.random() * 10)));
        list.add(new Student("Ксюша", (int) (Math.random() * 10)));
        list.add(new Student("Ярик", (int) (Math.random() * 10)));
        list.add(new Student("Костя", (int) (Math.random() * 10)));
        list.add(new Student("Оля", (int) (Math.random() * 10)));
        System.out.println("Наш список после создания " + list);
    }

    public static void deleteBadGrades(ArrayList<Student> list) {
        System.out.println("Удаляем оценки меньше 4. Новый список без двоешников:");
        for (int i = 0; i < list.size(); i++) {
                 int nextGrade=list.get(i).getGrade();
                if (nextGrade<4) {
                    list.remove(i);
               i--;
            }
        }
        System.out.println("Список после удаления с помощью цикла for "+list);
    }

    public static void deleteBadGradesWithIterator(ArrayList<Student> list) {
        System.out.println("Удаляем оценки меньше 4. Новый список без двоешников:");
        ListIterator<Student> it = list.listIterator();
        while (it.hasNext()) {
            Student student = it.next();
            if (student.grade < 4) {
                it.remove();
            }
        }
        System.out.println("Список после удаления с помощью ИТЕРАТОРА "+list);
    }

    public static void findBestGrades(ArrayList<Student> list) {
        Iterator<Student> it=list.iterator();
        Student bestStudent= it.next();
        while (it.hasNext()) {
            Student someStudent=it.next();
            if(bestStudent.grade<someStudent.grade) {
                bestStudent=someStudent;
            }
        }
        System.out.println("Лучшая оценка у ученика "+bestStudent);
    }

    public static void badStudentsWithIterator(ArrayList<Student> list) {
        ListIterator<Student> it = list.listIterator();
        while (it.hasNext()) {
            Student student = it.next();
            if (student.grade < 4) {
                badStudents.add(student);
            }
        }
        System.out.println("Список учеников с неудовлетворительными оценками "+badStudents);
    }

}




