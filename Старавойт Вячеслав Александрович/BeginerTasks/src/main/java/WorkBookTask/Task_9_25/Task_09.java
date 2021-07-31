package WorkBookTask.Task_9_25;

import java.util.Random;

public class Task_09 {
    private static int[] days=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
    private static int[] month=new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
    private static int[] years=new int[]{2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022};

    public static void main(String[] args) {
        Random random =new Random();
        int iDay = random.nextInt(days.length);
        int iMonth = random.nextInt(month.length);
        int iYears = random.nextInt(years.length);

        System.out.println("Текущая дата "+days[iDay]+ " /" +month[iMonth]+ " /"+ years[iYears]);
        //Завтра
        if (days[iDay]==29 && month[iMonth]==11){ // 29 и 11 потому как нумерация массива начинается с нуля.
        System.out.println("Завтра "+days[0]+ " /" +month[0]+ " /"+ years[iYears+1]); // берем первый элемент day,month
            if(days[iDay]==29){
                System.out.println("Завтра "+days[0]+ " /" +month[iMonth+1]+ " /"+ years[iYears]);
            }
        }
        else{
            System.out.println("Завтра "+days[iDay+1]+ " /" +month[iMonth]+ " /"+ years[iYears]);
        }

    }
}

