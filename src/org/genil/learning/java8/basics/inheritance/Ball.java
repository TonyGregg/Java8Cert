package org.genil.learning.java8.basics.inheritance;

/**
 * Created by genil on 10/11/18 at 17 34
 **/
public interface Ball extends Rollable {
    public void bounce();
    public void bounce(String s);
    public default int getBounceFactor() {
        return 5;
    }

    static void m1() {

    }

    static void m2() {

    }

    public default void helloMe() {

    }
}
