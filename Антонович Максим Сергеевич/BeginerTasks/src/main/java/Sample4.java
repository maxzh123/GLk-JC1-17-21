/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает. (если не получится - не беда, этого я вам не обьяснял)
3. поменять функцию обработчик так, чтобы она выводила еще и информацию, о том делится ли значение i на 3
* */
public class Sample4 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample4
    private static int[] array=new int[]{5,16,22,18,49,68,-3,12,21};

    public static void main (String[] arg){
        for (int i=0;i<array.length;i++){
            processNumber(array[i],i);
        }
    }
    private static void processNumber(int i,int index){
        if (i%3==0) {
            System.out.println("Значение масива № " + index + " равняется " + i + " число делится на 3");
        }else{
            System.out.println("Значение масива № "+index+ " равняется "+i);
        }
    }
}
