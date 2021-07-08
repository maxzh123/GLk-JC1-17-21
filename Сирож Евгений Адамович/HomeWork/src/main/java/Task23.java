//import static java.lang.System.out;

public class Task23 {

    public static void main(String[] args) {
        int[][] m = new int[19][19];
        int i, j;


        for (i = 0; i < m.length / 2 ; i++) {
            for (j = 0; j < m[i].length; j++) {
                if ((j < i) || (j >= (m[i].length - i))){
                    m[i][j] = 0;}
                else{
                    m[i][j] = 1;}

            }

        }
        for (i = m.length - 1; i >= m.length / 2; i--) {
            for (j = 0; j < m[i].length; j++) {
                if ((j < (m[i].length - 1 - i)) || (j > i)){
                    m[i][j] = 0;}
                else{
                    m[i][j] = 1;}
            }
        }
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println(" ");
        }
    }


}
