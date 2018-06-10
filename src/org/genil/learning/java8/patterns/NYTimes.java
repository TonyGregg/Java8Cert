package org.genil.learning.java8.patterns;

import org.omg.CORBA.Object;

/**
 * Created by anton on 6/9/2018 3:27 PM
 **/
public class NYTimes implements Observer {


    @Override
    public void notify(String tweet) {
        if(tweet.contains("money")) {
            System.out.println("Breaking news in NY news.. "+tweet);
        }
    }
}

class TheHindu implements Observer {

    @Override
    public void notify(String tweet) {
        if(tweet.contains("India")) {
            System.out.println("Breaking news about India "+tweet);
        }
    }
}

class BBC implements Observer{

    @Override
    public void notify(String tweet) {
        if(tweet.contains("UK")) {
            System.out.println("UK is on fire.. "+tweet);
        }
    }
}
