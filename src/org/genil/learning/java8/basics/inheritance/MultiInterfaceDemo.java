package org.genil.learning.java8.basics.inheritance;

/**
 * Created by genil on 12/30/18 at 16 26
 **/

interface I1 {

}

abstract interface I2 {
    void m2();

    default int aMethod() { return 1;}
}

interface I3 extends I1, I2 {
    void m2();
    default int aMethod() {return 2;}

}
public class MultiInterfaceDemo implements I2,I3{
    @Override
    public void m2() {

    }

    public static void main(String[] args) {
        MultiInterfaceDemo demo = new MultiInterfaceDemo();

        System.out.println(demo.aMethod());
    }
}
