public class homework9 {
    public static void main(String[] arg) {
        int day = 28, month = 2, year = 2021;
        System.out.println("today is " + day + "/" + month + "/" + year + "\nnext date");
        if (day + 1 == 32 && month == 12) {
            System.out.println("1/01/" + (year + 1));
        } else if (day + 1 == 32 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            System.out.println("1/" + (month + 1) + "/" + year);
        } else if (day + 1== 31 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("1/" + (month + 1) + "/" + year);
        } else if (day + 1 == 30 && month == 2&&year%4==0) {
            System.out.println("1/" + (month + 1) + "/" + year);
        } else if (day + 1 == 29 && month == 2&&year%4!=0){
            System.out.println("1/" + (month + 1) + "/" + year);
        }
        else {
            System.out.println((day + 1) + "/" + month + "/" + year);
        }

    }
}