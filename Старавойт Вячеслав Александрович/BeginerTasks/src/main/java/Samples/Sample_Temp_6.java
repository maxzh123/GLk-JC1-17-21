package Samples;

import java.text.DecimalFormat;
/* Задание из телеги дополнительное.
Если вам это кажется простым - напишите функционал, для нечеткого сравнения строк.  Алгоритм работы.
 ищете части первой строки во второй. сперва части по 1 букве, потом части по 2-буквы, потом по 3 и
  потом по 4 за каждое однобуквенное вхождение 1 балл, за двухбуквенное 2 за 3-х буквенное 4,
   за четырех буквенное 10 результат выразить в долях от единицы.
т.е посчитать максимально возможное и реальное. и поделить.
 */
public class Sample_Temp_6 {

    public static void main(String[] args) {
        System.out.println("Совпадение букв в словах состовляет в долях: " + Simile("окна", "окна"));
    }

    public static String Simile(String word1, String word2) { // создаем метод который будет принимать два слова, для их дальнейшего сравнения.
        int fact = 0;
        double max = 28;// по заданию Максима максимальное совпадение букв в слове '4'
//TODO мне кажется здесь остро нехвататет цикла. потому как похожесть слов окна и окно должна быть процентов 80% но никак не 41.
        //и цикл видимо нужен стобы перебирать все вложенные цепочки, а не только первую. т.е.:
        // искать о, потом к.. н о, потом ок..  кн... но.. потом окн и кно.
        for (int i =0;i <=3; i++) {
            int count =0;
            do {
                fact += word1.charAt(i) == word2.charAt(count) ? 1 : 0;
                count += 1;
            }
            while ( count < 4);// проверяем до тех пора не пройдемся по всем буквам второго слова.
            count=0;
        }
        for (int i =0;i <=2; i++) { // для сравнение 2-ух букв.
            int count =0;
            do {
                fact += word1.charAt(i) + word1.charAt(i+1) == word2.charAt(count) + word2.charAt(count + 1) ? 2 : 0;
                count += 1; }
            while (count < 3);
            count =0;
        }
        for (int i =0;i <=1; i++) { //для сравнения 3-ух букв
            int count =0;
            do {
                fact += word1.charAt(i) + word1.charAt(i+1)+ word1.charAt(i+2) == word2.charAt(count) + word2.charAt(count + 1)+word2.charAt(count + 2) ? 4 : 0;
                count += 1; }
            while (count <2);
            count =0;
        }
             //для сравнения 4-ух букв можно без цикла, потому как слово состоит из 4 букв.
            int count =0;
            int k = 0;
              fact += word1.charAt(k) + word1.charAt(k+1)+ word1.charAt(k+2) +word1.charAt(k+3)  == word2.charAt(count) + word2.charAt(count + 1)+word2.charAt(count + 2) + word2.charAt(count + 3)? 10 : 0;

            return Decimal((fact/max)); // сделаем метод который будет округлять наш результат.

    }
    public static String Decimal (double result) {
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        String decimalResult = decimalFormat.format(result);
    return decimalResult;
    }
}
