public class homework10 {
    public static void main(String[]arg){
int a=3,b=4;
int c=4,d=3;
int e=8,f=6;
if ((a+c<=e&&b+d<=f) || (a+d<=e&&b+c<=f )){
        System.out.println("Дома размерами\n"+"a="+a+", b="+b+", помещаются");}
    else if ((a+c<=f&&b+d<=e) || (a+d<=f&&b+c<=e )){
    System.out.println("Дома размерами\n"+"a="+a+", b="+b+", помещаются");
    }else{
    System.out.println("Дома размерами\n"+"a="+a+" b="+b+", не помещаются");
}
    System.out.println("на участке "+"e="+e+", f="+f);

        }
}
