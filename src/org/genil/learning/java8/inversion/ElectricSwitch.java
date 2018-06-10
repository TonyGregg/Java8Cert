package org.genil.learning.java8.inversion;

/**
 * Created by anton on 6/2/2018 7:26 AM
 **/
public class ElectricSwitch implements Switch {
    private Switchable switchableClient;

    public ElectricSwitch(Switchable switchable) {
        this.switchableClient = switchable;
    }
    private  boolean isOn = false;

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void press() {
        if(isOn()) {
            switchableClient.turnOff();
            setOn(false);
        }else {
            switchableClient.turnOn();
            setOn(true);
        }

    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
