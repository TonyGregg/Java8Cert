package org.genil.learning.java8.loopconstraint;

/**
 * Created by genil on 12/12/18 at 16 40
 **/
public class ForDemo {
    public static void main(String[] args) {

//            breakLabelDemo();
//        continueLabelDemo();

        demoAge();

    }

    static void breakLabelDemo() {



        boolean res = true;
        forLabel:
        for (int i=0;i<10;i++) {
            while (res) {
                System.out.println("hello");
                break forLabel;
            }
            System.out.println("outer loop");
        }
        System.out.println("Good bye");
    }
    static void continueLabelDemo() {



        boolean res = true;
        forLabel:
        for (int i=0;i<10;i++) {
            while (res) {
                System.out.println("hello");
                continue forLabel;
            }
            System.out.println("outer loop");
            continue;
        }
        System.out.println("Good bye");
    }

    private static void demoAge() {

        int age= 1;
        outer:
        while(age<=21) {
            if(age == 16) {
                System.out.println("Get driving license");
                break outer; // continue will spin for ever
            }
            System.out.println("An other year");
            age ++;
        }

        System.out.println("program over");

    }
}
