public class Sample4 {

    private static int[] array = new int[]{5, 16, 22, 18, 49, 68, -3, 12, 21};/*закрытый статический метод для массива целых чисел с именем array
                                                                      ссылается на объект созданный оператором new целочисленный масив**/

    public static void main(String[] arg) {
        for (int i = 0; i < array.length; i++)  /*array.length-доступ к длинне масива**/
        processNumber(array[i], i);
    }
        private static void processNumber ( int i, int index){
            if (i % 3 == 0) {
                System.out.println("Значение масива № " + index + " равняется " + i + " делится на 3"); }
             else {
                System.out.println("Значение масива № " + index + " равняется " + i + " не делится на 3");
            }

        }

    }




