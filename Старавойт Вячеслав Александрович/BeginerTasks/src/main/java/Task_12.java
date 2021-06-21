public class Task_12 { //факториал целых чисел от 0 до  10

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }


     public static int factorial(int number){
     int count=1;
     int sum=1; //факториал начинается с 1"
     while(count<=number){
         sum*=count;
         count++;
     }
     return sum;
     }
}
