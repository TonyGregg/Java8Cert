package org.genil.learning.java8.basics;

import java.util.Arrays;

/**
 * Created by genil on 11/29/18 at 17 09
 **/
public class VarArgDemo {
    private void m1(int x, int... y){
        System.out.println("x "+x + " y = "+ Arrays.toString(y));
    }

    public static void main(String[] args) {
        VarArgDemo varArgDemo = new VarArgDemo();

        varArgDemo.m1(23,10,25,30,23);

    }
}
