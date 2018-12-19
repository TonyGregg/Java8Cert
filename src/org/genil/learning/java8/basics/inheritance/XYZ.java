package org.genil.learning.java8.basics.inheritance;

/**
 * Created by Antony Genil Gregory on 12/15/2018 12:53 PM
 * For project : Java8Cert
 **/

class X {
    void go() {
        System.out.println("x");
    }
}
class Y extends X {
    void go() {
        System.out.println("Y");
    }
}

class Z extends X{
    void go() {
        System.out.println("Z");
    }
}
public class XYZ {
    public static void main(String[] args) {
        X z1 = new Z();
        X y = new Y();

        Z y2 = (Z)y;

        int _123;
        int $x;
        int x$sdw;


    }
}
