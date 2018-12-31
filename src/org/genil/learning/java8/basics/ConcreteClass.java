package org.genil.learning.java8.basics;

/**
 * Created by Antony Genil Gregory on 12/29/2018 3:02 PM
 * For project : Java8Cert
 **/
public class ConcreteClass extends AbstractClassDemo {
    @Override
    void calc() {
        System.out.println("inside calculator ");

    }

    public static void main(String[] args) {
        System.out.println("inside concrete class");

        AbstractClassDemo abClass = new ConcreteClass();
        System.out.println(" x "+abClass.x + " y "+abClass.y);

        abClass.calc();
    }

    int m1() { return 1;}

}
