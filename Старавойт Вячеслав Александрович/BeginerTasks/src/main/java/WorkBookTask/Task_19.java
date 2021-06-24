package WorkBookTask;

public class Task_19 {
        public static void main(String[] args) {
            int[] array =new int[]{1,2,3,4,5,6,7,8,9,10};
            for(int i = 2; i<array.length;i+=2){ // так как нулевой элемент не является четным, начинаем со второго.
                System.out.println(array[i]);
            }
        }
    }

