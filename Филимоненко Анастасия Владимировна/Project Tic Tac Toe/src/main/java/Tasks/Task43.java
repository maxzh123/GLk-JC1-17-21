package Tasks;

public class Task43 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println("Выполнение");
            if (str.equals("Проверка")) {
                System.out.println("Проверяем");
            }
        }
        catch (NullPointerException e){
            System.out.println("Словила беженца NullPointerException e");
        }
    }
}
