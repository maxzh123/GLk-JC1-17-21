public class Year {
    public static void main(String[] arg) {
        for (int i = 0; i < 13; i++) {
            if ((i < 8 && i % 2 == 1) || (i > 7 && i % 2 == 0)) {
                processNumber(i, 31);
            } else if (((i < 7 && i % 2 == 0) && i != 2) || (i > 8 && i % 2 == 1)) {
                processNumber(i, 30);
            } else if (i == 2) {
                processNumber(i, 28);
            }
        }

    }

    public static void processNumber(int month, int manyDay) {
        if (month < 10 && month > 0) {
            oneDigit(month, manyDay);
        } else if (month > 9) {
            twoDigit(month, manyDay);
        }
    }

    public static void oneDigit(int digit, int manyDay) {
        for (int i = 1; i < manyDay + 1; i++) {
            if (i < 10) {
                System.out.println("0" + i + "/0" + digit + "/2021");
            } else if (i > 9) {
                System.out.println(i + "/0" + digit + "/2021");
            }
        }
    }

    public static void twoDigit(int digit, int manyDay) {
        for (int i = 1; i < manyDay + 1; i++) {
            if (i < 10) {
                System.out.println("0" + i + "/" + digit + "/2021");
            } else if (i > 9) {
                System.out.println(i + "/" + digit + "/2021");
            }
        }
    }

}
