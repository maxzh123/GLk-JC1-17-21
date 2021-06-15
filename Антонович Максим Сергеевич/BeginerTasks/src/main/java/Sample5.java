/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает.
3. Переделать так, чтобы выводились ВСЕ даты года(с учетом того что в разных месяцах разное количество дней)
* */
public class Sample5 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample5
    public static void main(String[] arg) {
  /*      for (int i = 1; i <= 12; i++) {
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
        */
  int i =1;
        while (i<=12) {
            if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i== 12)
            {
                int m =1;
                while ( m<=31) {
                    System.out.println("day_"+m+"/month_"+i+"/ year 2021");
                    m++;
                }
            }else  if (i==2){
                int y =1;
                while (y<=28) {
                    System.out.println("day_"+y+"/month_"+i+"/ year 2021");
                    y++;
                }
            } else {
                int v= 1;
                while (v<=30) {
                    System.out.println("day_"+v+"/month_"+i+"/ year 2021");
                    v++;
                }
            }
            i++;
        }
    }
}

