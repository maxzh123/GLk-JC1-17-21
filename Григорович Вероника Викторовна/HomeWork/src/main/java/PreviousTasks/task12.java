package PreviousTasks;

public class task12 {
    public static void main (String [] args) {
        int i = 0;
        int factorial = 1;
        calculateFactorial(0,1);
    }
        public static void calculateFactorial(int i, int factorial) {
        while (i<=10) {
            if(i==0) {
                System.out.println(i+" "+factorial); //мы знаем что факториал числа единица, поэтому не вычисляем ничего
                i++;
                continue;
            }
            factorial=factorial*i;
            System.out.println(i+" "+factorial);
            i++;
        }
    }
}
