package org.genil.learning.java8.casting;

/**
 * Created by Antony Genil Gregory on 12/26/2018 11:35 AM
 * For project : Java8Cert
 **/
public class CastDemo {

    public static void main(String[] args) {
        extract(2.78);
        extract(2.0);

        extract(10.0,2.0);
    }

    private static void extract(Double d) {
        System.out.println(d.intValue());
    }

    private static void extract(Double d, Double d2) {

    }

    private static void extract(double d, double d2) {

    }
}
