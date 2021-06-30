public class Task23 {
    public static void main(String[] args) {
        int[][] array1 = new int[5][5];
        for (int i = 0; i < array1.length / 2 + 1; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (j >= array1[i].length - i || j<i) {
                    array1[i][j] = 0;
                } else {
                    array1[i][j] = 1;
                }
            }
        }
        for (int i = array1.length - 1; i >= array1.length / 2 + 1; i--) {
            for (int j = 0; j < array1[i].length; j++) {
                if (j < array1[i].length - i- 1 || j > i) {
                    array1[i][j] = 0;
                } else {
                    array1[i][j] = 1;
                }
          //      System.out.print((i+": "+j+": "+"["+array1[i][j]+"]")); проверял себя, так как без третьего for не работает, так как выводит 4, а потом 3
             }
         //   System.out.println(" ");
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
               System.out.print(array1[i][j]);
              //  System.out.print(i+": "+j+": "+"["+array1[i][j]+"]"); проверил себя, что все верно
            }
            System.out.println(" ");
        }
    }
}
