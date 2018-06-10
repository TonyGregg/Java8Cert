package org.genil.learning.java8.patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anton on 6/9/2018 3:37 PM
 **/
public class Feed implements Subject {
    List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(String tweet) {

        observers.forEach(observer -> observer.notify(tweet));

    }

    public static void main(String[] args) {
        Feed feed = new Feed();
        feed.registerObserver(new NYTimes());
        feed.registerObserver(new BBC());
        feed.registerObserver(new TheHindu());

        feed.notifyObservers("News about money is great !!");

    }
}
