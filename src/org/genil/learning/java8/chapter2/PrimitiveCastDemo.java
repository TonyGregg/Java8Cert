package org.genil.learning.java8.chapter2;

/**
 * Created by Antony Genil Gregory on 12/28/2018 12:01 PM
 * For project : Java8Cert
 **/
public class PrimitiveCastDemo {
    public static void main(String[] args) {
        int i = 0;
        float f = 2.3f;
        long l = 23;
        double d = 23.03d;
        char ch = 'A';
        byte b = 1;
        short sh = 32;

        f = i; // int to float does not need conversion

        i  =  (int)f; // float to int needs conversion

        l =i; // long to int does not need conversion

        ch = (char) b; // byte to char needs conversion !!

        sh = b;

        ch++;

        i = ch;


    }
}
