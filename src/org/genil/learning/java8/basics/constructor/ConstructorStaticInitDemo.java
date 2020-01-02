package org.genil.learning.java8.basics.constructor;

/**
 * Created by genil on 1/4/19 at 20 23
 **/
public class ConstructorStaticInitDemo {
    static String string;
    static final int x;

    static {
        x =20;
    }

    final int age;





    private  ConstructorStaticInitDemo() {
        string = "some str";

        final int i =20;

        for(;true;) {
            System.out.println("");;
            break;
        }

//        age =23; already initialized in instance block !!

        /*

        "url-parse": ">=1.4.3"
         "adm-zip": ">=0.4.11"

         */

//        while (false) {
//            break;;
//        }

//        while ((i==10)) {
//            break;
//        }
    }

    {
        age =232;
    }

}
