/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает.
3. Переделать так, чтобы выводились ВСЕ даты года(с учетом того что в разных месяцах разное количество дней)
* */
public class Sample5 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample5

    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
            for (int i=1;i<=12;i++){//для цулочисленного i установить значение 0;выполнять блок пока i меньше либо равно 12; после каждого исполнения увеличить i на 1
                processNumber(i);//Вызываем определенную в другом месте функцию, для обработки значения i
            }
    }

    private static void processNumber(int month){//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        if (month>-1 && month<10){ //если переданное в функцию значение month больше чем -1 и одновременно мельше чем 10 то
            oneDigit(month); //Вызываем функци, которая выводит дату дописывая ведущий 0
        }else{//блок иначе
           if (month>-1 && month<100) {//проверяем что значение больше -1 и меньше 100
               twoDigit(month);//Вызываем функци, которая выводит дату
            }//блока иначе нет. эта ситуация будет проигнорирована. никаких действий не выполнится.
        }
    }

    private static void oneDigit(int dig) {//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        if (dig == 1 || dig == 3 || dig == 5 || dig == 7 || dig == 8)
            for (int day = 1; day < 10; day++)
            {System.out.println("0" + day + "/0" + dig + "/2021");}
        if (dig == 1 || dig == 3 || dig == 5 || dig == 7 || dig == 8)
            for (int day = 10; day < 32; day++)
            {System.out.println("" + day + "/0" + dig + "/2021");}

        if (dig == 4 || dig == 6 || dig ==9)
            for (int day = 1; day < 10; day++)
            {System.out.println("0" + day + "/0" + dig + "/2021");}
        if (dig == 4 || dig == 6 || dig ==9)
            for (int day = 10; day < 31; day++)
            {System.out.println("" + day + "/0" + dig + "/2021");}
        else {
           if (dig==2)
               for (int day = 1; day < 10; day++)
               {System.out.println("0" + day + "/0" + dig + "/2021");}
            if (dig==2)
                for (int day = 10; day < 29; day++)
                {System.out.println("" + day + "/0" + dig + "/2021");}}}

    private static void twoDigit(int dig) {
        if (dig == 10 || dig == 12)
            for (int day = 1; day < 10; day++)
            {System.out.println("0" + day + "/" + dig + "/2021");}
        if (dig == 10 || dig == 12)
            for (int day = 10; day < 32; day++)
            {System.out.println("" + day + "/" + dig + "/2021");}
        else{
            if (dig == 11)
                for (int day = 1; day < 10; day++)
                {System.out.println("0" + day + "/" + dig + "/2021");}
            if (dig == 11)
                for (int day = 10; day < 31; day++)
                {System.out.println("" + day + "/" + dig + "/2021");}
        }


   }}



