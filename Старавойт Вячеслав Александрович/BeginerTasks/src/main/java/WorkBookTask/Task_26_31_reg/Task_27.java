package WorkBookTask.Task_26_31_reg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_27 {

    public static int count =0;

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        // String sc = scanner.nextLine();
        //Для наглядности чтобы быть уверенным что считает вставил текст.
        String simples ="Сочинение, пожалуй, одна из самых сложных письменных работ в школе.Ведь при ии её  еу  подготовке школьнику необходимо показать-творческие и интелле_ктуальные  способности. ";
        Pattern pattern = Pattern.compile("[а-яЁёА-Я0-9\\-\\_]+[а-яА-ЯЁё0-9]+");
        //словами  считал все что состоит из двух букв, так слово через дефис, или подчеркивание считал одним словом
        Matcher matcher = pattern.matcher(simples);
        while (matcher.find()){
            count++;
        }
        System.out.println("Количество слов :" +count);
        ;
    }
}

