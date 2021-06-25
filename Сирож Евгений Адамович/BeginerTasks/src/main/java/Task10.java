public class Task10 {
    public static void main(String arg[]) {
        int a = 2;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 1;
        if ((a * b <= e * f) && ((a <= e && b <= f) || (b <= e && a <= f))) {
            System.out.println("Дом\n" + "a=" + (a * b) + " помещается");
        } else {
            System.out.println("Дом\n" + "a=" + (a * b) + "не помещается");
        }
//        } else if ((c * d <= e * f) && (c <=e&&c<=f) || (d <= e && b<=f)) {
//            System.out.println("Дом\n" + "с=" + (c*d) + ", c=" + " помещается");
        if (((c * d <= e * f) && ((c <= e && d <= f) || (d <= e && c<= f)))) {
            System.out.println("Дом\n" + "c=" + (c * d) + " помещается");
        } else {
            System.out.println("Дом\n" + "c=" + (c * d) + "не помещается");
        }


    }
}







