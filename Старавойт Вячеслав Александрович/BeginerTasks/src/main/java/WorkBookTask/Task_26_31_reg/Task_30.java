package WorkBookTask.Task_26_31_reg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_30 {
    public static int count =0;

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        // String sc = scanner.nextLine();
        //Для наглядности чтобы быть уверенным что считает вставил текст.
        String simples ="Сочинение, пожалуй, одна из самых сложных письменных<p id=\"p1\">\n" +
                "<p id=\"p5\"> работ в школе.Ведь при ии её  еу  подготовке школьнику <p id=\"p8\">\n" +
                "<p id=\"p7\">необходимо показать-творческие и интелле_ктуальные  способности. ";
        Pattern pattern = Pattern.compile("<p\\s+id=\\\"p\\d\\\"+>");
        Matcher matcher = pattern.matcher(simples);
        System.out.println(simples.replaceAll("<p\\s+id=\\\"p\\d\\\"+>","<p>"));
        while (matcher.find()){
            count++;
        }
        System.out.println("Количество нашедших замен :" +count);
        ;
    }
}
