package org.genil.learning.java8.basics.inheritance;

/**
 * Created by genil on 10/11/18 at 17 36
 **/
public class TennisBall implements Bouncable, Ball {
    @Override
    public void bounce() {

    }

    @Override
    public void bounce(String s) {

    }

    @Override
    public void roll() {

    }

    public  int getBounceFactor() {
        return 100;
    }

    public static void main(String[] args) {
        TennisBall tennisBall = new TennisBall();
        int bounceFactor = tennisBall.getBounceFactor();
        System.out.println("Bounce factor " +bounceFactor);
    }
}
