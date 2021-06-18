public class Sample5 {
    public static void main(String[] arg) { //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        for (int i = 1; i <= 12; i++) {
            System.out.println();
            for (int n = 1; n <= 31; n++) {
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    if (n < 10)
                        System.out.println("0" + n + " / " + i + " / " + "2021");
                    else
                        System.out.println(n + " / " + i + " / " + "2021");
                }
            }
            for (int k = 1; k <= 30; k++) {
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    if (k < 10)
                        System.out.println("0" + k + " / " + i + " / " + "2021");
                    else
                        System.out.println(k + " / " + i + " / " + "2021");
                }
            }
            for (int h = 0; h <= 28; h++) {
                if (i == 2) {
                    if (h < 10)
                        System.out.println("0" + h + " / " + i + " / " + "2021");
                    else
                        System.out.println(h + " / " + i + " / " + "2021");
                }
            }
        }
    }
}