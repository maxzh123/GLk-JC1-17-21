public class Task18 {
    public static void main(String[] args) {
            int a[] = new int[10];
            for (int i =0; i <10; i++){
                a[i] = (int) (Math.random()*100);
            }
System.out.println(a[a.length-1]);
    }
}
