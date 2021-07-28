package WorkBookTask.Task_52_54_Thread.Task52;

import java.util.stream.Stream;

public class NewThread extends Thread {

    public void run(){
       Task_52.arrayList = Task_52.createArrayList();
       Task_52.arrayList.forEach(System.out::println); //пример с лямбдой то есть на тебе колецию сделай мне вывод
//       for (Integer n: Task_52.arrayList){
//           System.out.print("["+n+"] ");}

       int result= Task_52.arrayList.stream() // можно было через forEach, посмотрел как Вероника сделал также
       .mapToInt(b->b)
        .sum();
        System.out.println();
        System.out.println("Ср. арифметическое: "+ result/Task_52.arrayList.size()+" Поток в работе "+Thread.currentThread().getName());
    }

}
