package Tasks;

public class Task23 {
    public static void main(String[] args) {
        int[][] array = new int[7][7];
        int count = 0;
        for (int i = 0; i < array.length/2+1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j < i) || (j >= array[i].length - i)) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1; }
            }
        }
        for (int i=array.length-1; i>=array .length/2+1; i--){
            for (int j=0; j<array[i].length; j++){
                if ((j<(array[i].length-1-i)) || (j>i))
                    array[i][j]=0;
                else
                    array[i][j]=1;}
        }
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
