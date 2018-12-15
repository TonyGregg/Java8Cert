package org.genil.learning.java8.passRefernce;

/**
 * Created by genil on 12/6/18 at 19 11
 **/
public class Network {
    Network p;

    Network(Network network) {
        p = network;
    }

    public static void main(String[] args) {
        Network network = new Network(null);
        network.p.p.p.p.p.go();
    }
    void go() {
        System.out.println("at go");
    }
}
