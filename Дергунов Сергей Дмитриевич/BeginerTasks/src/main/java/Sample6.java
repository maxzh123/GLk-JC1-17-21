/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает.
3. Челенж. Переделываем, так что количество вечислений остатка от деления было как можно меньше. Посмотрим у кого что получится.
* */

public class Sample6 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample6
    private static int count = 0;
    private static int countPrime = 0;
    private static boolean[] all = new boolean[1001];//массив для всех чисел.По умолчанию все простые
    public static int[] prime = new int[171];//можно избавится и помнить только последнее найденное простое число

    public static void main(String[] arg) {
        for (int i = 0; i < 1000; i++) {
            all[i] = true; //массив для всех чисел.По умолчанию все простые
        }
        for (int i = 2; i <= 1000; i++) {
            if (all[i]) {// если простое - проверяем так ли это
                if (isPrime(i)) {  //если это так
                    prime[countPrime] = i;
                    for (int n = prime[countPrime]; n < 1000; ) { //помечаем в массиве все числа кратные нашему простому false
                        all[n] = false;
                        n += prime[countPrime];
                    }
                }
            }
        }
        System.out.println("Произвели сравнений остатка от деления:" + count);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
        System.out.println("Итого простых чисел:" + countPrime);
    }

    private static boolean isPrime(int number) {
        for (int i = 3; i <= Math.floor(Math.sqrt(number)); i += 2) {//для цулочисленного i установить значение 3;выполнять блок пока i меньше (number+1/2); после каждого исполнения увеличить i на 1
            if (all[i]) {
                count++;
                if (number % i == 0) {//проверяем делится ли number на i. если делится нацело
                    return false;//возвращаем нет.
                }
            }
        }
        countPrime++;
        System.out.println(number);
        return true;//Если мы попали сюда -число точно простое.
    }
}
