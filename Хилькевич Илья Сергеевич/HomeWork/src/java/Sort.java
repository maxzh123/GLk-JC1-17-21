/*void BubbleSort(vector<int>& values) {
        for (size_t idx_i = 0; idx_i + 1 < values.size(); ++idx_i) {
        for (size_t idx_j = 0; idx_j + 1 < values.size() - idx_i; ++idx_j) {
        if (values[idx_j + 1] < values[idx_j]) {
        swap(values[idx_j], values[idx_j + 1]);
        }
        }
        }
        }*/
import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        System.out.println("ПОЕХАЛИ!!!!!))))");//выводим в начале
        int [] mass ={ -1,105,4,-8,6,34,-431,89};//задаем целочисленный массив
        booblesort(mass);// функция с именем booblesort
        System.out.println("КАЖИСЬ ВСЕ))))");//выводим в конце
    }
    private static void booblesort (int[] mass){  //тело функции
       for (int i=mass.length-1 ;i>0;--i){// цикл по длинне массива с 7 ячейки до 0
                  for ( int j=0;j<i; j++){//выполняем с ячейки 0 пока в j<7  прибовляя 1
                if (mass[j]>mass[j+1]){ //если значение ячейки > следующего значения в ячейке
                    int f=mass[j];// целочисленное f присваиваем  ячейке j
                    mass [j]=mass[j+1];//  ячейку j присваиваем значение следующей ячейки
                    mass[j+1]=f; // следующей ячейке за j присваиваем целочисленное значение f(сдвигаем в массиве)
                    System.out.println(Arrays.toString(mass)); //выводим данные о массиве в консоль
                }
            }
        }
    }
}
/*import java.util.Arrays;
public class Sort {
    public static void main(String[] args){
        System.out.println("Пробуем");
        int[] mass={ -1,105,4,-8,6,34,-431,89};
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
        System.out.println("Так проще конечно)");

    }
}*/



