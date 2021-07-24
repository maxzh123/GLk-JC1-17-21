package Task39_42;

import java.util.*;

public class Task41 {
    public static void main(String[] args) {

        List<Integer> trialVersion = new ArrayList<Integer>();
        trialVersion.add(3);
        trialVersion.add(10);
        trialVersion.add(4);
        trialVersion.add(5);
        trialVersion.add(6);
        System.out.println(Collections.max(trialVersion));

        List<Student> searchForMaximumGrade = new ArrayList<Student>();
        searchForMaximumGrade.add(new Student("Галя", 3));
        searchForMaximumGrade.add(new Student("Валя", 10));
        searchForMaximumGrade.add(new Student("Лиза", 4));
        searchForMaximumGrade.add(new Student("Ксюша", 5));
        searchForMaximumGrade.add(new Student("Луиза", 6));
        test1(searchForMaximumGrade);
        test2(searchForMaximumGrade);
    }
    private static void test1 (List<Student> list){
        for (Student a: list) {
            System.out.println(a);
        }
    }
    private static void test2 (List<Student> list) {
        Iterator <Student> student= list.iterator();
        Student maxGrade = student.next();
        while (student.hasNext()){
            Student grade = student.next();
            if (maxGrade.getGrades()<grade.getGrades()){
                maxGrade=grade;
            }
        }
        System.out.println("Самая высокая оценка"+maxGrade);

    }
}

