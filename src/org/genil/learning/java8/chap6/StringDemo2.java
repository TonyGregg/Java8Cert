package org.genil.learning.java8.chap6;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.genil.learning.java8.chap6.pkg1.Other;

/**
 * Created by Antony Genil Gregory on 12/28/2018 8:37 PM
 * For project : Java8Cert
 **/
public class StringDemo2 {

    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd' };

        String charStr = new String(myCharArr);

        System.out.println("is charString and mystring equals ?? "+myStr.equals(charStr));

        String newStr = "";
        for(char ch : myCharArr){
            newStr = newStr + ch;
        }

        System.out.println("Are strings same from char ? " +
                ""+(newStr == myStr)+ " " + (newStr.equals(myStr))); // false true

        String string3 = myCharArr.toString();

        System.out.println("string 3: "+ string3 +" , mystr: "+ myStr+". comparision : === ?? " +(string3 == myStr)+ ", equals : " + (string3.equals(myStr)));

        String string4 = new String("good");

        System.out.println((string4 == myStr)+ " " + (string4.equals(myStr)));

        String hello = "Hello";
        String lo = "lo";


        System.out.println(" is lo variable and lo === ? "+ (lo == "lo"));

        System.out.println(hello == Other.hello); // true
        System.out.println((hello == "Hel" +lo)); // false
        System.out.println(hello == "Hel" +"lo"); // true
        System.out.println(hello == ("Hel" +lo).intern()); // true


        boolean result = "String".replace('g','G') == new String("String").replace('g','G');


        System.out.println("Result "+result);

        result = "String".replace('g','G') == "StrinG";


        System.out.println("Res "+result);

        StringBuilder stringBuilder = new StringBuilder();

        string3.trim();

        stringBuilder.replace(0,2,"");

//        stringBuilder.append("some ",0,23);

        StringBuilder stringBuilder1 = new StringBuilder(100);
        stringBuilder1.ensureCapacity(300);






    }
}
