
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Temp1 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(" * Для окончани ввода введите любую букву или символ ");
        System.out.println("Введите числа которые хотите отсортировать пузырьком: ");
        Scanner number = new Scanner(System.in);

        while (true)  {
            try {
                int i = number.nextInt();
                list.add(i); }
            catch(Exception e )   { // как подругому задать чтобы если пользователь введет пустую строку вместо int, я не знаю. только через ошибку.
                break;}
        }

        IsSorted(list); // создали метод который будет сортировать
        printList(IsSorted(list)); // создали метод который будет выводить список

    }

    private static ArrayList <Integer> IsSorted(ArrayList<Integer> list){
    ArrayList<Integer> copy = new ArrayList<>(list);
      boolean sort = false; 
      int number1; // переменная для обмена.
           while (!sort){
        sort =true;// для того
             for(int i =0; i< copy.size()-1; i++){
                 if(copy.get(i) > copy.get(i+1)){
                  sort = false; //флажок указывает что массив не отсортирован.
                  number1=copy.get(i); //делаем обмен через переменную number1.
                   copy.set(i,copy.get(i+1));
                   copy.set(i+1,number1);
                 }
             }
           }
        return copy;
    }


    private static void printList(ArrayList<Integer> list) {
        for(Integer n: list ){
            System.out.println(n);
        }
    }
}
