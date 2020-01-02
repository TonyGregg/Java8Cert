package org.genil.learning.java8.chapter2;

import java.io.IOException;

/**
 * Created by Antony Genil Gregory on 12/15/2018 11:39 PM
 * For project : Java8Cert
 **/

class Fuel {
    int getRating() { return 41;}
    public Fuel() {

    }
    public Fuel(float rate) throws IOException {

    }
}
class AlternateFuel extends Fuel {
    AlternateFuel(float rate) throws Exception {
        super(rate);
    }
    AlternateFuel() {

    }
    int getRating() { return 42;}
}

class BioDiesel extends AlternateFuel{
    public static void main(String[] args) {

    }
    void go() {
        System.out.println(super.getRating());
//        System.out.println(super.super.getRating()); // compilation fails super.super is not possible
        
    }
}


public class OverridingExample {
}
