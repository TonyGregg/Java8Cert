package org.genil.learning.java8.threads.basics;

import java.util.concurrent.*;

/**
 * Created by genil on 6/11/18 at 18 47
 **/
public class SchedulerDemo {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("doing something. .. "+ new java.util.Date());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

//        scheduledExecutorService.scheduleAtFixedRate(task,0,1,TimeUnit.SECONDS);

        scheduledExecutorService.scheduleWithFixedDelay(task,0,1,TimeUnit.SECONDS);
    }
}
