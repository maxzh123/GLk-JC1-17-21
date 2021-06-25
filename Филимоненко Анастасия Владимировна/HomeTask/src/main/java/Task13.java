public class Task13 {
    public static void main(String[] args){
        int i = 1;
        int product = 1;
        do{
            product = product + (product * 1);
            i++;
        }while(i < 25);
        System.out.println(product);
    }
}
