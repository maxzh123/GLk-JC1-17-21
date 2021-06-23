public class task17version3 {
    public static void main(String[] args) {
        int num =88767656;
        String str = String.valueOf(num);
        if (str.length() > 0) {
            for (int i = 0; i <= str.length() - 1; i++) {
                if ((i != 0 && (str.length() - i) % 3 == 0)) {
                    System.out.print(" ");
                }
                System.out.print(str.charAt(i));
            }

        } else {
            System.out.println(0);
        }
    }
}

