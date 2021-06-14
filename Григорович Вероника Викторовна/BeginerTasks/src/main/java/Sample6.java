/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает.
3. Челенж. Переделываем, так что количество вечислений остатка от деления было как можно меньше. Посмотрим у кого что получится.
* */
public class Sample6 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample6
    private static int count=0;
    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
     * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        for (int i=1;i<=1000;i++){//для цулочисленного i установить значение 0;выполнять блок пока i меньше 100; после каждого исполнения увеличить i на 1
            if (isPrime(i)){// Вызываем функцию которая проверит является ли число простым если да - выводим его
                System.out.println(i);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
            }//блока иначе нет. эта ситуация будет проигнорирована. никаких действий не выполнится.
        }
        System.out.println("Произвели сравнений остатка от деления:"+count);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }

    private static boolean isPrime(int number) {
        if (number%2==0 && number!=2 || number%3==0 && number!=3 || number%5==0 && number!=5 || number%7==0 && number!=7) // почитала в интернетах, что надо делать проверку на делимость 2,3,5,7 согласно этому методу решето
        {return false; } //проверям делимость на 2 и что число само не два
        int chislo = (int) Math.sqrt(number); //из алгоритма поиска простых чисел - проверяемое число состоит хотя бы из двух множителей, то ни одно из них не может превышать двоичный корень.
        for (int i=3;i<=chislo;i=i+2) {//идем с шагом 2 потому что все четные это не простые числа (кроме 2)
            count++;
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}



