package JavaRush;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//Создать массив на 20 чисел.
//Заполнить его числами с клавиатуры.
//Вывести пять наибольших чисел.
//Каждое значение с новой строки.

public class task8_8 {

        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }

            sort(array);
            for (int i = 0; i < args.length; i++) {
                System.out.println(array[i]);

            }
        }

        public static void sort(int[] array) {
           for(int i =0; i< array.length;i++){
               for (int j=i;j< array.length;j++){
                  if (array[i]<array[j]) {
                      int temp = array[i];
                      array[i]=array[j];
                      array[j]=temp;
                  }
               }
        }
    }
}
