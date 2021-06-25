import java.util.Scanner;

public class task17Version2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        long number = scanner.nextLong();
        v1(number);
        System.out.println("==");
        v2(number);
        System.out.println("==");
        v3(number);
    }

    public static long procSign(long num) {
        if (num < 0) {
            System.out.print("-");
            return -num;
        }
        return num;
    }

    public static void v1(long tnum) {
        long num = procSign(tnum);
        int arrayLen = 0;
        if (num != 0) {
            arrayLen = (int) Math.floor(1 + Math.log10(num));
        }
        long[] nums = new long[arrayLen];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = num % 10;
            num -= nums[i];
            num /= 10;
        }
        if (nums.length > 0) {
            for (int i = nums.length - 1; i > 0; i--) {
                if (i != (nums.length - 1) && (i + 1) % 3 == 0) {
                    System.out.print(" ");
                }
                System.out.print(nums[i]);
            }
            System.out.println(nums[0]);
        } else {
            System.out.println(0);
        }
    }

    public static void v2(long tnum) {
        long num = procSign(tnum);
        String str = String.valueOf(num);
        if (str.length() > 0) {
            for (int i = 0; i < str.length() - 1; i++) {
                if ((i != 0 && (str.length() - i) % 3 == 0)) {
                    System.out.print(" ");
                }
                System.out.print(str.charAt(i));
            }
            System.out.println(str.charAt(str.length() - 1));
        } else {
            System.out.println(0);
        }


    }

    public static void v3(long tnum) {
        long num = procSign(tnum);
        int log = (int) Math.floor(Math.log10(num));
        int fulllog = log;
        while (log > 0) {
            long pow = (long) Math.pow(10, log);
            long temp = num % pow;
            long dig = (num - temp) / pow;
            num = temp;
            if (fulllog != log && (log + 1) % 3 == 0) {
                System.out.print(" ");
            }
            System.out.print(dig);
            log--;
        }
        System.out.println(num);
    }
}



