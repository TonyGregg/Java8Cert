package org.genil.learning.java8.junit;

import java.util.Arrays;

/**
 * Created by genil on 6/26/18 at 07 27
 **/
public class MyMath {


    int sum(int... numbers) {
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        return sum;
    }
}
