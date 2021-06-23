public class main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1010, 0, 98, 90, 1, 1000, 14, 26, 4, 2, 2012};

        int minValue = array[0];
        int minIndex = 0;


        int maxValue = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        System.out.println(" Max Value: " + maxValue);
        System.out.println(" Max Index: " + maxIndex);
        int sum = 0;

        if (maxIndex < minIndex) {
            for (int i = maxIndex + 1; i < minIndex; i++) {
                sum += array[i];
            }
        } else
            for (int i = minIndex + 1; i < maxIndex; i++) {
                sum += array[i];
            }
        System.out.println(sum);
    }
}