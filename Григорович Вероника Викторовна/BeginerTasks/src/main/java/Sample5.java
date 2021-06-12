/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает.
3. Переделать так, чтобы выводились ВСЕ даты года(с учетом того что в разных месяцах разное количество дней)
* */
public class Sample5 {
    public static int [] days=new int[] {0,31,28,31,30,31,30,31,31,30,31,30,31};//Сообщаем компилятору что Это класс и мы дали ему имя Sample5

    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
            for (int i=1;i<=12;i++){//для цулочисленного i установить значение 0;выполнять блок пока i меньше либо равно 12; после каждого исполнения увеличить i на 1
                processNumber(i);//Вызываем определенную в другом месте функцию, для обработки значения i
            }
    }

    private static void processNumber(int month){
   System.out.println("__________________====="+do2dig(month)+" =====--------------");
   processMonth(month);
    }

    private static String do2dig(int dig){
        if(dig>=0 && dig<10) {
            return "0"+dig;
        } else if(dig>9) {
            return String.valueOf(dig);
        } else {return "Ошибка";
        }
         }

    private static void processMonth(int dig) {
        for (int d = 1; d <= days[dig]; d++) {
            System.out.println(do2dig(d) + "/" + do2dig(dig) + "/2021");
        }
    }

}
