package org.genil.learning.java8.access;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

/**
 * Created by anton on 7/9/2018 9:57 AM
 **/
public class TypeCastTester {
    public static void main(String[] args) {

        // Deadlock threads

        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] ids = threadMXBean.findDeadlockedThreads();

        C c = new C(3);
        c.methodC();

        final int a;

        a =23;


        if(3*0.1==0.3) {
            System.out.println("true");
        } else {
            System.out.println("false "+(3*0.1));
        }

        System.out.println("Total memory "+Runtime.getRuntime().totalMemory() + " Max memory "+ Runtime.getRuntime().maxMemory());

        Runtime.getRuntime().gc();
        System.gc();

        System.out.println("Total memory "+Runtime.getRuntime().totalMemory() + " Max memory "+ Runtime.getRuntime().maxMemory());
    }
}

class A{
    A() {
        System.out.println("A's constructor");
    }
    void someMethod() {
        System.out.println("A. some method");
    };


}

class  B extends  A {
    B() {
        System.out.println("B's constructor");
    }
    void methodB() {
        System.out.println("B");
    }
}

class C extends B {

    C(int nu) {
        System.out.println("C'S Con");
    }
    void methodC (){
        System.out.println("C");
    }
}