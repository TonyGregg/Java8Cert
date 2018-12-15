package org.genil.learning.java8.chap6;

import java.util.function.Predicate;

/**
 * Created by genil on 12/14/18 at 22 53
 **/
public class LambdaSample {
    public static void main(String[] args) {

        LambdaSample lambdaSample = new LambdaSample();

        lambdaSample.go(x->90>200);
        lambdaSample.go(x->adder(23,30)>50);
//        lambdaSample.go(x-> return adder(23,30)>50); //compile time error

        lambdaSample.go(x-> {return adder(20,50)>60;});
        lambdaSample.go(( (LambdaSample lambdaSample1) -> {
            int x = 20;
            return adder(x,200)>210;
        }));

//        lambdaSample.go(x-> { //WONT COMPILE, NEEDS A RETURN
//             adder(20,30)>20;
//        });

    }

    void go(Predicate<LambdaSample> expre) {
        LambdaSample lambdaSample = new LambdaSample();

        System.out.println(expre.test(lambdaSample) ? "ternary true": " terenary false");
    }

    static int adder(int x, int y) {
        return x+y;
    }
}
