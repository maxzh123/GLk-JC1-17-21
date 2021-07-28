package Tasks;

import java.util.HashSet;

public class Task40 {
    public static HashSet<Integer> createSet() {
        int a = 20;

        HashSet<Integer> integerHashSet = new HashSet<>();

        for (int i = 0; i < 20; i++){
            double random = Math.random() * a;
            integerHashSet.add((int) random);
        }
        return integerHashSet;
    }

    public static void main(String[] args) {
        System.out.println(createSet());
    }
}
