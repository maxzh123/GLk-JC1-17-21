package Task55_57;

public class  Subjects {

private String  hummer ="d" ;
    private String nail ="d" ;
    private String pliers="d"  ;


    public void hammerANail () {
        synchronized (hummer) {
            System.out.println(Thread.currentThread().getName()
                    + " взял молоток");
            synchronized (nail) {
                System.out.println(Thread.currentThread().getName()
                        + " взял гвоздь");
                System.out.println(Thread.currentThread().getName()
                        + " забивает гвоздь");
            }
        }
    }
    public void getANail() {
        synchronized (pliers) {
            System.out.println(Thread.currentThread().getName()
                    + " взял плоскогубцы");
            synchronized (nail) {
                System.out.println(Thread.currentThread().getName()
                        + " взяла гвоздь");
                System.out.println(Thread.currentThread().getName()
                        + " достает гвоздь");
            }
        }
    }

    public void takeTools() {
        synchronized (hummer) {
            System.out.println(Thread.currentThread().getName()
                    + " взял молоток");
            synchronized (pliers) {
                System.out.println(Thread.currentThread().getName()
                        + " взял плоскогубцы");
                System.out.println(Thread.currentThread().getName()
                        + " взял инструменты");
            }
        }
    }
}

