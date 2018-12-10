package org.genil.learning.java8.basics.constructor;

/**
 * Created by genil on 12/4/18 at 08 25
 **/
public class Bottom extends  Top {
    Bottom(String name) {
    }

    public static void main(String[] args) {
        System.out.println("hi");
        new Bottom("test");

    }

}
