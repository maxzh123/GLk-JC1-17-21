package workbook;


public class Task20 {
    public static void main(String[] args) {
        int [] mas = {10,12,41,51,0,14,1428,44,18,939};
        int maxNumber = 0;
        int maxIndex = 4;

        for (int i = 0; i < mas.length; i++) {
            if(maxNumber <= mas[i]){
                maxNumber = mas[i];
                maxIndex = i;
            }
        }

        System.out.println("index max element: " + maxIndex);
    }
}
