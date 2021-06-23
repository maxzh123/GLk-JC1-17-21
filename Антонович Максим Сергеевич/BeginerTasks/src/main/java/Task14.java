public class Task14 {
    public static void main(String[] args) {
        long y = 7893823445l;
        long summ = 0l;
        do {
            summ=summ+(y%10);
            y=y/10;}
        while (y !=0);
        System.out.println(summ);
        }
    }

