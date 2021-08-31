package Task43_45_Exception;

public class task45 {

    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        }  catch (ArithmeticException e) { // так как арифметик наследуется от Runtime то именно так.
            System.out.println(e);
        } catch (RuntimeException e1) {
            System.out.println(e1);

        }
    }
}