package org.genil.learning.java8.access.pkg2;

import org.genil.learning.java8.access.pk1.AccessTest;

/**
 * Created by Antony Genil Gregory on 12/27/2018 8:59 PM
 * For project : Java8Cert
 **/
public class AccessTester extends AccessTest {
    public static void main(String[] args) {
        AccessTest accessTest = new AccessTest();
        accessTest.publicInt = 20;


        AccessTester accessTester = new AccessTester();

        accessTester.proctedInt = 23;

        Boolean boole;

    }
}
