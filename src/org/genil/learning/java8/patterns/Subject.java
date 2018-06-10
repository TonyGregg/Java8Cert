package org.genil.learning.java8.patterns;

/**
 * Created by anton on 6/9/2018 3:37 PM
 **/
public interface Subject {
    void registerObserver(Observer observer);
    void notifyObservers(String tweet);
}
