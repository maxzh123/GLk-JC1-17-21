package ExamQuest1;

public class ExamQuest1 {
    public static int firstnumber(){
        return (int) (Math.random() * 100) + 1;
    }
    public static int secondnumber(){
        return (int) (Math.random() * 100) + 1;
    }
    public static int thirdnumber() {
        return (int) (Math.random() * 100) + 1;
    }
    public static void main(String[] args) {
        int x= firstnumber();
        int y= secondnumber();
        int z= thirdnumber();
        System.out.println("Циферки: "+"x= "+x+" y= "+y+" z= "+z);
        if (x>z){
            System.out.println("X больше Z. Сумма х+y= "+(x+y));
        }else {
            System.out.println("X меньше Z. Z= "+z);
        }
        System.out.println("Среднее арифметическое значение X,Y,Z= "+ ((x+y+z)/3));
    }
}
