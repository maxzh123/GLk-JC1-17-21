public class Sample5v2 {
    private static int [] days= new int[] {0,31,28,31,30,31,30,31,31,30,31,30,31};
        public static void main (String[] args){
        for (int i=1; i<=12; i++){
            processNumber(i);
        }
    }
    private static void processNumber(int month){
            System.out.println("-----------------==="+do2dig(month)+"===-------------------");
            processMonth(month);
    }
    private static String do2dig(int dig) {
                if (dig>=0 && dig<10 ){
            return "0++"+dig;
        }else if(dig>9){
            return String.valueOf(dig);
                    }else {
            return "Ошибка";
        }
    }
    private static void processMonth(int dig){
        for (int d=1;d<=days[dig];d++){
            System.out.println(do2dig(d)+"/"+do2dig(dig)+"/2021");
        }
    }
    }
