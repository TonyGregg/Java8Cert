package org.genil.learning.java8.defaultstatic;

/**
 * Created by anton on 6/9/2018 3:54 PM
 **/
public class MyDataImpl implements  MyData{

    public boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null ? true : false;
    }

    public static void main(String args[]){
        MyData obj = new MyDataImpl();
//        obj.print("");
        obj.isNull("abc");
    }
}
