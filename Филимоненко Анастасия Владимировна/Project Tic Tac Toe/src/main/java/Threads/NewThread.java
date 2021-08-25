package Threads;

public class NewThread extends Thread{
    public void run(){
        Task52.arrayList = Task52.createArrayList();
        Task52.arrayList.forEach(System.out::print);
       for (Integer n: Task52.arrayList){
           System.out.print("["+n+"] ");}

        int result= Task52.arrayList.stream()
                .mapToInt(b->b)
                .sum();
        System.out.println();
        System.out.println("average: "+ result/Task52.arrayList.size()+" working "+Thread.currentThread().getName());
    }

}
