package Exception.task43;

public class Task43 {
    static String[] strings = null;

    public static void main(String[] args) {
        doExceptionLengthNull();
        doExceptionEmptyString();
        doSomethingWithObject();
        doExcetionWithClass();
    }

    public static void doExceptionLengthNull() {
        try {
            int length = strings.length;
        } catch (NullPointerException e) {
            System.out.println("пытались найти длину массива " + e);
        }
    }

    public static void doExceptionEmptyString() {
        try {
            String str ="";
            System.out.println(str.equals("привет") + " оказалось делать equals можно c пустой строкой, не путать с null"); // а вот как оказалось так можно делать и все работает

        } catch (NullPointerException e) {
            System.out.println("Делали equals с пустой строкой " + e);
        }
    }

    public static void doSomethingWithObject() {
        try {
            Object obj = null;
            obj.hashCode();
        } catch (NullPointerException e) {
            System.out.println("пытались вызвать метод у объекта null " + e);
        }
    }

    public static void doExcetionWithClass() {
        try {
            Objectnull objectnull = null;
            objectnull.getSample();
        } catch (NullPointerException e) {
            System.out.println("пытались обратиться к объекту класса nul " + e);
        }

    }
}


