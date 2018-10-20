package org.genil.learning.java8.basics;

/**
 * Created by genil on 9/13/18 at 17 59
 **/
public class Electronics implements Device {
    long []   xs [];

    @Override
    public void doIt() {

    }
}

abstract class Phone1 extends  Electronics{

}

abstract class Phone2 extends Electronics {
    @Override
    public void doIt() {

    }

    public void doIt(int x) {

    }
}

class Phone3 extends Electronics implements Device {

}

abstract class XPhone {
    public String getName() {
        return "X";
    }
}