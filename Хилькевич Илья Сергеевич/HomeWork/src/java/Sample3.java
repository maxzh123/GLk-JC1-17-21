public class Sample3 {
    public static void main (String[] args){
        for (int i=42;i<100;i=i+3){          /* for -цикл начинаем с 42 пока не достигнем 100 прибавляя по 3, int-целое число **/
            processNumber(i);//Вызываем определенную ниже функцию processNumber. Передаем в качестве параметра значение i
        }
    }
    private static void processNumber(int num){ //private-доступ в пределах класса
        if (num%3==0){
            System.out.println(num+" -делится на 3");        }
        else{
            System.out.println(num+" -не делится на 3");
        }
    }
}
