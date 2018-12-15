package org.genil.learning.java8.interfaces;

/**
 * Created by genil on 12/4/18 at 21 01
 **/

interface I1 {
    default int doStuff() { return 1;}
}
interface I2 {
    default int doStuff() { return 2;}
}

public class MultiInt implements I2, I1 {

    @Override
    public int doStuff() {
        return 0;
    }

    void go() { doStuff();
        I1.super.doStuff();
    }

}
