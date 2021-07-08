public class task28 {
    public static void main(String[] args) {
        String str = "гуру хумельс гудит самара нал";
        StringBuilder res = new StringBuilder();

        String [] words = str.split ("\\s+");
        for ( String word : words)
        res.append(word.toCharArray()[word.length() - 1]);

        System.out.println( "Результат: " + res.toString());
    }
}
