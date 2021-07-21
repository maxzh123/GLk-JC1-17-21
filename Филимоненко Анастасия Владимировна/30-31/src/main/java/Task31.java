public class Task31 {
    public static String sum;
    public static int n =0;
    public static String simples ="aaabbbccc";

    public static void main(String[] args) {
        TimeStringBuilder();
        TimeSumString();

    }

    public static void SumString() {
        n=0;
        while (n < 200000) {
            sum += simples;
            n++;
        }
    }

    public static void TimeSumString() {
        long startTime = System.currentTimeMillis();
        SumString();
        long endTime = System.currentTimeMillis();
        System.out.println("Время операции с сложением: " + (endTime - startTime)  + " ms");
    }


    public static void SumStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        n = 0;
        while (n < 200000) {
            stringBuilder.append(simples);
            n++;
        }
    }


    public static void  TimeStringBuilder(){
        long startTime = System.currentTimeMillis();
        SumStringBuilder();
        long endTime = System.currentTimeMillis();
        System.out.println("Время операции с StringBuilder: " + (endTime-startTime) + " ms");
    }
}
