package org.genil.learning.java8.lambda;

import java.util.function.IntFunction;

/**
 * Created by Antony Genil Gregory on 1/1/2020 7:03 PM
 * For project : Java8Cert
 **/
public class LambdaJava9FeaturesDemo {
    public static void main(String[] args) {
        IntFunction<Integer> doubleIt = x -> x * 2;
        Integer res = doubleIt.apply(32);
        System.out.println(res);

    }
}
