package WorkBookTask.Task_39_42_Collection;

import java.util.ArrayList;
import java.util.Iterator;

// заполнить оценками список, удалить неудволетворительные.
public class Task_39 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add((int) (Math.random() * 10)); // по условию заполнили оценками 0-10.
        }
        for (Integer print : arrayList) {
            System.out.println(print);
        }
        Iterator<Integer> numbersIterator = arrayList.iterator();
        while (numbersIterator.hasNext()) {
            Integer next=numbersIterator.next();
          if (next<3){
            numbersIterator.remove();
        }
        }

        System.out.println("__________Оценки после чистки ______________");
        for (Integer print : arrayList) {
            System.out.println(print);
        }
    }
}
