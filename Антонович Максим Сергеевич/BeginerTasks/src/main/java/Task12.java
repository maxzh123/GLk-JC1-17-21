public class Task12 {
    public static void main(String[] args) {
        int i = 1;
        int count = 1;
        while (i <= 10) {
            count = count * i;
            System.out.println(i+":"+ "factorial:"+" " +count);
            i++;
        }
    }
}