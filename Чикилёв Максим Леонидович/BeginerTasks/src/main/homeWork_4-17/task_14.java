public class task_14 {
    public static void main(String[] args) {
        long number = 7893823445L;
        long sum = 0;
        isPrise(sum, number);
    }
        public static void isPrise(long sum, long number) {
            do {
                sum = sum + (number % 10);
                number = number / 10;
            } while (number > 0);
            System.out.println(sum);
        }
}
