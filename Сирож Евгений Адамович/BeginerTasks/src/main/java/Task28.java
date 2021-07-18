import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {


    public static void main(String arg[]) {
        String str = "Школьный учитель Дэн Форестер оказывается в команде рекрутов," +
                " отправляющихся в 2051 год на подмогу человечеству будущего," +
                " проигрывающему войну с инопланетными захватчиками." +
                " Он и остальные новобранцы из прошлого" +
                " — единственная надежда заметно поредевшего населения Земли," +
                " на спасение от порабощения пришельцами.";



        Pattern pattern = Pattern.compile("[а-яА-ЯЁ\\-]+");

        Matcher matcher = pattern.matcher(str);

        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            buffer.append(str.charAt(matcher.end() - 1));
        }
        System.out.println(buffer);


    }


}







