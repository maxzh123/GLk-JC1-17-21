package Game;

public class Model{
    public final int CELLS=3;
    private final Amount[][] field=new Amount[CELLS][CELLS];
    private final Win win=null;
    private final int winNum=-1;

    public Model() {
        newGame();
    }
    public void newGame(){
        for(int i=0;i< field.length;i++){
            for(int j=0;j< field[i].length;j++){
                field[i][j]=Amount.Пусто;
            }
        }
    }

    public boolean hasEmptyFields(){
        for(int i=0;i< field.length;i++){
            for(int j=0;j< field[i].length;j++){
                if (field[i][j]==Amount.Пусто){return true;}
            }
        }
        return false;
    }

    public Amount getWinner(){
        Win win=null;
        int winNum=-1;
        for(int i=0;i< CELLS;i++){
            //Проверка строк
            boolean flag=Amount.Пусто!=field[i][0];
            for(int j=0;flag && j<CELLS;j++){
                flag=flag && field[i][0]==field[i][j];
            }
            if (flag){
                winNum=i;
                win=Win.Строка;
                return field[i][0];
            }
            //Проверка столбцов
            flag=Amount.Пусто!=field[0][i];
            for(int j=0;flag && j<CELLS;j++){
                flag=flag && field[0][i]==field[j][i];
            }
            if (flag){
                winNum=i;
                win=Win.Столбец;
                return field[i][0];
            }
        }
        //Проверка первой диагонали
        boolean flag=Amount.Пусто!=field[0][0];
        for(int i=0;flag && i<CELLS;i++){
            flag=flag && field[0][0]==field[i][i];
        }
        if (flag){
            win=Win.ГлавнаяДиагональ;
            return field[0][0];
        }
        //Проверка второй диагонали
        flag=Amount.Пусто!=field[0][CELLS-1];
        for(int i=0;flag && i<CELLS;i++){
            flag=flag && field[0][CELLS-1]==field[i][CELLS-1-i];
        }
        if (flag){
            win=Win.ВторичнаяДиагональ;
            return field[0][CELLS-1];
        }
        //Если мы сюда дошли - победителя нет.
        return Amount.Пусто;
    }

    //Не возвращаем массив модели, а делаем копию, чтобы его никто не мог изменить снаружи.
    public Amount[][] getField() {
        Amount[][] ret=new Amount[3][3];
        for(int i=0;i< field.length;i++){
            for(int j=0;j< field[i].length;j++){
                ret[i][j]=field[i][j];
            }
        }
        return ret;
    }
    public Win getWin() {
        return win;
    }

    public int getWinNum() {
        return winNum;
    }


    public void doStep(int i, int j, Amount x) throws Exception {
        if (field[i][j]!=Amount.Пусто) {throw new Exception("Тут вже занято!");}
        if (x==Amount.Пусто || x==null) {throw new Exception("Нельзя такое сюда ставить!");}
        if (i>CELLS||j>CELLS||i<0||j<0) {throw new Exception("Нельзя тута ходить");}
        field[i][j]=x;
    }
}
