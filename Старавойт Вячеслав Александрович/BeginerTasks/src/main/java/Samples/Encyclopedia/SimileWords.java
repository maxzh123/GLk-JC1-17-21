package Samples.Encyclopedia;

import java.text.DecimalFormat;

public class SimileWords {
    private static double max=0;
    private static int fact=0;
    private static int length=0;
    private static double result=0;


    public static boolean Simile(String word1, String word2) { // создаем метод который будет принимать два слова, для их дальнейшего сравнения.
        if (word1.length()<=word2.length()){
            determinationMax(word1.length());   // супер метод который поможет узнать максимальное количество баллов за совпадение
        }
        else{
            determinationMax(word2.length());
        }
        addOnePoints(word1,word2); //начисляем 1 балл или сколько там укажем в  ConfigScoring)
        addFourPoints(word1,word2); // начисляем 4 балла
        addEightPoints(word1,word2); // и т.д.
        addTenPoints(word1,word2);
        simileFactAndMax();
        length=0;
        fact=0;
        return (result>=ConfigScoring.THRESHOLD_VALUE); // проверяем результат на порог вхождения
    }

    private static double determinationMax(int length) {
        if (length > 3) {
            max = length *ConfigScoring.ONE_COMPLIANCE + (length - 1) * ConfigScoring.TWO_COMPLIANCE + (length - 2) * ConfigScoring.THREE_COMPLIANCE + (length - 3) * ConfigScoring.FOUR_COMPLIANCE;
            max *= 2; // баллы увеличиваем в 2 раза, так как слова будем менять местами 1-ое со 2-ым
        } else {
            System.out.println("Если что, Братец две буквы для проверки слова мало)");
        }
        return max;
    }


    private static int addOnePoints(String word1, String word2) {
        for (int i = 0; i < word1.length(); i++) {
            int count = 0;
            while (count < word2.length()) {
                fact += word1.charAt(i) == word2.charAt(count) ? ConfigScoring.ONE_COMPLIANCE  : 0; //начисляем по одному баллу
                fact += word2.charAt(count) == word1.charAt(i) ? ConfigScoring.ONE_COMPLIANCE : 0; // по заданию слова тоже меняем местами
                count += 1;
            }
        }
        return fact;
    }

    private static int addFourPoints(String word1, String word2) {
        for (int i = 0; i < word1.length()-1; i++) {
            int count = 0;
            while (count < word2.length()-1) {
                fact += word1.charAt(i) + word1.charAt(i + 1) == word2.charAt(count) + word2.charAt(count + 1) ? ConfigScoring.TWO_COMPLIANCE : 0;
                fact += word2.charAt(count) + word2.charAt(count + 1) == word1.charAt(i) + word1.charAt(i + 1) ? ConfigScoring.TWO_COMPLIANCE : 0;
                count += 1;
            }
        }
        return fact;
    }

    private static int addEightPoints(String word1, String word2) {
        for (int i = 0; i <word1.length()-2; i++) {
            int count = 0;
            while (count < word2.length()-2) {
                fact += word1.charAt(i) + word1.charAt(i + 1) + word1.charAt(i + 2) == word2.charAt(count) + word2.charAt(count + 1) + word2.charAt(count + 2) ? ConfigScoring.THREE_COMPLIANCE : 0;
                fact += word2.charAt(count) + word2.charAt(count + 1) + word2.charAt(count + 2) == word1.charAt(i) + word1.charAt(i + 1) + word1.charAt(i + 2) ? ConfigScoring.THREE_COMPLIANCE : 0;
                count += 1;
            }
        }
        return fact;
    }

    private static int addTenPoints(String word1, String word2) {
        for (int i = 0; i < word1.length()-3; i++) {
            int count = 0;
            while (count <word2.length()-3) {
                fact += word1.charAt(i) + word1.charAt(i + 1) + word1.charAt(i + 2) + word1.charAt(i + 3) == word2.charAt(count) + word2.charAt(count + 1) + word2.charAt(count + 2) + word2.charAt(count + 3) ? ConfigScoring.FOUR_COMPLIANCE : 0;
                fact += word2.charAt(count) + word2.charAt(count + 1) + word2.charAt(count + 2) + word2.charAt(count + 3) == word1.charAt(i) + word1.charAt(i+ 1) + word1.charAt(i + 2) + word1.charAt(i + 3) ? ConfigScoring.FOUR_COMPLIANCE : 0;
                count += 1;
            }
        }
        return fact;
    }

    private static void simileFactAndMax(){
        result=0;
        result = fact/max;
    }

//    private int simileLengthWords(String word1,String word2){
//        length = word1.length(); //узнаем длинну слова-двоечника.
//        int length2 =word2.length();
//        if (length2 < length) {
//return
//        }
//    }

//    public static String Decimal (double result) {
//        DecimalFormat decimalFormat = new DecimalFormat("#.####");
//        String decimalResult = decimalFormat.format(result);
//        return decimalResult;
//    }
}

