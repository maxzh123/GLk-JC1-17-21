public class Task23 {
    public static void main(String[] args) {
        int[][] array1 = new int[5][5];
        for (int i = 0; i < array1.length/2+1; i++) {
            for (int j = 0; j < array1[i].length/2+1; j++) {
                if (i == j || j > i) {
                    array1[i][j] = 1;
                } else {
                    array1[i][j] = 0;
                }
                System.out.print(array1[i][j] + " ");

            }
            System.out.println();
        }
        for (int i = array1.length/2+2; i < array1.length; i++) {
            for (int j = array1.length/2+2; j < array1[i].length; j++) {
                if (i == j || j > i) {
                    array1[i][j] = 1;
                } else {
                    array1[i][j] = 0;
                }
                System.out.print(array1[i][j] + " ");

            }
            System.out.println();
        }
//        for (int i = 0; i < array1.length/2+1; i++) {
//            for (int j = 0; j < array1[i].length; j++) {
//                System.out.print(array1[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
