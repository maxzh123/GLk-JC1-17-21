package task52;

import java.util.ArrayList;

public class main {


        public static int createSet() {
                Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                                int a = 20;
                                int sum = 0;

                                ArrayList<Integer> m = new ArrayList<>();

                                for (int i = 0; i < 20; i++) {
                                        double random = Math.random() * a;
                                        m.add((int) random);
                                }
                                for (int i = 0; i < m.size(); i++) {
                                        sum += m.get(i);
                                }
                                System.out.println(sum / m.size());;
                        }
                });
                thread.start();

                thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                                int a = 20;
                                int sum = 0;

                                ArrayList<Integer> m = new ArrayList<>();

                                for (int i = 0; i < 20; i++) {
                                        double random = Math.random() * a;
                                        m.add((int) random);
                                }
                                for (int i = 0; i < m.size(); i++) {
                                        sum += m.get(i);
                                }
                                System.out.println(sum / m.size());
                                ;
                        }
                });
                thread.start();


                thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                                int a = 20;
                                int sum = 0;

                                ArrayList<Integer> m = new ArrayList<>();

                                for (int i = 0; i < 20; i++) {
                                        double random = Math.random() * a;
                                        m.add((int) random);
                                }
                                for (int i = 0; i < m.size(); i++) {
                                        sum += m.get(i);
                                }
                                System.out.println(sum / m.size());
                                ;
                        }
                });
                thread.start();

                thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                                int a = 20;
                                int sum = 0;

                                ArrayList<Integer> m = new ArrayList<>();

                                for (int i = 0; i < 20; i++) {
                                        double random = Math.random() * a;
                                        m.add((int) random);
                                }
                                for (int i = 0; i < m.size(); i++) {
                                        sum += m.get(i);
                                }
                                System.out.println(sum / m.size());
                                ;
                        }
                });
                thread.start();

                thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                                int a = 20;
                                int sum = 0;

                                ArrayList<Integer> m = new ArrayList<>();

                                for (int i = 0; i < 20; i++) {
                                        double random = Math.random() * a;
                                        m.add((int) random);
                                }
                                for (int i = 0; i < m.size(); i++) {
                                        sum += m.get(i);
                                }
                                System.out.println(sum / m.size());
                                ;
                        }
                });
                thread.start();

                thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                                int a = 20;
                                int sum = 0;

                                ArrayList<Integer> m = new ArrayList<>();

                                for (int i = 0; i < 20; i++) {
                                        double random = Math.random() * a;
                                        m.add((int) random);
                                }
                                for (int i = 0; i < m.size(); i++) {
                                        sum += m.get(i);
                                }
                                System.out.println(sum / m.size());
                                ;
                        }
                });
                thread.start();

                thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                                int a = 20;
                                int sum = 0;

                                ArrayList<Integer> m = new ArrayList<>();

                                for (int i = 0; i < 20; i++) {
                                        double random = Math.random() * a;
                                        m.add((int) random);
                                }
                                for (int i = 0; i < m.size(); i++) {
                                        sum += m.get(i);
                                }
                                System.out.println(sum / m.size());
                                ;
                        }
                });
                thread.start();

                thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                                int a = 200;
                                int sum = 0;

                                ArrayList<Integer> m = new ArrayList<>();

                                for (int i = 0; i < 100; i++) {
                                        double random = Math.random() * a;
                                        m.add((int) random);
                                }
                                for (int i = 0; i < m.size(); i++) {
                                        sum += m.get(i);
                                }
                                System.out.println(sum / m.size());
                                ;
                        }
                });
                thread.start();



                int a = 20;
                int sum = 0;

                ArrayList<Integer> m = new ArrayList<>();

                for (int i = 0; i < 20; i++) {
                        double random = Math.random() * a;
                        m.add((int) random);
                }
                for (int i = 0; i < m.size(); i++) {
                        sum += m.get(i);
                }
                return sum / m.size();
        }

        public static void main(String[] args) {
                System.out.println(createSet());
                System.out.println();
        }
}

