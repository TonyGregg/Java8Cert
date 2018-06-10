package org.genil.learning.java8.patterns;

/**
 * Created by anton on 6/9/2018 3:25 PM
 **/

@FunctionalInterface
public interface Observer {
    public void notify(String tweet);
}
