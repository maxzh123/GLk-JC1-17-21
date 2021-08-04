import java.util.ArrayList;
import java.util.Iterator;

public class Task39 {
    public static void main(String[] arg) {
        ArrayList<Integer> pupils = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            pupils.add((int) (Math.random() * 10));
        }
        for (Integer print : pupils) {
            System.out.println(print);
        }
        Iterator<Integer> numbersIterator = pupils.iterator();
        while (numbersIterator.hasNext()) {
//            Integer next = numbersIterator.next();
            if (numbersIterator.next() <= 4) {
                numbersIterator.remove();
            }

        }
        System.out.println("----------граница после отсеивания полупокеров------------");
        for (Integer print : pupils) {
            System.out.println(print);
        }

    }

}


