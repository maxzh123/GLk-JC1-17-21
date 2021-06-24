public class homework12{
    public static void main(String[]arg){
        int proizvedenie=1;
        int i=1;//т.к факториал 0!=1, а 1*1=1, то начнем с 1
        while (i<=10){
         proizvedenie*=i;
            i++;}
        System.out.println(proizvedenie);

        System.out.println("проверка "+1*2*3*4*5*6*7*8*9*10);
    }
}
