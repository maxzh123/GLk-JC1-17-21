package RegExp;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class RegExp2 {
    public static void main(String[] ar) throws IOException {
        String ss=new String(Files.readAllBytes(Path.of("E:\\Книга1.csv")), Charset.forName("windows-1251"));
        //System.out.println(ss);
        String[] lines=ss.split("[\\r\\n]+");
        int i=0;
        for (String s:lines){
            //System.out.println(i+"\t"+s);
            String[] cols=s.split(";");
            System.out.println(i+"\t"+cols[3]);
            i++;
        }

        if("maxzh@tut.by".matches("[a-zA-Z0-9\\-\\.\\_]+@([a-z0-9\\_\\-]+\\.)+[a-z]{2,5}")){
            System.out.println("Соответсвует");
        }
    }
}
