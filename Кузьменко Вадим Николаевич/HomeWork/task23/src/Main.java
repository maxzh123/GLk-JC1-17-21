public class Main {
        public static void main(String[] args) {
            int array[][] = new int[50][50];
            sortTop(array);
            sortBot(array);
            printArray(array);
        }
        public static void sortTop(int array[][]) {
            for (int i = 0; i < array.length / 2 + 1; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (j < i || j > array[i].length - i - 1) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = 9;
                    }
                }
            }
        }
        public static void sortBot(int array[][]) {
            for (int i = array.length - 1; i >= array.length / 2 + 1; i--) {
                for (int j = 0; j < array[i].length; j++) {
                    if (j > i || j < array[i].length - 1 - i) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = 9;
                    }
                }
            }
        }
        public static void printArray(int array[][]) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }
        }
    }

