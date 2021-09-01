package Examination.Task1.v1;
/* Хилькевич Илья
        *
        * Сгенерировать три произвольных целых числа X, Y и Z. Если X больше Z,
        * то вывести на экран сумму X и Y, иначе вывести на экран значение Z.
        * Вывести на экран среднее арифметическое этих чисел.
        */
public class ExaminationTask1v1 {
    /*
     * Генерируется случайное число x
     */
    public static int getRandomNumber1(){
        return (int) (Math.random() * 100) + 1;
    }
    /*
     * Генерируется случайное число y
     */
    public static int getRandomNumber2(){
        return (int) (Math.random() * 100) + 1;
    }
    /*
     * Генерируется случайное число z
     */
    public static int getRandomNumber3() {
        return (int) (Math.random() * 100) + 1;
    }
    public static void main(String[] args) {
        /*
         * Производится вычисление
         */
        int x= getRandomNumber1();
        int y= getRandomNumber2();
        int z= getRandomNumber3();
        System.out.println("Сгенерированные числа: "+"x= "+x+" y= "+y+" z= "+z);
        if (x>z){
            System.out.println("X больше Z. Сумма х+y= "+(x+y));
        }else {
            System.out.println("X меньше Z. Z= "+z);
        }
        System.out.println("Среднее арифметическое X,Y,Z= "+ ((x+y+z)/3));
    }
}
