public class Task9 {
    public static void main(String[] args) {
//Нам нужно выввести дату следующего дня, те день +1
        int a = 35; //день
        int i = 2; // месяц
        int c = 2021; // год
        if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
            {
                if (a+1<=31) {
                    int day = a+1;
                    int month = i;
                    System.out.println(("day_" + day + "/month_" + month + "/ year "+c));
                } else if (a+1>=31 && i!=12) {
                    int day = (a+1) - 31;
                    int month = i+1;
                    System.out.println(("day_" + day + "/month_" + month+ "/ year "+c));
                } else {
                    int day = (a+1) - 31;
                    int month = 1;
                    System.out.println(("day_" + day + "/month_" + month + "/ year "+c));
                }
            }
            }else if (i == 2) {
            if (a+1<=28) {
                int day = a+1;
                int month = i;
                System.out.println(("day_" + day + "/month_" + month + "/ year "+c));
            }else{
                int day = (a+1) - 28;
                int month = 3;
                System.out.println(("day_" + day + "/month_" + month + "/ year "+c));
                }
            } else {
            if (a+1<=30){
                int day = a+1;
                int month = i;
            System.out.println("day_" + day + "/month_" + month + "/ year 2021");
                } else {
                int day = (a+1) - 30;
                int month = i+1;
                System.out.println("day_" + day + "/month_" + month + "/ year"+c);
            }
        }
    }
}
