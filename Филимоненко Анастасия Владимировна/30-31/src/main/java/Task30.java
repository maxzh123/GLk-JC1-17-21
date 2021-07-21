import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    public static int count =0;

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String simples ="Что-то недоброе таится в мужчинах, избегающих вина, игр, общества прелестных женщин, застольной беседы.<p id=\"p1\">\n" +
                "<p id=\"p5\"> Такие люди или тяжело больны, или втайне ненавидят окружающих. <p id=\"p8\">\n" +
                "<p id=\"p7\">Правда, возможны исключения. ";
        Pattern pattern = Pattern.compile("<p\\s+id=\\\"p\\d\\\"+>");
        Matcher matcher = pattern.matcher(simples);
        System.out.println(simples.replaceAll("<p\\s+id=\\\"p\\d\\\"+>","<p>"));
        while (matcher.find()){
            count++;
        }
        System.out.println("Замен на простые теги :" +count);
    }
}
