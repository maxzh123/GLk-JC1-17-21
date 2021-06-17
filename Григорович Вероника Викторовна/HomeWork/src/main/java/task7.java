import java.util.Scanner;

public class task7 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int rectangleLength = scanner.nextInt();
        int rectangleWidth = scanner.nextInt();
        int circleRadius = scanner.nextInt();
        count(rectangleLength, rectangleWidth, circleRadius);
    }
    private static void count(int rectangleLength, int rectangleWidth, int circleRadius) {
        int sumkvadratov=rectangleLength*rectangleLength+rectangleWidth*rectangleWidth;
        int kvkorenk=(int)((Math.sqrt(sumkvadratov))/2);
        if (circleRadius>kvkorenk) {
            System.out.println("отверстие можно закрыть картонкой");
        }
            else {
            System.out.println("отверстие нельзя закрыть картонкой");
        }
    }
}
