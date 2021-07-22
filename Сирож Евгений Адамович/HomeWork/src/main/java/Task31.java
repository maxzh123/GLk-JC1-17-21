public class Task31 {
    public static String string = "aaabbbccc";
    public static int count;
    public static String sum;


    public static void main(String arg[]) {
        timestring();
        timebilder();

    }


    public static void timestring() {
        long start = System.currentTimeMillis();
        addstring();
        long end = System.currentTimeMillis();
        System.out.println(" время работы стринга " + (end-start) + " милисек");
    }

    public static void timebilder() {
        long  start = System.currentTimeMillis();
        addbilder();
        long end = System.currentTimeMillis();
        System.out.println(" время работы билдера " + (end-start) + " милисек");
    }


    public static void addstring() {
        count = 0;
        while (count < 10000) {
            sum = sum + string;
            count++;
        }
    }

    public static void addbilder() {
        count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (count < 1000000) {
            stringBuilder.append(string);
            count++;
        }
    }
}
