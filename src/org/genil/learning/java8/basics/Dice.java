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
}

