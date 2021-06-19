/* Задание:
1. запустить убедится, что работает.
2. изменить количество повторений.
* */

public class Sample2 {

    public static void main (String[] arg){

      int x=734685;
       int a=557;
       int b=a^x;
       print(b);
       print(b^x);
        print(a | 0b10011);
        print(a | 0b10010);
       print(a | 0b10000);
    //    Object x=new NewNum();
     //   if (x instanceof Number) {
    //        Number a=(Number) x;
     //       print(a.intValue());
            }


        private static void print(int x) {
        System.out.print(x);
        System.out.print("\t");
        System.out.println(Integer.toBinaryString(x));
    }

}
