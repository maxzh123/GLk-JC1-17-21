//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.util.Scanner;
public class homework30 {
    public static void main(String[] args) {
        System.out.print("Введите исследуемый текст тута>>>>");
        //Scanner scanner = new Scanner(System.in);
        //String text = scanner.nextLine();
        String text= "<pid=\"p1\">В одних садах цветёт миндаль, в других метёт метель.<pid=\"p1\">\n" +
                "   <pid=\"p1\">В одних краях ещё февраль, в других - уже апрель.<pid=\"p1\">\n" +
                "   <pid=\"p1\">Проходит время, вечный счёт: год за год, век за век...<pid=\"p1\">\n" +
                "   <pid=\"p1\">Во всём - его неспешный ход, его кромешный бег.<pid=\"p1\">\n" +
                "   <pid=\"p1\">В году на радость и печаль по двадцать пять недель.<pid=\"p1\">\n" +
                "   <pid=\"p1\">Мне двадцать пять недель февраль, и двадцать пять - апрель.<pid=\"p1\">\n" +
                "   <pid=\"p1\">По двадцать пять недель в туман уходит счёт векам.<pid=\"p1\">\n" +
                "   <pid=\"p1\">Летит мой звонкий балаган куда-то к облакам.<pid=\"p1\">\n" +
                "   <pid=\"p1\"><i>М. Щербаков</i><pid=\"p1\">";
        System.out.println(text.replaceAll("<pid=\"p1\">","<p>"));
       }
}



