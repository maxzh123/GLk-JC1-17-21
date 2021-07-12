package WorkBookTask.Task_43_45_Throwable;

public class Task_43 {

    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println("Выполнение перед ошибкой");
            if (str.equals("Проверка")) {
                System.out.println("проверка на ошибки");
            }
        }
        catch (NullPointerException e){
            System.out.println("Выскочила ошибка NullPointerException e");
            }
        }
    }

