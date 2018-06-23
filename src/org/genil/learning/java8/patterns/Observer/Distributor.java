package org.genil.learning.java8.patterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anton on 6/9/2018 3:37 PM
 * Distributor implementing subject - the publishers !
 *
 **/
public class Distributor  {

    public static void main(String[] args) {

        /**
         * Antony wants to read global as well as local news
         */
        Observer antony = new ObserverAntony();
        TheChurch church = new TheChurch();

        Times times = new Times();

        times.registerObserver(antony);


        TheHindu hindu = new TheHindu();

        hindu.registerObserver(church);
        hindu.registerObserver(antony);

        times.notifyObservers();
        hindu.notifyObservers();


    }
}
