public class Task13 {
    public static void main(String[] args) {
        int i =1;
        long pr = 1l;
        do {
            pr = pr+(pr*i);
            i++; }
        while (i<25);
        System.out.println(pr);
    }
}
