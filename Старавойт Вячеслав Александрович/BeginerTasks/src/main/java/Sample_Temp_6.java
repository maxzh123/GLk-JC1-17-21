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
        System.out.println("Совпадение букв в словах состовляет в долях: " + Simile("окно", "окна"));
    }




    public static String Simile(String word1, String word2) { // создаем метод который будет принимать два слова, для их дальнейшего сравнения.
        int fact = 0;
        double max = 17.0; // по заданию Максима максимальное совпадение букв в слове '4' и баллов за такое совпадение 1+2+4+10 балов.

        fact += word1.charAt(0) == word2.charAt(0) ? 1 : 0;
        if (fact == 1) {
            fact += word1.charAt(1) == word2.charAt(1) ? 2 : 0;
            if (fact == 3) {
                fact += word1.charAt(2) == word2.charAt(2) ? 4 : 0;
                if (fact == 7) {
                    fact += word1.charAt(3) == word2.charAt(3) ? 10 : 0;
                }
            }
        }
            return Decimal((fact/max)); // сделаем метод который будет округлять наш результат.

    }
    public static String Decimal (double result) {
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        String decimalResult = decimalFormat.format(result);
    return decimalResult;
    }

}
