public class task_19 {
    public static void main(String[] args) {
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 15);
            if (i % 2 == 0)
                System.out.println("число " + number[i] + " под индексом - " + i);
        }
    }
}