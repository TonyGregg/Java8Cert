package org.genil.learning.java8.chap6;

/**
 * Created by genil on 12/13/18 at 19 34
 **/
public class StringDemo {

    public static void main(String[] args) {
        //charat
        String name = "Antony";
        name = name.replace('n','x');

        System.out.println(name);

        StringBuilder stringBuilder = new StringBuilder("0123");
        stringBuilder.append("456");

        stringBuilder.delete(0,2);

        System.out.println(stringBuilder); //o.p 23456

        stringBuilder.insert(0,"01");

        System.out.println(stringBuilder);

        StringBuilder stringBuilder1 = new StringBuilder("abc");
        StringBuilder stringBuilder2 = stringBuilder1;

        stringBuilder1.append("d");


        System.out.println("sb1 "+stringBuilder1
                + " sb2 "+stringBuilder2
                + " sb1 == sb2 ? "+ (stringBuilder1 == stringBuilder2)); // true

        StringBuilder sb1 = new StringBuilder("sb1");
        StringBuilder sb2 = sb1.append("x");
        System.out.println("sb1. equals sb2 "+sb1.equals(sb2)); // true

        sb2.append("some more");


        System.out.println("sb1 : "+sb1 +"\nsb2 : "+sb2 + " \nare they equal??? "+ (sb1.equals(sb2)));

        StringBuilder sb3 = new StringBuilder("sb1xsome more");

        if(sb1.equals(sb3)) {
            System.out.println("sb1 and sb3 are suprisingly requa.s. .. no way this can happen");
        } else {
            System.out.println(" As predcted they are not equals");
        }

        String  javaRo = "JAVArocks";
        int x  = 10;
        String sew = x + "sds";

        javaRo = javaRo.substring(4,8);
        System.out.println("javaRa "+javaRo);
        javaRo.toUpperCase();


    }
}
