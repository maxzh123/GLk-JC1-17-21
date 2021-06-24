import java.util.Arrays;


//https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%B0%D1%8F
//https://zaochnik.com/spravochnik/matematika/prjamaja-ploskost/uravnenie-prjamoj-vidy-uravnenija-prjamoj-na-plosk/
public class Butterfly {
    final static int size=15;
    final static int maxIdx=size-1;

    public static void main(String[] arg){
        int [][] array=new int[size][size];
        for (int y=0;y<size;y++){
            for (int x=0;x<size;x++){

                if (line1(x,y)==0){array[y][x]=1;}//Все точки на первой прямой
                if (line2(x,y)==0){array[y][x]=1;}//Все точки на второй прямой

                if (line1(x,y)>0 && line2(x,y)>0){array[y][x]=2;}//Все точки, которые ниже и первой и второй прямой
                if (line1(x,y)<0 && line2(x,y)<0){array[y][x]=3;}//Все точки, которые выше и первой и второй прямой
                if (line1(x,y)<0 && line2(x,y)>0){array[y][x]=4;}//Выше первой но ниже второй
                if (line1(x,y)>0 && line2(x,y)<0){array[y][x]=5;}//Выше второй, но ниже первой


            }
        }

        for (int y=size-1;y>=0;y--){//Вы выводим сверху вних, а координаты привыкли видеть снизу вверх. поэтому перевернем массив
            System.out.println(Arrays.toString(array[y]));
        }
    }
    private static int line1(int x,int y){//Уравнение первой прямой
        return x-y;
    }
    private static int line2(int x,int y){//Уравнение второй прямой
        return maxIdx-y-x;
    }

}
