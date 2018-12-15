package org.genil.learning.java8.operators;

import java.util.Collections;

/**
 * Created by genil on 12/9/18 at 11 22
 **/
public class Compare {
    enum Color {RED, BLUE, GREEN ,YELLOW}
    public static void main(String[] args) {
        boolean b = true;
        int i =0;
        byte by = 3;
        long l = 5L;
        float f= 5.0f;
        double d = 25.0020423420;
        char ch = 'd';

        if(ch == d) {
            System.out.println("Character and double ... it works");
        }

        if(f == l) {
            System.out.println("float  5 and long 5 are equalsR");
        }

        String s1 = "s1", s2 = "something else";

        Color color = Color.BLUE, color1 = Color.BLUE;

        if(color == color1) {
            System.out.println("enum ==");
        }

        if(color.equals(color1)) {
            System.out.println("enum equals");
        }

        if(color instanceof Color) {
            System.out.println("color is instance of Color");
        }

        System.out.println(" null instance of Object? "+ (null instanceof  Object));

        Compare[] compares = new Compare[10];

//        if(compares instanceof Compare) { // compile time error !
//
//        }

        if(compares instanceof Object) {
            System.out.println("print true please");
        }

    }
}
