public class homework5 {
    public static void main(String []arg){
        int t=1904462;      //секунды
        int sec=t%60;       //секунды не вошедшие в минуты

        int t1=(t-sec)/60;    //количество минут без не вошедших секунд
        int min=t1%60;        //минуты не вошедшие в часы

        int t2=(t1-min)/60;    //количество часов без не вошедших минут
        int hour=t2%24;        //часы не вошедшие в сутки

        int s=t2/24;          // количество суток
        int sutki=s%7;       //сутки не вошедшие в неделю

        int ned=(s-sutki)/7;      //количество недель без не вошедших суток

        System.out.println("сек="+t+"\nколичество недель="+ned+"\nколичество суток="+sutki);
                  System.out.println("количество часов="+hour+"\nколичество минут="+min);
                  System.out.println("количество секунд="+sec);
    }


}
