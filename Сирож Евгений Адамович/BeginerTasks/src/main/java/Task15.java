public class Task15 {

    public static void main(String arg[]) {
        int count = 0;

        for (int i = 50; i <= 70; i++) {
            if (isPrime(i)) {
                count++;
                if (count == 2) {
                    System.out.println("Второе простое число = " + i);
                    break;
                }


            }
        }
    }

    private static boolean isPrime(int number) {
        int count = 0;
        if (number == 0 || number == 1 || number == 2 || number == 3) {
            return true;
        } else if (number % 2 == 1) {
            for (int i = 2; i < Math.sqrt(number) + 1; i++) {
                count++;
                if (number % i == 0) {
                    return false;
                }
            }
        } else if (number % 2 == 0) {
            return false;
        }
        return true;
    }

}

