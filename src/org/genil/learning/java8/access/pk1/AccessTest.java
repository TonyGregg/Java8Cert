package org.genil.learning.java8.access.pk1;

/**
 * Created by Antony Genil Gregory on 12/27/2018 8:57 PM
 * For project : Java8Cert
 **/
public class AccessTest {
    int a;
    private int b;
    protected int proctedInt;

    public int publicInt;

    protected void protectedMethod1() {
        System.out.println("INside protected method 1");
    }

    public int publicMethod() {
        return 0;
    }
}
