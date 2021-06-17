public class Task12 {
        public static void main (String [] args) {
            int i = 0;
            int factorialis = 1;
            calculateFactorialis(0,1);
        }
        public static void calculateFactorialis(int i, int factorialis) {
            while (i<=10) {
                if(i==0) {
                    System.out.println(i+" "+factorialis);
                    i++;
                    continue;
                }
                factorialis=factorialis*i;
                System.out.println(i+" "+factorialis);
                i++;
            }
        }
    }