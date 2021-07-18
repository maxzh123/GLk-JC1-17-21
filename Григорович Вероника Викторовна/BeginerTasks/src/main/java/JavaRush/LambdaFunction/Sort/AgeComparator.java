package JavaRush.LambdaFunction.Sort;

import java.util.Comparator;

public class AgeComparator implements Comparator <Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}
