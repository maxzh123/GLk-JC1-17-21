/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает.
3. Переделать так, чтобы выводились ВСЕ даты года(с учетом того что в разных месяцах разное количество дней)
* */
public class Sample5 {
    public static void main (String[] arg){
            for (int i=0;i<=12;i++){//для цулочисленного i установить значение 0;выполнять блок пока i меньше либо равно 12; после каждого исполнения увеличить i на 1
                processNumber(i);//Вызываем определенную в другом месте функцию, для обработки значения i
            }
//1,3,5,7,8,10,12-31 2-28,
    }

    private static void processNumber(int month){//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        if (month>0 && month<10){ //если переданное в функцию значение month больше чем -1 и одновременно мельше чем 10 то
            oneDigit(month); //Вызываем функци, которая выводит дату дописывая ведущий 0
        }else{//блок иначе
            if (month>9 && month<13) {//проверяем что значение больше -1 и меньше 100
                twoDigit(month);//Вызываем функци, которая выводит дату
            }//блока иначе нет. эта ситуация будет проигнорирована. никаких действий не выполнится.
        }
    }

    private static void oneDigit(int dig){//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        System.out.println("01/0"+dig+"2021");//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }

    private static void twoDigit(int dig){//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        System.out.println("01/"+dig+"2021");//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }


}
