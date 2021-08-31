package examTasks.task1;

public class Numbers {
    private int x;
    private int y;
    private int z;

    public void setX() {
        this.x = (int)(Math.random()*100+1);
    }

    public void setY() {
        this.y = (int)(Math.random()*100+1);
    }

    public void setZ() {
        this.z = (int)(Math.random()*100+1);
    }

    int arithmeticMean(int x, int y, int z) {
        return (x+y+z)/3;
    }

    int sumOrNumber(int x, int y, int z) {
        if(x>z) {
            return x+y;
        } else return z;
    }

    @Override
    public String toString() {
        return "x= "+x+", y= "+y+", z= "+z+"\n"+
                "среднее арифметическое чисел= "+arithmeticMean(x,y,z)+"\n"+
                "сумма чисел x+y или число z в зависимости от условия= "+sumOrNumber(x,y,z);

    }

}
