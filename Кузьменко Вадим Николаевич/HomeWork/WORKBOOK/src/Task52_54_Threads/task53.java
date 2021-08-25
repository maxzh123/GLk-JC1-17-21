package Task52_54_Threads;

public class task53 {
    public static void main(String args[]) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] mas = new int[12];
                int maxNumber = 0;
                int maxIndex = 0;

                for (int i = 0; i < mas.length; i++) {
                    mas[i] = (int) (Math.random() * 100);
                    if (maxNumber <= mas[i]) {
                        maxNumber = mas[i];
                        maxIndex = i;
                    }
                }

                System.out.println(Thread.currentThread().getName() + " " +
                        "максимальный элемент" + " " + maxNumber);
            }
        });
        thread.start();
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] mas = new int[12];
                int maxNumber = 0;
                int maxIndex = 0;

                for (int i = 0; i < mas.length; i++) {
                    mas[i] = (int) (Math.random() * 100);
                    if (maxNumber <= mas[i]) {
                        maxNumber = mas[i];
                        maxIndex = i;
                    }
                }

                System.out.println(Thread.currentThread().getName() + " " +
                        "максимальный элемент" + " " + maxNumber);
            }
        });
        thread.start();

        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] mas = new int[12];
                int maxNumber = 0;
                int maxIndex = 0;

                for (int i = 0; i < mas.length; i++) {
                    mas[i] = (int) (Math.random() * 100);
                    if (maxNumber <= mas[i]) {
                        maxNumber = mas[i];
                        maxIndex = i;
                    }
                }

                System.out.println(Thread.currentThread().getName() + " " +
                        "максимальный элемент" + " " + maxNumber);
            }
        });
        thread.start();
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] mas = new int[12];
                int maxNumber = 0;
                int maxIndex = 0;

                for (int i = 0; i < mas.length; i++) {
                    mas[i] = (int) (Math.random() * 100);
                    if (maxNumber <= mas[i]) {
                        maxNumber = mas[i];
                        maxIndex = i;
                    }
                }

                System.out.println(Thread.currentThread().getName() + " " +
                        "максимальный элемент" + " " + maxNumber);
            }
        });
        thread.start();
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] mas = new int[12];
                int maxNumber = 0;
                int maxIndex = 0;

                for (int i = 0; i < mas.length; i++) {
                    mas[i] = (int) (Math.random() * 100);
                    if (maxNumber <= mas[i]) {
                        maxNumber = mas[i];
                        maxIndex = i;
                    }
                }

                System.out.println(Thread.currentThread().getName() + " " +
                        "максимальный элемент" + " " + maxNumber);
            }
        });
        thread.start();
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] mas = new int[12];
                int maxNumber = 0;
                int maxIndex = 0;

                for (int i = 0; i < mas.length; i++) {
                    mas[i] = (int) (Math.random() * 100);
                    if (maxNumber <= mas[i]) {
                        maxNumber = mas[i];
                        maxIndex = i;
                    }
                }

                System.out.println(Thread.currentThread().getName() + " " +
                        "максимальный элемент" + " " + maxNumber);
            }
        });
        thread.start();
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] mas = new int[12];
                int maxNumber = 0;
                int maxIndex = 0;

                for (int i = 0; i < mas.length; i++) {
                    mas[i] = (int) (Math.random() * 100);
                    if (maxNumber <= mas[i]) {
                        maxNumber = mas[i];
                        maxIndex = i;
                    }
                }

                System.out.println(Thread.currentThread().getName() + " " +
                        "максимальный элемент" + " " + maxNumber);
            }
        });
        thread.start();
    }
}
