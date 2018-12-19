package org.genil.learning.java8.chapter2;

/**
 * Created by Antony Genil Gregory on 12/15/2018 11:39 PM
 * For project : Java8Cert
 **/

class Fuel {
    int getRating() { return 41;}
}
class AlternateFuel extends Fuel {
    int getRating() { return 42;}
}

class BioDiesel extends AlternateFuel{
    public static void main(String[] args) {

    }
    void go() {
        System.out.println(super.getRating());
//        System.out.println(super.super.getRating()); // compilation fails
        
    }
}


public class OverridingExample {
}
