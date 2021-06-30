package PreviousTasks;

public class task6 {
    public static void main (String [] args) {
        int x=13457;
        System.out.println(lastDigitOfTheNumber(x));
    }
    public static boolean lastDigitOfTheNumber (int i){
        return i%10==7;
    }
}
