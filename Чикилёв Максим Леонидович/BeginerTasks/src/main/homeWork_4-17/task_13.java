public class task_13 {
    public static void main(String[] args) {
        int sum = 1;
        int max = 1;
        do {
            max = max * sum;
            sum++;
        } while (sum <= 25);
        System.out.println(max);
    }
}
