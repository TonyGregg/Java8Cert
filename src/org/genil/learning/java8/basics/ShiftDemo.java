package org.genil.learning.java8.basics;

/**
 * Created by anton on 7/1/2018 9:58 AM
 **/
class ShiftDemo {

    char c;
    double d;
    float f;
    public static void main(String[] args) {
        int x =5;
        System.out.println("X<<3 = "+ (x<<3));
        //x* 2^3 = 5*8 = 40;

        /** Right shift
         *
         * 256/2^x
         */

        float f = -235.502f;

        double d = -25322.50052;

        System.out.println(f+" d "+d);

        if(d<0.001) {
            System.out.println("d is really a small number");
        }

        double price = 90000;
        String model = null;
        if(price > 100000) {
            model = "Tesla Model X";
        } else if(price <= 100000) {
            model = "Tesla Model S";
        }
        System.out.println(model);

        ShiftDemo obj = new ShiftDemo();
        System.out.println(">" + obj.c);
        System.out.println(">" + obj.d);
        System.out.println(">" + obj.f);



    }
}
