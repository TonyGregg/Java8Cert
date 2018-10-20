package org.genil.learning.java8.basics.inheritance;

/**
 * Created by genil on 10/11/18 at 17 34
 **/
public interface Bouncable extends Rollable {
    public void bounce();
    public default int getBounceFactor() {
        return 1;
    }
}
