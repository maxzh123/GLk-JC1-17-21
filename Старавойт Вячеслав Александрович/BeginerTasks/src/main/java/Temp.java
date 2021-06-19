public class Temp {
    public static void main(String[] args) {
        int a = 0b1001;
       print(a);
       print(a<<1);
    }
    private static void print(int x){
        System.out.print(x);
        System.out.print("\t");
        System.out.println(Integer.toBinaryString(x));
    }
}
