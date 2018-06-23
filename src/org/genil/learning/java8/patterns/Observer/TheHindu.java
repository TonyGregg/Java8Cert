package org.genil.learning.java8.patterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by genil on 6/23/18 at 18 22
 **/
public class TheHindu implements Subject {
    List<Observer> observers = new ArrayList<>();

    private static final String news = "Todays is about Modi .. oorrodi ";
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Count "+observers.size());
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer->{
            observer.notify(news);
        });

    }
}
