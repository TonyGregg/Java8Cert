package org.genil.learning.java8.literals;

/**
 * Created by genil on 12/5/18 at 08 41
 **/
public class NumberDemo {
    public static void main(String[] args) {
        int milage = 60_000; // _ is allowed

        //binary
        int b1  = 0B1000_1;
        System.out.println(b1);

        //Octal

        int o1 = 0_700_6; // 0 to 7

        System.out.println(o1);

        char ch = 'a';
        char ch2 = '\u004F';

        char ch3 = (char)o1;

        char ch4 = 65536-1;

        char ch5 = (char)-23;
        char ch6 = (char)2342432;

        int i,j=2,k=3, l= k * j, m =20;

        long l1 = 23423;

        float f = 2562.56f;

        short s = (short)f;

        System.out.println(s);

        short s1 = 30;

        s1 =  (short)(s1+ 300); // not allowed without explicit cast and the bracket

        //however

        s1 += 20; // is allowed..+= allows implicit cast.. like wise -=, *= and /=

        s1 *= 30;

        byte b = 1___2______7;

        for (byte b2 =0; ++b2<8;) {
            short x =252;
//            short s1 =232; // variable is already declared outside
            System.out.println("byte "+b2);
        }
        {
            short x = 500, x1 =323;
        }
        {
            short x1 =232;
            System.out.println("something local to local");
            {
                short x = 300;
                System.out.println("something more local");
            }
        }

        short x =232;



    }
    void doDemo() {
        byte b1 =4;
        int i1 = 123456;

        long L1 = (long)i1;

        short s2 = (short)i1;
        byte b2 = (byte)i1;

        int i2 = (int)123.234;

//        byte b4 = b1+7; // compilation failure, needs casting

        b1 += 7; // is allowed, as auto cast

        int hex = 0x2_a;


    }
}



