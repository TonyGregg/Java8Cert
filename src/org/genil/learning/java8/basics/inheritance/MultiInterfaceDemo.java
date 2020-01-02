package org.genil.learning.java8.basics.inheritance;

/**
 * Created by genil on 12/30/18 at 16 26
 **/

interface I1 {

}

interface T1 {
    default void test() {
        System.out.println("1");
    }

    static void st1() {
        System.out.println("st1");
    }
}

interface T2 {
    static void st1() {
        System.out.println("st2 ");
    }
    default void d2() {
        System.out.println("d2");
    }

    static void st22 () {
        System.out.println("st22");
    }
}

abstract interface I2 {
    void m2();

    default int aMethod() { return 1;}
}

interface I3 extends I1, I2 {
    void m2();
    default int aMethod() {return 2;}

}
public class MultiInterfaceDemo implements I2,I3, T1, T2{
    @Override
    public void m2() {

    }

    public static void main(String[] args) {
        MultiInterfaceDemo demo = new MultiInterfaceDemo();

        System.out.println(demo.aMethod());

        demo.test();
        demo.test();

//        I3.super.aMethod();

    }

    private void testMe() {
        I3.super.aMethod();
    }

    private static void testYouStatic () {
//        I3.super.aMethod(); not in an enclosing class
    }
}
