package org.genil.learning.java8.threads.basics;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 * Created by genil on 6/10/18 at 18 43
 **/
public class AmbigousLambdaSample {

    public static void useCallable(Callable<Integer> integerCallable) {
        System.out.println("INside use callable. ..");
    }
    public static void useSupplier(Supplier<Integer> integerSupplier) {

    }
    public static void use(Callable<Integer> integerCallable) {

    }
    public static void use(Supplier<Integer> integerSupplier) {

    }

    public static void main(String[] args) {
        useCallable(()-> {
            System.out.println("something callable. . ");
            throw new IOException();
        });
    }


}
