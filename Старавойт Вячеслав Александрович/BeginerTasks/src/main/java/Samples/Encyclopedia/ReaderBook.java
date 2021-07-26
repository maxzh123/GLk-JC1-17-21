package Samples.Encyclopedia;



import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReaderBook {

    public static void readingFile(File file) throws FileNotFoundException {
        //     Pattern pattern = Pattern.compile("[А-ЯЁ]+[А-ЯЁ]"); //регулярка для слов а именно те слова что нужно найти, слова через дефис не трогаем и двойные слова также, будем их рассматривать по отдельности.
        Pattern patternPro = Pattern.compile("([А-ЯЁ]+[А-ЯЁ])([\\s\\S]+?[\\.]\\s*)([А-ЯЁ]{2,})");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) { // для автоматического закрытия потока или его очистки.
            String result;
            while ((result = bufferedReader.readLine()) != null) {
                Matcher matcher = patternPro.matcher(result);
                while (matcher.find()) {
                    String wordResult = matcher.group(1);
                    if (wordResult.length() > 3) { //для слов длинной более 3 букв, система начисления баллов только для 4 букв)
                        if (SimileWords.Simile(Runner.word, wordResult)) { // отправили проветить или проходит порог похожести слов.
                            String resultArticle = matcher.group(2);
                            WriterWords.writeInFile(wordResult + resultArticle); //запишем результат
                        }
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//       private static boolean searchArticle(String word,File file){
//           Pattern pattern1 =Pattern.compile(word+"([\\s\\S]+?[\\.]\\s)([А-ЯЁ]{2,})");
//           try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file))) { // для автоматического закрытия потока или его очистки.
//               String result1;
//               while ((result1 = bufferedReader1.readLine()) != null){
//                   Matcher matcher1 =pattern1.matcher(result1);
//                   while(matcher1.find()){
//                       String resultArticle =matcher1.group(1);
//                               WriterWords.writeInFile(word+resultArticle); //запишем результат
//                           }
//                       }
//                   }
//            catch (IOException e) {
//               e.printStackTrace();
//           }
//           return true;
//       }
//        }



