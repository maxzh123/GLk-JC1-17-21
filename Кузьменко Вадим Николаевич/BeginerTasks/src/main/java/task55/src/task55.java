public class task55 {
        public static void main(String args[]) {
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            });

            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        thread1.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            Thread thread3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        thread2.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            Thread thread4 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        thread3.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            Thread thread5 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        thread4.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            Thread thread6 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        thread5.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            Thread thread7 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        thread5.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            Thread thread8 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        thread6.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

                    thread1.start();
                    thread2.start();
                    thread3.start();
                    thread4.start();
                    thread5.start();
                    thread6.start();
                    thread7.start();
}
    }
