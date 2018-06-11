package org.genil.learning.java8.threads.basics;

import java.util.concurrent.*;

/**
 * Created by genil on 6/11/18 at 14 54
 **/
public class CallableDemo {
    public static void main(String[] args) throws Exception {
        Callable<Integer> task = () -> {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("callable thread.. . ");
          return 23;
        };

        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<Integer> future =  service.submit(task);

        System.out.println("Future done ?? "+future.isDone());
        Integer output = future.get();

        System.out.println("Result output "+output);


        TimeUnit.SECONDS.sleep(3);

        System.out.println("Done executing .. ");
    }
}
