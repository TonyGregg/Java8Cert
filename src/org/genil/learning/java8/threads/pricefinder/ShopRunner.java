package org.genil.learning.java8.threads.pricefinder;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by anton on 6/10/2018 6:18 AM
 **/
public class ShopRunner {
    public static void main(String[] args) {
        Shop shop = new Shop("Best Buy");
        // See My memory is good ! I remember instant class :)
        Instant now = Instant.now();

        Future<Double> futurePrice =  shop.getPriceAsync("Bose wireless headphone");

        Instant invocationTime = Instant.now();

        System.out.println("Future inoocation Time taken "+Duration.between(now,invocationTime).toMillis());

        // Do something else now.. like take care of next customer while the price is being fetched
        Shop.doSomethingElse();

        // now get the price
        try{
            double price = futurePrice.get();
            System.out.printf("Price of the product is $ %.2f%n", price);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        Instant after = Instant.now();

        System.out.println("Price returned after "+Duration.between(now,after).toMillis());


    }
}
