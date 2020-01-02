package org.genil.learning.java8.chapter2;

/**
 * Created by Antony Genil Gregory on 12/28/2018 12:01 PM
 * For project : Java8Cert
 **/
public class PrimitiveCastDemo {
    final static public void main(String[] args) {

//        args = {"a","b","c"};

        String[] someArgs = {"a", "b", "c"};

        args = someArgs;

        String[][] newArgs = {args};

        System.out.println(newArgs.length + " .. " + newArgs[0].length + " : " + newArgs[0][1]);

        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);

        if (integer1.equals(integer2)) {
            System.out.println("Integer 1 and 2 are equals");
        } else {
            System.out.println("Integers are not the same");
        }
        int i = 2;

        i = 3/2; // 11

        float f = 2.0f;
        f = 23232;
        f= 0b010010010;

        long l = 23;
        double d = 23.03d;
        char ch = 'A';
        short s = 10;
//
//        ch = s; // compile time error... short cannot be assigned to char and vice-versa
//        s = ch;

        f = 2323423;

        for (; i < d; i++) {

        }

        System.out.println("i = " + i);

        byte count = 1;

        for (; d < 25.02; d += 0.2) {
            count++;
        }

        System.out.println("Count " + count + " d= " + d);


        ch++;


        System.out.println("ch after increment : " + ch);
        byte b = 1;
        short sh = 32;

//        b = 320;

        if (i == f) {
            System.out.println("i and f are same ...");
        } else {
            System.out.println(" i is I ");
        }

        f = i; // int to float does not need conversion

        i = (int) f; // float to int needs conversion

        l = i; // long to int does not need conversion

        ch = (char) b; // byte to char needs conversion !!

        sh = b;

        ch++;

        i = ch;


        b = -128;
        i = b;
        b = (byte) (i - 1);
        System.out.println("-ve range demo.. .");
        System.out.println(i + " " + b);

        b = (byte) 250;

        System.out.println("what if b is really a big ? "+b);


    }
}
