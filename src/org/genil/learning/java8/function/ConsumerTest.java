package org.genil.learning.java8.function;

import java.util.function.Consumer;

public class ConsumerTest {

    private static void printNames(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println("Java 8 Consumer Example\n");
        Consumer<String > consumer = ConsumerTest::printNames;
        consumer.accept("C++");
        consumer.accept("Java");
        consumer.accept("Python");
        consumer.accept("Scala");

        Consumer<String > consumer1 = System.out::println;
        Consumer<String >consumer2 = x-> System.out.println("Hello "+x);

        consumer1.accept("Antony");
        consumer2.accept("Greg");
    }
}
