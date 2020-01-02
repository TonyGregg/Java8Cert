package org.genil.learning.java8.defaultstatic;

/**
 * Created by genil on 1/1/19 at 08 04
 **/
public class DefaultOverrideDemo implements I1, I2 {
    public static void main(String[] args) {
        DefaultOverrideDemo demo =  new DefaultOverrideDemo();

        demo.m1();
        demo.staticM1();

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}

interface I1 {
    default void m1() {
        System.out.println("I1s m1()");
    }

    static void staticM1() {
        System.out.println("As a parent, I can be static");
    }

    void m2();
}

interface I2 extends I1 {
    @Override
    default void m1() {
        System.out.println("I2's m2()");
    }

    default void staticM1() {
        System.out.println("It is override because parent is static, and very much allowed");
    }
    void m3();

}
