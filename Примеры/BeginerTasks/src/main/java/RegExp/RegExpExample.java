package RegExp;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpExample {
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://cars.av.by/mazda/premacy"))
                .GET() // GET is default
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        ///System.out.println(response.body());
        String text=response.body();
        Pattern pattern = Pattern.compile("<div\\s+class=\"listing-item__wrap\">([\\s\\S]+?<div\\s+class=\"listing-item__controls\">)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            processRecodr2(text.substring(matcher.start(), matcher.end()));
        }
    }
    static void processRecodr2(String rec){
        rec=rec.replaceAll("<(\\/)?[a-zA-Z]+[^>]*>","");
        System.out.println(rec);
    }
    static void processRecodr(String rec){
//        System.out.println(rec);
        Pattern pattern = Pattern.compile("<img\\s[^>]*?data\\-src=\"([^\"]+)\"[^>]*>",Pattern.CASE_INSENSITIVE+Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(rec);
        while (matcher.find()) {
            System.out.print(matcher.group(1));//rec.substring(matcher.start(), matcher.end())
        }
        System.out.print("\t");
        pattern = Pattern.compile("<a\\s+class=\"listing-item__link\"[^>]*?href=\"([^\"]+)\"[^>]*>");
        matcher = pattern.matcher(rec);
        while (matcher.find()) {
            System.out.print(matcher.group(1));//rec.substring(matcher.start(), matcher.end())
        }
        System.out.print("\t");
        pattern = Pattern.compile("<div\\s+[^>]*class=\"listing-item__priceusd\"[^>]*>([^<>]+)<\\/div>");
        matcher = pattern.matcher(rec);
        while (matcher.find()) {
            System.out.print(matcher.group(1));//rec.substring(matcher.start(), matcher.end())
            //System.out.print(rec.substring(matcher.start(), matcher.end()));//rec.substring(matcher.start(), matcher.end())
        }
        System.out.println();
    }

}
