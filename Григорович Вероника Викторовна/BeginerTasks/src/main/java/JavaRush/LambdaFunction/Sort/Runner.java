package JavaRush.LambdaFunction.Sort; // сортировка по возрасту по возрастанию и сортировка по длине имени


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static ArrayList <Student> students=new ArrayList<Student>();

    public static void main(String[] args) {
        Collections.addAll(students,
                new Student("Иванов", 22),
        new Student("Смирнов", 21),
        new Student("Козлова Дина",20),
                new Student("Иглесиасис",19)
                );
        Collections.sort(students, new AgeComparator());
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("___________");
        Collections.sort(students, new NameComparator());
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("___________");
        sortWithLambda(students);
    }

    public static void sortWithLambda(ArrayList <Student> students) { //а это с помощью лямбда (sort.(students, (st1, st2) -> st1.age - st2.age)
        Collections.sort(students, Comparator.comparingInt(st -> st.age));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
