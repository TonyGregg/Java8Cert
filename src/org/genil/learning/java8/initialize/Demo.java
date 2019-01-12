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

        this.met1();

    }

    void met1() {

    }

    public static void main(String[] args) {
        new Demo().go();
        Runtime.getRuntime().gc();
        System.gc();

        int i,j;

        if(true) {
            i = 0;
        } else {
            j = 2;
        }

        for (i=0, j = 3;j<i;++i) {

        }

        System.out.println("i "+i + " j "+j) ;
    }
}
