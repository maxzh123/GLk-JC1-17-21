package Task39_42;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task39 {
    public static void main(String[] args) {
        List <Integer> trialVersion = new ArrayList<Integer>();
        trialVersion.add(4);
        trialVersion.add(2);
        trialVersion.add(3);
        trialVersion.add(-1);
        trialVersion.add(31);
        test(trialVersion);

        List <Student> newMagazine = new ArrayList<Student>();
        newMagazine.add(new Student("Дима", 10));
        newMagazine.add(new Student("Вася", 3));
        newMagazine.add(new Student("Петя", 6));
        newMagazine.add(new Student("Влад", 1));
        newMagazine.add(new Student("Слава", 2));
        newMagazine.add(new Student("Гриша", 0));
        test1(newMagazine);

    }
    private static void test (List<Integer>list){
        for (int i = 0; i <list.size(); i++) {
            if (list.get(i)<=3) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    private static void test1 (List<Student>list) {
        for (int i = 0; i<list.size(); i++){
            int t = list.get(i).getGrades();
            if (t<=2) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}



