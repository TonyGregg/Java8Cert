package org.genil.learning.java8.basics.inheritance;

/**
 * Created by Antony Genil Gregory on 12/15/2018 12:53 PM
 * For project : Java8Cert
 **/

class X {
    void go() {
        System.out.println("x");
    }
    static void m1() {
        System.out.println("static X");
    }


    int sum(int x, int y) {
        return x+y;
    }
}
class Y extends X {
     void go() {
        System.out.println("Y");
    }
//
//    void m1() {
//        System.out.println("error.. error.. parent static is like concrete... do not attempt this at home");
//    }

    static void m1() {
        System.out.println("static to static override is okay baby ");
    }

    int sum(int x, int y) {
         return x+y;
    }
}

 abstract interface Bar {
    default void bar() {

    };

    default void bar2() { // an interface can have more than one default

    }

    static void st1() {

    }
    static void st2() { // interface can also hve more than one static methods

    }

    void m1();

}

interface DummyBar extends Bar {
    default void bar() { //override default is okay

    }

//    static void bar2() { // cannot override default with static
//
//    }

    static void st1() { // static to static override is okay

    }
}


abstract class FooBase implements Bar, DummyBar{
//    static void bar() { // cannot override default with static method
////
////    }


//    static void m1() { //cannot override regular interface method with static
//
//    }


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

        X x = new X();


        if( y == x) {

        }


    }
}
