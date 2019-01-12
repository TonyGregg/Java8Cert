package org.genil.learning.java8.basics;

/**
 * Created by genil on 1/6/19 at 13 22
 **/
public class WrapperPrimDemo {
    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 =1;

        Byte b1 =1;
        Long g1 = 1L;

        System.out.println("i1 == i2 "+ (i1 == i2)
                + " i1 equals i2 "+ (i1.equals(i2))
                + " i1 == i3 "+ (i1 == i3) + " i1.equals g1 "+ (i1.equals(g1)));


        double d = 0b00100, d1 = 23423.00234d;
        long l = 0b1000L;



    }
}
