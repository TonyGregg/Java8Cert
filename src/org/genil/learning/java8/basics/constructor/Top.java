package org.genil.learning.java8.basics.constructor;

/**
 * Created by genil on 12/4/18 at 08 25
 **/
public class Top {
    private Top(String name) {
        this(); // optional
        System.out.println(name);
    }
    Top() {

    }

    public static void main(String[] args) {
        new Top();
    }
}
