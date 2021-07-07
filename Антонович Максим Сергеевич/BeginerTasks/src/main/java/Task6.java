public class Task6 {
    public static void main(String[] args) {
     int a = -17;
     System.out.println(lastNumber(a));
    }

    static boolean lastNumber (int i) {
        int o = (Math.abs(i)%10);
        if (o == 7) {
            return true;
        }
       return false;
    }
}
