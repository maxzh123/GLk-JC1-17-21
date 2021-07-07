package JavaRush;

//Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.
// использовать методы sort и isGreaterThan, sort должен его вызывать.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task8_12 {

        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] array = new String[20];
            for (int i = 0; i < array.length; i++) {
                array[i] = reader.readLine();
            }

            sort(array);

            for (String word : array) {
                System.out.println(word);
            }
        }

        public static void sort(String[] array) {
          for(int i =0; i< array.length;i++){
             for(int j =i;j< array.length;j++){
                 if(isGreaterThan(array[i],array[j] )){
                     String temp=array[i];
                     array[i]=array[j];
                     array[j]=temp;
                 }
             }

          }
        }

        //Метод для сравнения строк: 'а' больше чем 'b'
        public static boolean isGreaterThan(String a, String b) {
            return a.compareTo(b) > 0;
        }
    }

