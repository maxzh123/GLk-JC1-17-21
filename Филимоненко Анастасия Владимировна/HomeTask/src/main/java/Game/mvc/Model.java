package Game.mvc;

import Game.Значение;
import Game.Победа;

public class Model {

    private final int CELLS=3;
    private final Значение[][] field=new Значение[CELLS][CELLS];
    private Победа win=null;
    private int winNum=-1;

    public Model() {
        newGame();
    }
    public void newGame(){
        for(int i=0;i< field.length;i++){
            for(int j=0;j< field[i].length;j++){
                field[i][j]=Значение.Пусто;
            }
        }
    }

    public boolean hasEmptyFields(){
        for(int i=0;i< field.length;i++){
            for(int j=0;j< field[i].length;j++){
                if (field[i][j]==Значение.Пусто){return true;}
            }
        }
        return false;
    }

    public Значение getWinner(){
        Победа win=null;
        int winNum=-1;
        for(int i=0;i< CELLS;i++){
            //Проверка строк
            boolean flag=Значение.Пусто!=field[i][0];
            for(int j=0;flag && j<CELLS;j++){
                flag=flag && field[i][0]==field[i][j];
            }
            if (flag){
                winNum=i;
                win=Победа.Строка;
                return field[i][0];
            }
            //Проверка столбцов
            flag=Значение.Пусто!=field[0][i];
            for(int j=0;flag && j<CELLS;j++){
                flag=flag && field[0][i]==field[j][i];
            }
            if (flag){
                winNum=i;
                win=Победа.Столбец;
                return field[i][0];
            }
        }
        //Проверка первой диагонали
        boolean flag=Значение.Пусто!=field[0][0];
        for(int i=0;flag && i<CELLS;i++){
            flag=flag && field[0][0]==field[i][i];
        }
        if (flag){
            win=Победа.ГлавнаяДиагональ;
            return field[0][0];
        }
        //Проверка второй диагонали
        flag=Значение.Пусто!=field[0][CELLS-1];
        for(int i=0;flag && i<CELLS;i++){
            flag=flag && field[0][CELLS-1]==field[i][CELLS-1-i];
        }
        if (flag){
            win=Победа.ВторичнаяДиагональ;
            return field[0][CELLS-1];
        }
        //Если мы сюда дошли - победителя нет.
        return Значение.Пусто;
    }

    //Не возвращаем массив модели, а делаем копию, чтобы его никто не мог изменить снаружи.
    public Значение[][] getField() {
        Значение[][] ret=new Значение[3][3];
        for(int i=0;i< field.length;i++){
            for(int j=0;i< field[i].length;j++){
                ret[i][j]=field[i][j];
            }
        }
        return ret;
    }
    public Победа getWin() {
        return win;
    }

    public int getWinNum() {
        return winNum;
    }


    public void doStep(int i, int j, Значение x) throws Exception {
        if (field[i][j]!=Значение.Пусто) {throw new Exception("Тут вже занято!");}
        if (x==Значение.Пусто || x==null) {throw new Exception("Нельзя такое сюда ставить!");}
        if (i>CELLS||j>CELLS||i<0||j<0) {throw new Exception("Нельзя теда ходить");}
        field[i][j]=x;
    }
}
