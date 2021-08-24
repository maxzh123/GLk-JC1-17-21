package Task12_17_Cucles;

    public class Task17 {
        public static void main(String[] args) {
            String str = "123456789";
            str = str.replaceAll("(.{3})", "$1 ");
            System.out.println(str);
        }
    }

