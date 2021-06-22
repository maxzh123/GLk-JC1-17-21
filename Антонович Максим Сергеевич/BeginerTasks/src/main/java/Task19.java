public class Task19 {
    public static void main(String[] args) {
        int a [] = {10, 20 , 48 , 87 , 78, 53, 59, 61, 99, 100};
        for (int i=2; i < a.length; i+=2) {
            System.out.println(i+": "+a[i]);
        }
    }
}
