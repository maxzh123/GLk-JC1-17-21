package task26_31;

public class task31 {
    public static String string="aaabbbccc";
    public static int count;
    public static String sum;


    public static void main(String[] args) {
        timeWithAdditionOfLines();
        timeWithBuilder();
    }

    public static void timeWithAdditionOfLines() {
        long start = System.currentTimeMillis();
        additionOfLines();
        long end = System.currentTimeMillis();
        System.out.println("Время работы метода сложения строк" + (end-start) + " милисекунд");
    }

    public static void timeWithBuilder() {
        long start = System.currentTimeMillis();
        additionWithBuilder();
        long end = System.currentTimeMillis();
        System.out.println("Время работы метода Builder " + (end-start) + " милисекунд");
    }




    public static void additionOfLines() {
        count=0;
        while (count<100000) {
            sum=sum+string;
            count++;
        }

    }

    public static void additionWithBuilder() {
        count=0;
        StringBuilder stringBuilder=new StringBuilder();
        while (count<100000) {
            stringBuilder.append(string);
            count++;
        }


    }
}
