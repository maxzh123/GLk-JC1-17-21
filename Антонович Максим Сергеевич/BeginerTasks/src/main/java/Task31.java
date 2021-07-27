public class Task31 {
    public static String string = "aaabbbccc";
    public static int count;
    public static String sum;

    public static void main(String[] args) {
        String summ;
        StringBuilder ar = new StringBuilder("Hello");
        for (int i = 1; i < 100; i++) {
            ar.append("Hello");
        }
        System.out.println(ar);
        String ar1 = "Help";
        summ = string;
        for (int j = 1; j < 2; j++) {
            summ += summ + string;
        }
        System.out.println(summ);
    }
}
// нужно проверить еще скорость выполнения! Не забудь)
