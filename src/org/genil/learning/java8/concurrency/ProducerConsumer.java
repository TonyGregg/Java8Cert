package org.genil.learning.java8.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by genil on 6/21/18 at 06 42
 **/
public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new LinkedBlockingDeque();
        new Thread(new Prodcuer(blockingQueue)).start();
        new Thread((new Consumer(blockingQueue))).start();

    }
}

class Prodcuer implements Runnable {

    public Prodcuer(BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    private final BlockingQueue sharedQueue;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("I am producing. .. "+i);

                sharedQueue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    public Consumer(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    private final BlockingQueue<Integer> sharedQueue;

    @Override
    public void run() {
        for (;;) {
            try {
                System.out.println("I am consuming .."+sharedQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
