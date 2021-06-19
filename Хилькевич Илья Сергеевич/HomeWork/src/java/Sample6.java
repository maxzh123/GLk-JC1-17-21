  public class Sample6 {
      private static int count = 0;
      private static int countP = 0;
      public static void main(String[] arg) {
          for (int i = 1; i <= 1000; i++) {
              if (i%2==0){
              isPrime(i);}
                  System.out.println(i);countP++;
          }
           System.out.println("Произвели сравнений остатка от деления:"+count);
          System.out.println("Чисел:"+countP);
       }
        private static boolean isPrime(int number){
            if (number==0 || number==1 || number==2|| number==3){
                return true;
            }else{

                for(int i=2;i<(number+1)/2;i++){
                    count++;
                     if (number%i==0){
                       return false;}
                }
            }
            return true;
        }
    }

