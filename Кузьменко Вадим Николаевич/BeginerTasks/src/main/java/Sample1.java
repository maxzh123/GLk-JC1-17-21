public class Sample1 {
    public static void main(String[] args) {

        int j;
        for (int i = 0; i <= 8; i++) {
            for ( j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.print(String.format("%"+((10 - j)*2 != 0 ? (10 - j)*2 : "")+"s", ""));

            for ( j = i + 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();

        }
        for (int i = 8; i >= 1; i--) {
            for ( j = 1; j <= i ; j++) {
                System.out.print(j);
            }

            System.out.print(String.format("%"+((10 - j)*2 != 0 ? (10 - j)*2 : "")+"s", ""));

            for ( j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();

        }

    }
}
