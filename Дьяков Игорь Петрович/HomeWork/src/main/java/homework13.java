public class homework13 {
    public static void main(String[]arg){
        double s=1;
        int i=1;
        do{
            s=s*i;
            i++;
            }while (i<26);
        i--;//просто 26 не смотрится)
        System.out.println("произведение чисел от 1 до 25 = "+s+", i="+i);
        }
}
