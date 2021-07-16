package WorkBookTask.Task_39_42_Collection;

import java.util.ArrayList;
import java.util.List;

// удалить повторяющиеся цифры

public class Task_40 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            array.add((int) (Math.random() * 10));
        }
        for (int i = 0; i < array.size(); i++) {
            for (int j = i+1; j < array.size(); j++) { // j=i+1 для того чтобы один и тот же элемент себя полностью не удалял.
                if (array.get(i) == array.get(j)) {
                    array.remove(j);
                    j--;   // нужно для того чтобы после удаления элемента проверял следующий а не перепрыгивал на один, тем самым пропуская
                }
            }
        }
        // Вывод для себя проверка чего наворотил
        for (Integer print : array) {
            System.out.println(print);
        }
    }
}