package Exam;

public class Task1 {
    private final int x;
    private final int y;
    private final int z;

    public Task1(int x,int y,int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }

    public static void main(String[] Args){
        Task1 xyz=new Task1((int)((Math.random()*(60+1))-30),(int)((Math.random()*(60+1))-30),(int)((Math.random()*(60+1))-30));

        System.out.println("Сгенерированные произвольные числа [-30:30]: X="+xyz.getX()+", Y="+xyz.getY()+", Z="+xyz.getZ());

        if (xyz.getX()>xyz.getZ()){
            System.out.println("Выполнено условие X>Z, вывод суммы X+Y="+(xyz.getX()+xyz.getY()));}
        else{
            System.out.println("Условие Х>Z не выполнено,среднее арифметическое чисел X,Y,Z= "+((xyz.getX()+xyz.getY()+xyz.getZ())/3));}
    }
}







