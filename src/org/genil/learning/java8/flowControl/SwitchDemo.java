package org.genil.learning.java8.flowControl;

/**
 * Created by genil on 12/10/18 at 08 41
 **/
public class SwitchDemo {
    static int z = 20;
    static {
        z--;
    }
    public static void main(String args[]) {
        boolean bool = false;
        doMultipleSwithDemo();

//        switch (bool) { // not allowed
//
//        }

        final byte b1 = 3;
        final  byte b2 = 40;

        byte b3=-128;

//        byte b4 = b3 + 4; // won't compile b3 + b2 also wont' compile

        switch (b2) {
            case b1:
                System.out.println("case b1... ");
                break;
            case b2*b1:
                System.out.println("case b2 * b1");
                break;
//            case b3:  // constant required; won't compile
//            case b3-b2 : constant required. won't compile


        }

        char ch = 'a';
        switch (ch) {

            case 'b' :
                System.out.println("char is b");
                break;
            default:
                System.out.println("Default character ");
                break;
            case 'a':
                System.out.println("typed char is a");

        }

        for (int y = 0;y<3;y++) {
            z++;
            switch (z) {
                case 2:


            }
        }



    }

    static void doSwitchDemo(int x) {

        switch (x) {
            case 1:
                System.out.println("1 passed");
                break;
//            case x+20: // will fail
//                System.out.println("x+20");
//                break;
        }
    }

    static void doMultipleSwithDemo() {
        String  s = "bob";
        String[] sa = {"a","bob"};
        final String s2 = "bob";
        StringBuilder stringBuilder = new StringBuilder("bob");

        int x = 0;
        System.out.println(7/x);



    }
}
