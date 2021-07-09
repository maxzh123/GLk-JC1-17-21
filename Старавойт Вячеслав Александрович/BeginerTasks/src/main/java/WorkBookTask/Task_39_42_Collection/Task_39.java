package WorkBookTask.Task_39_42_Collection;

import java.util.ArrayList;
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
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < 3) { // условие на удаление неудволетворительных оценок.
                arrayList.remove(i);
            }
        }
        System.out.println("__________Оценки после чистки ______________");
        for (Integer print : arrayList) {
            System.out.println(print);
        }
    }
}
