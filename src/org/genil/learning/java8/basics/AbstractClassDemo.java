package org.genil.learning.java8.basics;

/**
 * Created by Antony Genil Gregory on 12/29/2018 2:58 PM
 * For project : Java8Cert
 **/
public abstract class AbstractClassDemo {
    abstract void calc();

    int x = 10;
    int y;

    public static void main(String[] args) {

        System.out.println("caclculating. .");
        AbstractClassDemo abstractClassDemo = null;

        System.out.println("x "+abstractClassDemo.x + " y "+abstractClassDemo.y); // null ptr ex
        abstractClassDemo.calc(); // null ptr exce


    }
}
