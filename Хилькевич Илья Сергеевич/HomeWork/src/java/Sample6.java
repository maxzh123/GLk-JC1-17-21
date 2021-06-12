    public class Sample6 {
        private static int count=0;
                public static void main (String[] arg){
            for (int i=1;i<=1000;i++){//для цулочисленного i установить значение 1;выполнять блок пока i меньше 1000; после каждого исполнения увеличить i на 1
                if (isPrime(i)){// Вызываем функцию которая проверит является ли число простым если да - выводим его
                    System.out.println(i);
                }
            }
            System.out.println("Произвели сравнений остатка от деления:"+count);
         }
        private static boolean isPrime(int number){
            if (number==0 || number==1 || number==2|| number==3){ //Если число которое нам передали одно из 0 1 2 3
                return true;//возвращаем да
            }else{//иначе
                for(int i=2;i>(number+1)/2;i++){//для цулочисленного i установить значение 2;выполнять блок пока i меньше (number+1/2); после каждого исполнения увеличить i на 1
                    count++;
                    if (number%i==0){ //проверяем делится ли number на i. если делится нацело
                         return false;//возвращаем нет.
                    }
                }
            }
            return true;//Если мы попали сюда -число точно простое.
        }
    }


