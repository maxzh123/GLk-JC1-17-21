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
        //Като - так.
        Iterator<Integer> numbersIterator = array.iterator();
        while (numbersIterator.hasNext()){
            Integer el=numbersIterator.next();
            // numbersIterator.remove(); //А Это как удалить текущий
            if (max<el){max=el;}
        }
            System.out.println("--------------" + max+"--------------");
            // Вывод для себя проверка чего наворотил
            for (Integer print : array) {
                System.out.println(print);

            }
        }
    }

