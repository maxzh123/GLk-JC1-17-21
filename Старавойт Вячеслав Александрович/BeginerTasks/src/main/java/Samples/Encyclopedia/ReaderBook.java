package Samples.Encyclopedia;



import java.io.*;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReaderBook {

    public static void readingFile(InputStream fi) throws FileNotFoundException {
        Pattern p= Pattern.compile("^\\s*((?:[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*|\"[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*\"))\\s+\\(.*");
        Pattern p2= Pattern.compile("\\s*((?:[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*|\"[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*\"))\\s+(\\(.*?(?=$|\\s+((?:[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*|\"[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*\"))\\s+\\())");
       Pattern p3 =Pattern.compile("(\\s)?([А-ЯЁA-Z]+[А-ЯЁA-Z-]+)");//Эм... Это классический пример сердечка на очках!
        StringBuilder sb=new StringBuilder();
        BufferedReader bufferedReader =null;
        WordComparator wc=new WordComparator(Runner.word);
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
                            if (words!=null){
                                String[] simpleWords=words.split("[!:&,.;\\s]+");
                                if (simpleWords!=null){
                                    for(String simpleWord:simpleWords){
                                        if (simpleWord!=null && simpleWord.length()>2){
//                                           if (SimileWords.Simile(Runner.word, simpleWord)){
                                           WordComparator wc2=new WordComparator(simpleWord);
                                           if (wc.compareTo(simpleWord)*wc2.compareTo(Runner.word)>0.5){
                                               WriterWords.writeInFile(matcher2.group(1) +" " + wc+" \n"+matcher2.group(2)+"\n\n\n");
                                               break;
                                           }
                                        }
                                    }
                                }
                            }
// ЗАЧЕМ ИСКАТЬ СЛОВА РЕГУЛЯРКОЙ?!!!!
//                            Matcher matcher3 =p3.matcher(words); // делаем еще одну разбивку по словам если необходимо
//                            while (matcher3.find()){
//                                if (matcher3.group(2).length()>3){
//                                    if (SimileWords.Simile(Runner.word, matcher3.group(2))) { // отправили на проверку
//                                        WriterWords.writeInFile(wc.compareTo(matcher2.group(1))+""+matcher2.group(1)); //+ matcher2.group(2));
//                                    }
//                                }
//                            }
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




