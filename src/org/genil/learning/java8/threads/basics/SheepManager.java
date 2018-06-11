package org.genil.learning.java8.threads.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by genil on 6/11/18 at 12 03
 **/
public class SheepManager {

    private int sheepCount = 0;

    private  void incrementAndReport() {
        synchronized (this) {
            System.out.print((++sheepCount)+ " ");
        }

    }

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = null;
        try{
            SheepManager sheepManager = new SheepManager();

            executorService = Executors.newFixedThreadPool(20);

            for (int i = 0; i < 10; i++) {
                executorService.submit(()->sheepManager.incrementAndReport());
                TimeUnit.SECONDS.sleep(1);

            }



        } finally {
            if(executorService!=null) {
                executorService.shutdown();
            }
        }


    }
}
