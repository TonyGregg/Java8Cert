package org.genil.learning.java8.interfaces;

import org.genil.learning.java8.concurrency.ThreadExtended;

/**
 * Created by genil on 12/5/18 at 05 58
 **/
public class StaticAndDefaultIntDemo implements  Temperature, Train {
    @Override
    public double getFare() {
        return 0;
    }

    public static void main(String[] args) {
        StaticAndDefaultIntDemo demo = new StaticAndDefaultIntDemo();

        demo.getCityName(); // Allowed
        Temperature.getCToF(30); // allowed

//        demo.getCToF(32); // not allowed
        System.out.println(demo.getRandomNo()); // always 50 if the overriden method exists

        demo.go();
    }

//    public int getRandomNo() {
//        return 50;
//    }

    private void go() {
        System.out.println(Temperature.super.getRandomNo()); // some random number
        System.out.println(Temperature.super.getCityName()); // random city
//        Temperature.super.getRandomNo();
    }

}

interface Temperature {
    static int getCToF(int cTemp) {
        return (cTemp * 9/5) +32;
    }
    default String getCityName() {
        int x = (int) Math.random()*3;
        String[] strings = {"Chicago","Tampa","NY"};
        return strings[x];
    }

    default int getRandomNo() {
        return (int)Math.random()*3;
    }

}

interface Train {
    double getFare();
}
