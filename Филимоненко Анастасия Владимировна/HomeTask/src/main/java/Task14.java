 public class Task14 {
            public static void main(String[] args) {
                long y = 7893823445l;
                long summ = 0l;
                do {
                    summ = summ + (y%10); //из всех вариантов решения данной задачи, это решение наиболее приемлемое, потому что все остальное не через цикл do while:(
                    y = y / 10;}
                while (y != 0);
                System.out.println(summ);
            }
        }
