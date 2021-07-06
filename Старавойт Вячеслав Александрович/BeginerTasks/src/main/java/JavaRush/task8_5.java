package JavaRush;

// заменить первые буквы слов  на Заглавные.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class task8_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String result = "";
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = (i == 0 || chars[i - 1] == ' ') ? Character.toUpperCase(chars[i]) : chars[i];
            result += character;
        }
        System.out.println(result);
    }
    }

