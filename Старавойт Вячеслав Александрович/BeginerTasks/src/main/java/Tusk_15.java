public class Tusk_15 {

    public static void main(String[] args) {
        int count = 0; // при каждом нахождении простого числа наш счетчик будем увеличивать на 1.
        boolean n = false;
        while (!n) {
            for (int i = 51; i < 70; i += 2) { // так все четные числа это не простые, начинаем со следующего
                if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                    n = false;
                } else {
                    count += 1;
                    if (count == 2) {
                        System.out.println("второе простое число из заданого промежутка равно: " + i);
                    }
                }

                n = true;
            }
        }
    }
}
