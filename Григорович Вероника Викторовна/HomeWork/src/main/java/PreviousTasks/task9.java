package PreviousTasks;

public class task9 {

    /* Вам пора попробовать освоить String.format()
    И попробуйте переписать на массив, в котором храните количество дней для каждого месяца.
    И поскольку у вас хорошо получается, поступим в духе капитализма- доп задание:
    сделайте возможность передавать год и вычисление високосный он или нет
    * */
    public static void main(String[] args) {

        int day=31;
        int month=12;
        int year=2021;
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10) {
            if (day>=1 && day<=30) {
                System.out.println(++day +"/"+month+"/"+year);
            } else if (day==31) {
                System.out.println(1 +"/"+ ++month+"/"+year);
            }
        } else if (month==2) {
            if (day>=1 && day<=27) {
                System.out.println(++day +"/"+month+"/"+year);
            } else if (day==28) {
                System.out.println(1 +"/"+ ++month+"/"+year);
            }
        } else if (month==4 || month==6 || month==9 || month==11) {
            if (day>=1 && day<=29) {
                System.out.println(++day +"/"+month+"/"+year);
            } else if (day==30) {
                System.out.println(1 +"/"+ ++month+"/"+year);
            }
        } else if (month==12) {
            if (day>=1 && day<=30) {
                System.out.println(++day +"/"+month+"/"+year);
            } else if (day==31) {
                System.out.println(1 +"/"+ 1+"/"+ ++year);
            }
        }
    }
}
