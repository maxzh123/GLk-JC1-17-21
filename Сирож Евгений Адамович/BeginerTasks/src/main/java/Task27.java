import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {

    public static void main(String arg[]) {
        String str = "Школьный учитель Дэн Форестер оказывается в команде рекрутов," +
                " отправляющихся в 2051 год на подмогу человечеству будущего," +
                " проигрывающему войну с инопланетными захватчиками." +
                " Он и остальные новобранцы из прошлого" +
                " — единственная надежда заметно поредевшего населения Земли," +
                " на спасение от порабощения пришельцами.";

        int n = 0;

        Pattern pattern=Pattern.compile("[\\s\\S]?[а-яА-ЯЁ-ё\\-]+[\\s\\S]?");

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            n++;
        }
        System.out.println(str);
        System.out.println("Количество слов в строке - " + n);


    }


}
