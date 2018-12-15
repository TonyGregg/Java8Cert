package org.genil.learning.java8.access;

/**
 * Created by Antony Genil Gregory on 11/8/2018 9:27 PM
 * For project : Java8Cert
 **/
public class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        Thread thread = new Thread(my);
        thread.start();
    }

    public void run() {
        for (int i=0;i<3;i++) {
            System.out.println(i+ " ...");
        }
    }
}
