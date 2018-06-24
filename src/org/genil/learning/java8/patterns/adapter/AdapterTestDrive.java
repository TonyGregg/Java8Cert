package org.genil.learning.java8.patterns.adapter;

/**
 * Created by genil on 6/24/18 at 10 53
 *
 * Adapter lest classes work together that couldn't be possible otherwise because of incompatible interfaces
 *
 **/
public class AdapterTestDrive {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();

        Duck duckAdaptor = new TurkeyAdapter(wildTurkey); // Turkey adapter accepts turkey and is assigned to Duck interface


        mallardDuck.quack();
        mallardDuck.fly();

        wildTurkey.gobble();
        wildTurkey.fly();

        duckAdaptor.quack();
        duckAdaptor.fly();


    }
}
