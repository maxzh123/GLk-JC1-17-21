package dictionary;

import java.io.*;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DicReader {
    static int num;

    public static void main(String[] args) {
        readDic("part1.txt");
        readDic("part2.txt");
        System.out.println(num);
    }
    public static void readDic(String dic){
        InputStream is = DicReader.class.getClassLoader().getResourceAsStream(dic);
        Pattern p= Pattern.compile("^\\s*((?:[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*|\"[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*\"))\\s+\\(.*");
        Pattern p2= Pattern.compile("\\s*((?:[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*|\"[А-ЯЁA-Z](?:[А-ЯЁA-Z]|\\s+[А-ЯЁA-Z-]+)*\"))\\s+(\\(.*?)");
        BufferedReader r=null;
        StringBuilder sb=new StringBuilder();
        try {
            r=new BufferedReader(new InputStreamReader(is, Charset.forName("windows-1251")));
            String line=null;
            String prevLine=null;
            while( ( line= r.readLine()) != null) {
                Matcher m=p.matcher(line);
                    if (m.matches()) {//
                        if ("".equals(prevLine)){
                            String group=sb.toString();
                            Matcher m2=p2.matcher(group);
                            while (m2.find()){
                                if (m2.group(1).length()>1) {
                                    processArticle(m2.group(1), m2.group(2));
                                }
                            }
                            sb=new StringBuilder();
                        }
                    }
                    sb.append(line);
                    prevLine=line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (r!=null){
                try {
                    r.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        InputStream is = getClass().getClassLoader().getResourceAsStream("file.txt");
    }

    static void processArticle(String name,String body){
        System.out.println(name);
        num++;
    }
}
