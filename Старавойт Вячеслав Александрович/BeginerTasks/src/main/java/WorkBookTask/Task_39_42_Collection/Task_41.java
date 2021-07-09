package WorkBookTask.Task_39_42_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// задание с помощью итератора найти максимальное число в массиве

public class Task_41 {
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            array.add((int) (Math.random() * 100));
        }
        int max =array.get(0);
       // Iterator<Integer> numbersIterator = array.iterator();
        //while (numbersIterator.hasNext()){
        // Как с помощью итератора сделать я не знаю
         for(int i=0; i< array.size(); i++){
              if(max<array.get(i)){
                  max= array.get(i);
              }
            }
            System.out.println("--------------" + max+"--------------");
            // Вывод для себя проверка чего наворотил
            for (Integer print : array) {
                System.out.println(print);

            }
        }
    }

