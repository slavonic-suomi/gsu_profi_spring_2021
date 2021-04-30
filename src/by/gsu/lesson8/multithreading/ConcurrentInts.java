package by.gsu.lesson8.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentInts {
//    public volatile static int counter = 0;
    public static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Incrementor inc = new Incrementor();
        Decrementor dec = new Decrementor();

        inc.start();
        dec.start();

        inc.join();
        dec.join();

        System.out.println(counter.get());
    }
}

class Incrementor extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1_000_000_000; i++) {
//            ConcurrentInts.counter++;
            ConcurrentInts.counter.incrementAndGet();
        }
    }
}

class Decrementor extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1_000_000_000; i++) {
//            ConcurrentInts.counter--;
            ConcurrentInts.counter.decrementAndGet();

        }
    }
}
