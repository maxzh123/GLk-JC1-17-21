public class Task21 {
    static int[] arr = new int[]{2, 2, 1, 5, 8, 2, 2, 2, 1, 2,8,2};

    static boolean[] max = new boolean[arr.length];
    static boolean[] min = new boolean[arr.length];
    static int maxIdx = 0;
    static int minIdx = 0
   ;
    public static void main(String[] args) {

        findMinMax();
        markMinMax();
        int start = minIdx;
        int stop = maxIdx;
        for (int i = 0; i < max.length; i++) {
            for (int j = 0; j < min.length; j++) {
                if (max[i] && min[j]) {
                    if (Math.abs(stop - start) < Math.abs(i - j)) {
                        start = i;
                        stop = j;
                    }
                }
            }
        }
        if (start > stop) {
            int tmp = start;
            start = stop;
            stop = tmp;
        }
        int sum = 0;
        System.out.println("Суммируем диапазон [+(start + 1) +,+(stop-1) +]");
        for (int i = start + 1; i < stop; i++) {

            sum += arr[i];
            System.out.println("Добавили элемент №"+i+" равный: "+arr[i]+" Промежуточный  результат:"+sum);
        }
            System.out.println(sum);

    }

    public static void findMinMax() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
            if (arr[i] < arr[maxIdx]) {
                minIdx = i;
            }
        }
    }

    public static void markMinMax() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[maxIdx]) {
                max[i] = true;
            }
            if (arr[i] == arr[minIdx]) {
                min[i] = true;
            }

        }
    }

}