package org.genil.learning.java8.basics;

import java.util.Random;

/**
 * Created by genil on 7/6/18 at 13 16
 **/
public class Dice {

    private int displayFacetValue;

    public int getDisplayFacetValue() {
        return displayFacetValue;
    }

    public void setDisplayFacetValue(int displayFacetValue) {
        this.displayFacetValue = displayFacetValue;
    }



    public int roll() {


        Random diceVal = new Random();
        displayFacetValue = diceVal.nextInt(6);
        return displayFacetValue;

    }

    private int getSomeRandom(int x) {
        double d = Math.random();
        System.out.println("d= "+d);
        return (int)(d * x);
    }

    public static void main(String[] args) {
        Dice dice = new Dice();

        System.out.println(dice.getSomeRandom(1));
        System.out.println(dice.getSomeRandom(1));
        System.out.println(dice.getSomeRandom(2));
        System.out.println(dice.getSomeRandom(1));
        System.out.println(dice.getSomeRandom(1));

    }
}

