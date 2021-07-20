package MultyTreadHomeWork;

public class Task52 {
       public Task52(int countThread) {
           String nameTread;
        for (int i = 1; i <= countThread; i++) {
            Thread52 t1 = new Thread52();
            nameTread = "My thread for t.52 " + i;
            t1.setName(nameTread);
            System.out.println("Создан поток: "+nameTread);
            t1.start();
        }
    }
}