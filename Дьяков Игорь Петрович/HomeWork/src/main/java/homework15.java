public class homework15 {
    public static void main(String[] args) {
        int count = 0;
        int t = 0;
        for (int n = 50; n <= 70; n++)
            for (int i = 1; i <= n; i++)
                if (n % i == 0) {
                    count++;
                    if (count > 2 && i == n)
                        count = 0;
                    if (count == 2 && i == n) {
                        t++;
                        count = 0;
                        if (t == 2) {
                            System.out.println("второе простое число из промежутка от 50 до 70 равно "+n);
                            break;
                        }
                    }
                }
    }
}
