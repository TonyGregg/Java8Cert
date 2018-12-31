package org.genil.learning.java8.chap6;


import org.genil.learning.java8.chap6.pkg1.Other;

/**
 * Created by Antony Genil Gregory on 12/28/2018 8:37 PM
 * For project : Java8Cert
 **/
public class StringDemo2 {

    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd' };

        String newStr = null;
        for(char ch : myCharArr){
            newStr = newStr + ch;
        }

        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));

        String string3 = myCharArr.toString();

        System.out.println((string3 == myStr)+ " " + (string3.equals(myStr)));

        String string4 = new String("good");

        System.out.println((string4 == myStr)+ " " + (string4.equals(myStr)));

        String hello = "Hello";
        String lo = "lo";

        System.out.println(hello == Other.hello); // true
        System.out.println((hello == "Hel" +lo)); // false
        System.out.println(hello == "Hel" +"lo"); // true
        System.out.println(hello == ("Hel" +lo).intern()); // true





    }
}
