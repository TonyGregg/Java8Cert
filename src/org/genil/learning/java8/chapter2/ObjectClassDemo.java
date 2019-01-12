package org.genil.learning.java8.chapter2;

/**
 * Created by genil on 1/4/19 at 08 12
 **/
public class ObjectClassDemo {
    String string = null;

    public static void main(String[] args) {
        Object a,b,c;

        a =  new String("A");

        b = new String("B");

        c =a;

        a = b;

        System.out.println(" C : "+c);
    }



}
