package org.genil.learning.java8.basics.inheritance;

import java.io.IOException;

/**
 * Created by genil on 10/4/18 at 07 59
 **/
public class Animal {
    String name;
    Animal(String name) {
        System.out.println("Animal's name is "+name);
    }
    Animal() {
        System.out.println("Animal default constructor !");
        new Dog();
    }
    public void eat() throws IOException {
        System.out.println("Animal eats more generic food");
        doKaka();
    }

    private void doKaka() { // will never be inherited.
        System.out.println("Animal going kaka. ..");
    }

    private final void someMethod() {
        System.out.println("Yes private final is allowed !!");
    }
}
