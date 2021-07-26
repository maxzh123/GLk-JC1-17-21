package Samples.Encyclopedia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;


public class WordInput {
    protected final static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

    static String readerWordInput() {
        String wordInput = null;
        try {
            System.out.println("Введи слово которое необходимо проверить, двоечник):");
            wordInput = br.readLine().toUpperCase(Locale.ROOT); //для хранение в верхнем регистре.
            br.close();
        } catch (IOException e) {
            System.err.println("Товарищ введи буквы");
            e.printStackTrace();
        }
        return wordInput;
    }

}
