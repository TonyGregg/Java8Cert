package org.genil.learning.java8;

/**
 * Created by anton on 7/9/2018 4:47 PM
 **/
public class StringReverser {
    public static void main(String[] args) {
        String testStr = "A B C D";
        char[] strArr = testStr.toCharArray();

        for(int i= strArr.length-1;i>=0; i--) {
            System.out.print(strArr[i]);
        }
    }
}
