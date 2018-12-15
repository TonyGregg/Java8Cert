package org.genil.learning.java8.passRefernce;

/**
 * Created by genil on 12/6/18 at 18 47
 **/
public class Fizz {
    int x = 5;
    static Fizz fizzSwith(Fizz x, Fizz y) {
        final  Fizz z = x;
        z.x = 6;
        return z;
    }

    public static void main(String[] args) {
        final Fizz f1 = new Fizz();
        Fizz f2 = new Fizz();

        Fizz f3 = fizzSwith(f1,f2);

        System.out.println((f1 == f3) +"  " + (f1.x == f3.x));
    }
}
