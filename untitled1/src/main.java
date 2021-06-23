
public class main {
    public static void main (String [] args){

        //variable
        int [] row = new int [12];

        for(int i= 0; i < 12; i++){
            row [i] = (int)(Math.random() * 12);
        }



        System.out.println(row);
    }
}

