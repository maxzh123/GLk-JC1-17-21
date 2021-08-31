package Examination.Task1.v2;
/* Хилькевич Илья
 *
 * Сгенерировать три произвольных целых числа X, Y и Z. Если X больше Z,
 * то вывести на экран сумму X и Y, иначе вывести на экран значение Z.
 * Вывести на экран среднее арифметическое этих чисел.
 */
public class GenerateNumber {
    protected int x= getRandomNumber();
    protected int y= getRandomNumber();
    protected int z= getRandomNumber();
/*
* Генерируется случайное число
*/
  protected int getRandomNumber(){
  return (int) (Math.random() * 100) + 1;        }
/*
*Вывод на консоль сгенерированные числа
*/
  protected void rezultGeneration() {
      System.out.println("Сгенерированные числа: " + "x= " + x + " " + "y= " + y + " " + "z= " + z);
  }
/*
* Производится вычисление согласно условиям задачи
*/
    protected void calculationNumber () {
        if (x > z) {
            System.out.println("X больше Z. Сумма х+y= " + (x + y));
        } else {
            System.out.println("X меньше Z. Z= " + z);
        }
        System.out.println("Среднее арифметическое X,Y,Z= " + ((x + y + z) / 3));
    }
}


