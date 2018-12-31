package org.genil.learning.java8.operators;

/**
 * Created by genil on 12/9/18 at 19 28
 **/
public class PrecedenceDemo {
    public static void main(String[] args) {

        int x =12, a = 5, z = ++x * a--, b = 7, x1 = 12, a1 =5;

        System.out.println(z); // 60 !!


        System.out.println(true & false); // false

        System.out.println( " True | false "+(true|false)); // true

        System.out.println(" false | false "+ (false| false)); // false
        System.out.println(( (true & false) == (false | true) )); // false


        System.out.println("Args length "+args.length);
//
//        if(args.length == 1 | args[0].equals("test")) {
//            System.out.println("test case");
//        } else {
//            System.out.println("production args "+args[0]);
//        }

        System.out.println(x1/a1 + ".. " + x1/b);


        System.out.println("exclusive false ^ false : "+ (false ^ false) + " true ^ false :"+ (true ^ false));

        System.out.println(12/5);

        int mask = 2;

        int count = 1;

        if( !(mask>1) && ++count > 1) mask = mask + 100;

        System.out.println(" Mask : "+mask + " Count : "+count);

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(" "+ (!b1 & ( b2 = true)));

        System.out.println(" b2 ^ b1 :  " + (b2 ^ b1));

        count = -1;

        int remainder = count %2;

        System.out.println("Remainder of -1%2 = "+remainder);

        java.lang.Runtime.getRuntime().gc();

        java.lang.System.gc();

        a = 20;
        int var = --a * a++ + a-- - --a;
        System.out.println("a = " + a);
        System.out.println("var = " + var);

        final int sdfw2 =230;

        int xij = 10;

        m1(xij++, ++xij);


        byte b123 = (byte) (127 + 21);
        System.out.println(b123);


        short s = Short.MAX_VALUE;
        char c = (char) s;
        System.out.println("is proctedInt and Short.MAX same? : " + (c == Short.MAX_VALUE));

        int i = 1234567890;
        float f = i;
        System.out.println("Result : "+ (i - (int)f));


        b1 = false;
        b2 = false;

        if (b2 != b1 == !b2){
            System.out.println("true : b2 :"+b2);
        }
        else{
            System.out.println("false : "+" b2 :  "+b2);
        }


    }

    private static void m1(int a, int b) {
        System.out.println("a: "+a+ ", b: "+b);
    }
}
