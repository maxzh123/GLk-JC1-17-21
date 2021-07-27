package Samples.Encyclopedia;



import java.io.*;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReaderBook {

    public static void readingFile(File file) throws FileNotFoundException {
        Pattern p= Pattern.compile("^\\s*((?:[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*|\"[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*\"))\\s+\\(.*");
        Pattern p2= Pattern.compile("\\s*((?:[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*|\"[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*\"))\\s+(\\(.*?(?=$|\\s+((?:[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*|\"[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*\"))\\s+\\())");
       Pattern p3 =Pattern.compile("(\\s)?([А-ЯЁA-Z]+[А-ЯЁA-Z-]+)");
       FileInputStream fi = new FileInputStream(file);
        StringBuilder sb=new StringBuilder();
        BufferedReader bufferedReader =null;
        try  {
            bufferedReader= new BufferedReader(new InputStreamReader(fi,"windows-1251"));
           String result= null;
            String prevResult =null;
            while ((result = bufferedReader.readLine()) != null) {
                Matcher matcher = p.matcher(result);
                if (matcher.matches()) {
                    if ("".equals(prevResult)) {
                        String group12 = sb.toString();
                        Matcher matcher2 = p2.matcher(group12);
                        while (matcher2.find()) {
                            String words = matcher2.group(1);
                            Matcher matcher3 =p3.matcher(words); // делаем еще одну разбивку по словам если необходимо
                            while (matcher3.find()){
                                if (matcher3.group(2).length()>3){
                                    if (SimileWords.Simile(Runner.word, matcher3.group(2))) { // отправили на проверку
                                        WriterWords.writeInFile(matcher2.group(1)); //+ matcher2.group(2));
                                    }
                                }
                            }
                        }
                        sb = new StringBuilder();
                    }
                }
                sb.append(result);
                prevResult = result;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                fi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}




