package Samples;/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает.
3. Челенж. Переделываем, так что количество вечислений остатка от деления было как можно меньше. Посмотрим у кого что получится.
* */


public class Sample6 {//Сообщаем компилятору что Это класс и мы дали ему имя Samples.Sample6
    private static int count=0;
    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
    public static void main (String[] arg){//Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        for (int i = 2; i<3;i++) { // добавил простое число 2 используя тот метод isPrime
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        for (int i=3;i<=1000;i+=2){// начинаем искать простые числа с "3" и проходимся только по нечетным, так как четные имеет как минимум делитель на 2.
            if (isPrime(i)){// Вызываем функцию которая проверит является ли число простым если да - выводим его
                System.out.println(i);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
            }//блока иначе нет. эта ситуация будет проигнорирована. никаких действий не выполнится.
        }

        System.out.println("Произвели сравнений остатка от деления:"+count);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }


    private static boolean isPrime(int number){
        double square =(double) Math.sqrt(number);
            if (number > 3 && number % 3 == 0) { // добавил одно условие дополнительное.
                count++;
                return false;
            }
            for(int i=3;i<square;i+=2) {//для цулочисленного i установить значение 2;выполнять блок пока i меньше (number+1/2); после каждого исполнения увеличить i на 1
                count++;
            if (number % i == 0) {//проверяем дели тся ли number на i. если делится нацело
                    return false;//возвращаем нет.
                }
            }

       return true;//Если мы попали сюда -число точно простое.
    }
}



