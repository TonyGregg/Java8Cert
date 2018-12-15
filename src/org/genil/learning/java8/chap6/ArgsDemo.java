package org.genil.learning.java8.chap6;

/**
 * Created by genil on 12/15/18 at 08 03
 **/
public class ArgsDemo {

    public static void main(String[] args) {
        System.out.println(args.length); // 1 2 3 4 5; length 5


        char[] chars = {0x4E,'\u004e', 78};

        System.out.println("0 == 1 :" + (chars[0]==chars[1]));
    }
}
