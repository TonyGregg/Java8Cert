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

        if(args.length == 1 | args[0].equals("test")) {
            System.out.println("test case");
        } else {
            System.out.println("production args "+args[0]);
        }

        System.out.println(x1/a1 + ".. " + x1/b);


        System.out.println("exclusive false ^ false : "+ (false ^ false) + " true ^ false :"+ (true ^ false));

        System.out.println(12/5);

        int mask = 2;

        int count = 1;

        if( !(mask>1) && ++count > 1) mask = mask + 100;

        System.out.println(" Mask : "+mask + " Count : "+count);





    }
}
