package org.genil.learning.java8.chapter2;

/**
 * Created by genil on 1/6/19 at 13 00
 **/
public class StaticOverrideDemo extends Kuruvi{
    public static void main(String[] args) {
        StaticOverrideDemo demo = new StaticOverrideDemo();

        demo.fly();

        Bird.fly();
    }
}

interface Bird {
    public static void fly() {
        System.out.println("Paravai is flying... .");
    }
    void eat();

    static void sleep() {
        System.out.println("bird sleeping");
    }

    public default void stand() {
        System.out.println("stand");
    }
}

class ChittuKuruvi implements Bird {

    @Override
    public void eat() {

    }

    public void sleep() {

    }

    public  void stand() {

    }

    public final static void chittuMethod() {
        System.out.println("static final method");
    }


}

class ChinnaKuruvi extends ChittuKuruvi {
//    public static void chittuMethod() {
//
//    }
}

abstract class Kuruvi {
    public  static void fly() {
        System.out.println("Kurvi flying");
    }
//    public static void eat() { // compile time error
//
//    }

    public static void eat() {
        System.out.println("Kuruvi eats");
    }
}
