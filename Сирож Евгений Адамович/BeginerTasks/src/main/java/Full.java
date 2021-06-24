public class Full {
    private static int count = 0;

    public static void main(String[] arg) {
//     for(int i=0;i<10E10;i++)
        int numb[]=new int[10];
        numb= new int[]{5, 8, 3, 4, 5, 6, 7, 1, 9};
        int bubbleSort[] = bubbleSort(numb);
        for(int i=0;i<bubbleSort.length;i++){
            System.out.println(bubbleSort[i]);
        }
    }

    public static int[] bubbleSort(int[] arr) {//сортирует числа по возврастанию,и ставит повторки рядом
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }

            }
        }
        return  arr;

    }
}