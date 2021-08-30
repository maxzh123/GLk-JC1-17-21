package Task12_17_Cucles;

public class Task14 {
    public static void main(String[] args) {
        int i = 789382344;
        double sum = 0;
        do {sum += (i % 10);
            i/=10;}
        while(i != 0); {

        }
        System.out.println(sum);
    }
}
