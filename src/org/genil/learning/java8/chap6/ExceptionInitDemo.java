package org.genil.learning.java8.chap6;

/**
 * Created by genil on 1/6/19 at 10 39
 **/
public class ExceptionInitDemo {
    static int[] ints = new int[0];
    static {
        ints[0] = 20;
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}
