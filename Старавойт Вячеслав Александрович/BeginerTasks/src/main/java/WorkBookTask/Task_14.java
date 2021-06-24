package WorkBookTask;

public class Task_14 {
    public static void main(String[] args) {
        long number = 7893823445L;
        long sum=0L;
        while (number!=0){
            sum+=number%10;
            number/=10;
        }
        System.out.println(sum);

    }
}

