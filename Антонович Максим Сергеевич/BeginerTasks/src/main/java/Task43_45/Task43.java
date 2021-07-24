package Task43_45;

public class Task43 {
    public static void main(String[] args) {
        String name= null;
        try {
            int wordLength = name.length();
        } catch (NullPointerException e) {
            System.out.println("ВЫ пытаетесь запустить метод length в null, так нельзя");
        }
    }
}
