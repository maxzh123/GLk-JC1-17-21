public class homework14 {
    public static void main(String[] arg){

       long i,b=0;
        long a=7893823445L;
        String d="7893823445";
        int len=d.length();
        int  c=1;
       do{
           i=a%10;
           a=a/10;
           c++;
           b+=i;
       }while (c<=len);{
                        System.out.println(b);}
    }
}