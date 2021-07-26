package task52;

import java.util.ArrayList;

public class main {

        public static int createSet() {
                int a = 20;
                int sum = 0;

                ArrayList<Integer> m = new ArrayList<>();

                for (int i = 0; i < 20; i++) {
                        double random = Math.random() * a;
                        m.add((int) random);
                }
                for (int i = 0; i < m.size(); i++) {
                        sum += m.get(i);
                }
                return sum / m.size();
        }

        public static void main(String[] args) {
                System.out.println(createSet());
                System.out.println();
        }
}

