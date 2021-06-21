//Создайте метод с одним целочисленным параметром,
// метод должен определить является ли последняя цифра числа семёркой
// и вернуться boolean значение
public class homework6 {
    public static void main(String[] arg) {
        int t = -1237;
        System.out.println(lastNumeral(t));
    }
    static boolean lastNumeral(int t) {
        int a = t % 10;
        if (a == 7||a==-7)
        {return true;
        } else {
            return false;
        }
    }
}



