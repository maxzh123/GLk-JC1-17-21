import java.math.BigInteger;
public class task13 {

    public static void main (String [] args) {
        long i=1;
        long summult=1;
        BigInteger bigSumMult= new BigInteger("1");
        do {
            summult = summult * i;
            bigSumMult=bigSumMult.multiply(new BigInteger(String.valueOf(i)));
            i++;
        } while (i<=25);
        System.out.println(summult);
        System.out.println(bigSumMult);
    }
}
