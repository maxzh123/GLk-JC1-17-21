import java.util.LinkedHashSet;

public class Full {

    static int repeated_digit(int n) {

        LinkedHashSet<Integer> s = new LinkedHashSet<>();


        while (n != 0) {

            int d = n % 10;


            if (s.contains(d)) {


                return 0;

            }

            s.add(d);

            n = n / 10;

        }


        return 1;

    }


    static int calculate(int L, int R) {

        int answer = 0;


        for (int i = L; i < R + 1; ++i) {


            answer = answer + repeated_digit(i);

        }


        return answer;

    }


    public static void main(String[] args) {

        int L = 1, R = 150;


        System.out.println(calculate(L, R));

    }
}

