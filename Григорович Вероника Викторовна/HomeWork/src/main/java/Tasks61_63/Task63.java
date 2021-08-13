package Tasks61_63;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//сгенерировать List коллекцию целых чисел и n элементов от мин до макс, определить есть ли в этой коллекции которые делятся и на 3 и на 5
//FIXME нет min|max куча лишних действий. то что надо не сделано.
public class Task63 {

        static List<Integer> integerList = new ArrayList<>();

        public static void main(String[] args) {
            createList(integerList);
            List<Integer> integerNumbers = sortList(integerList);
            findNumbersWithDivisibleBy3And5(integerNumbers);

        }

        public static void createList(List<Integer> integerList) {
            int n = (int) (Math.random() * 20 + 1);
            for (int i = 0; i < n; i++) {
                integerList.add((int) (Math.random() * 20));
            }
            System.out.println(integerList);
        }

        public static List<Integer> sortList(List<Integer> integerList) {
            List<Integer> integerNumbers = integerList.stream()
                    .sorted((x1, x2) -> x1 - x2)
                    .collect(Collectors.toList());

            System.out.println("Отсортированная коллекция " + integerNumbers);
            return integerNumbers;
        }

        public static void findNumbersWithDivisibleBy3And5(List<Integer> integerNumbers) {
            boolean result = integerNumbers.stream()
                    .anyMatch((x) -> x % 3 == 0 && x % 5 == 0);
            if (result) {
                System.out.println("В коллекции есть числа, которые делятся на 3 и на 5");
            } else {
                System.out.println("В коллекции НЕТ чисел, которые делятся на 3 и на 5");
            }
        }
    }

