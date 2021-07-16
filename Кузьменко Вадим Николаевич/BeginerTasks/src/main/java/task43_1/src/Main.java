public class Main {
    public static void main(String[] args) {
        String i = null;
        try {
            System.out.println(i.length());
        } catch (NullPointerException e) {
            System.out.println( "Есть нюансы, задай хоть какое-то значение стринговой строки");
        }
        System.out.println("Не балуйся");
    }
}
//