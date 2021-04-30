package by.gsu.lesson8.multithreading;

import java.util.concurrent.TimeUnit;

public class MultiThreadingMain {
    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("t1 start");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("t1 end");
            }
        };
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable1);

        t1.start();
        t2.start();
    }
}
