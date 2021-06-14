/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает.
3. Переделать так, чтобы выводились ВСЕ даты года(с учетом того что в разных месяцах разное количество дней)
* */
public class Sample5 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample5
    public static void main(String[] arg) {
        for (int i = 1; i <= 12; i++) {
            processNumber(i);
        }
    }

    private static void processNumber(int month) {
        if (month > -1 && month < 10) {
            oneDigit(month);
        } else {
            if (month > -1 && month < 100) {
                twoDigit(month);
            }
        }
    }

    private static void oneDigit(int dig) {
        if (dig == 1 || dig == 3 || dig == 5 || dig == 7 || dig == 8) {
            for (int date = 1; date <= 31; date++) {
                System.out.println(date + "/0" + dig + "/2021");
            }
        } else if (dig == 4 || dig == 6 || dig == 9) {
            for (int date = 1; date <= 30; date++) {
                System.out.println(date + "/0" + dig + "/2021");
            }
        } else {
            if (dig == 2) {
                for (int date = 1; date <= 28; date++) {
                    System.out.println(date + "/0" + dig + "/2021");
                }
            }
        }
    }

    private static void twoDigit(int dig) {
        if (dig == 10 || dig == 12) {
            for (int date = 1; date <= 31; date++) {
                System.out.println(date + "/" + dig + "/2021");
            }
        } else { if (dig == 11) {
            for (int date = 1; date <= 30; date++) {
                System.out.println(date + "/" + dig + "/2021");
            }
        }
        }
    }
}
