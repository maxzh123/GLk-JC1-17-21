package WorkBookTask.Task_9_25;

public class Task_10 {
    public static void main(String[] args) {
        int a=20; // сторона первого дома
        int b=10; // вторая сторона первого дома
        int c= 15;
        int d=25;
        //участок
        int e=50;
        int f =30; //cтороны участка.
        if ((a*b)+(c*d) > (e*f)){ // проверка на площадь можно и не делать а запихнуть в else, для быстроты проверки решил запилить
            System.out.println("Дома №1 и дом №2 не поместяться на данном участке.");
        }
        else if ((b+d<=f && a+c<=e) || (b+c<=f && a+d<=e) || (b+d<=e && a+c<=f)|| (b+c<=e && a+d<=f)) { // для проверки всех сторон попарно.
                 System.out.println("Дома №1 и дом №2  поместяться на данном участке.");
             }
         else {
        System.out.println("Дома №1 и дом №2 не поместяться на данном участке.");
        }
    }
}
