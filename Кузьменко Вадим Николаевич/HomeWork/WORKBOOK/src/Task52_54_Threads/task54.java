package Task52_54_Threads;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class task54 {
        public static void main(String args[]) throws FileNotFoundException {

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int[] mas = new int[12];

                    for (int i = 0; i < mas.length; i++) {
                        mas[i] = (int) (Math.random() * 100);
                    }
                    for (int i : mas) {
                        System.out.print(i);
                    }

                }
            });
            thread.start();


            thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int[] mas = new int[12];

                    for (int i = 0; i < mas.length; i++) {
                        mas[i] = (int) (Math.random() * 100);
                    }
                    for (int i : mas) {
                        System.out.print(i);
                    }

                }
            });
            thread.start();

            thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int[] mas = new int[12];

                    for (int i = 0; i < mas.length; i++) {
                        mas[i] = (int) (Math.random() * 100);
                    }
                    for (int i : mas) {
                        System.out.print(i);
                    }

                }
            });
            thread.start();

            thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int[] mas = new int[12];

                    for (int i = 0; i < mas.length; i++) {
                        mas[i] = (int) (Math.random() * 100);
                    }
                    for (int i : mas) {
                        System.out.print(i);
                    }

                }
            });
            thread.start();


            thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int[] mas = new int[12];

                    for (int i = 0; i < mas.length; i++) {
                        mas[i] = (int) (Math.random() * 100);
                    }
                    for (int i : mas) {
                        System.out.print(i);
                    }

                }
            });
            thread.start();


            thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int[] mas = new int[12];

                    for (int i = 0; i < mas.length; i++) {
                        mas[i] = (int) (Math.random() * 100);
                    }
                    for (int i : mas) {
                        System.out.print(i);
                    }

                }
            });
            thread.start();

            File file = new File("MASSIV");
            PrintWriter pw = new PrintWriter(file);
            int[] mas = new int[12];

            for (int i = 0; i < mas.length; i++) {
                mas[i] = (int) (Math.random() * 100);
            }
            for (int i : mas)

                pw.println(i);
            pw.close();

        }
    }

