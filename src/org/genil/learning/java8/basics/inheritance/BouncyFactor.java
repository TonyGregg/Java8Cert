package org.genil.learning.java8.basics.inheritance;

/**
 * Created by genil on 10/12/18 at 08 37
 **/
public interface BouncyFactor {
    public default int getBounceFactor() {
        return 10;
    }
}
