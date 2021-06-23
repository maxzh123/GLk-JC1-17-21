public class Task7 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int r = 2;
        if (diagonalLength1(a, b)/2<=r) {
            System.out.println("можно закрыть");
        }else {
            System.out.println("нельзя");
        }
    }
    static int diagonalLength1 (int a, int b) {
        int d1 = Math.abs((a*a)+(b*b));
        return d1;
    }
}
