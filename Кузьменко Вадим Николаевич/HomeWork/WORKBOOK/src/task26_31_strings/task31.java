package task26_31_strings;

public class task31 {
    public static String sum; // сумма строк
    public static int count =0; // счётчик
    public static String simples ="qwerty"; // начальная страка

    public static void main(String[] args) {
        TimeStringBuilder(); // 2 вариант сложения
        TimeSumString(); // 1 вариант сложения
    }
    public static void SumString() {
        count=0;
        while (count < 200000) { // если счёткик меньше то доваляем строку к сумме строк и плюсуем в счётчик
            sum += simples;
            count++;
        }
    }
    public static void TimeSumString() {
        long startTime = System.currentTimeMillis(); // метод возвращает время с начала операции
        SumString();
        long endTime = System.currentTimeMillis();
        System.out.println("Время операции с обычным сложением: " + (endTime - startTime)  + " ms");
    }


    public static void SumStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        count = 0;
        while (count < 200000) {
            stringBuilder.append(simples);
            count++;
        }
    }


    public static void  TimeStringBuilder(){
        long startTime = System.currentTimeMillis();
        SumStringBuilder();
        long endTime = System.currentTimeMillis();
        System.out.println("Время операции со StringBuilder: " + (endTime-startTime) + " ms");
    }
}
