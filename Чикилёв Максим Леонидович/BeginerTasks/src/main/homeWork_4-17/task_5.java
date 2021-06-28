public class task_5 {
    public static void main(String[] args) {
        int sec = 576690;
        int min = sec / 60;
        int h = min / 24;
        int day = h / 24;
        int weeks = day / 7;
        System.out.println("секунд:" + sec + " минут:" + min + " часов:" + h + " дней:" + day + " недель:" + weeks);
    }
}
