//Все верно
public class Task43 {
    public static void main(String arg[]) {
        String str = null;
        try {
            if (str.equals("")) {
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("нашёлся NullPointerException e");
        }

    }
}