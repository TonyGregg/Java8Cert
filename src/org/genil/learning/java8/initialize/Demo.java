package org.genil.learning.java8.initialize;

/**
 * Created by genil on 12/6/18 at 06 51
 **/
public class Demo {
    String name;
    void go() {
        String s = null;
        if(s == null) { // compile time error without inialize

        }
//        System.out.println(s); // compile time error; not initialized
        System.out.println(name);

        int[] year = new int[10];

        for (byte i = 0; i < year.length; i++) {
            System.out.println(year[i]); // all zero for local arrays too
        }

    }

    public static void main(String[] args) {
        new Demo().go();
        Runtime.getRuntime().gc();
        System.gc();
    }
}
