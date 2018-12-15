package org.genil.learning.java8.access.mouse;

import java.util.List;

/**
 * Created by Antony Genil Gregory on 11/8/2018 9:05 PM
 * For project : Java8Cert
 **/
public class TestOverrride {

    int x =50;
    int y =100;

    public static void main(String[] args) {


        String  str ="";
        Boolean b1 = true;
        Boolean b2 = false;

        if((b2=false) | (21%5)>2) str += "x";
        if(b1 || (b2 = true )) str += "y";
        if(b2 == true) str += "z";

        System.out.println(str);
    }

    public static void prin(List< ? extends Number> list) {
        for (Number n: list) {
            System.out.println(n + " ");
        }
    }






}
