package org.genil.learning.java8.defaultstatic;

/**
 * Created by anton on 6/9/2018 3:54 PM
 **/
public class MyDataImpl implements  MyData{

    public boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null ? true : false;
    }
    public void staticMethod() {
        System.out.println("not overriding...but redefining..");
    }
    private final void sm2() { // private final is redundant, but allowed
        System.out.println("some method.");
    }

    public static void main(String args[]){
        MyData obj = new MyDataImpl();
        obj.print("");
        obj.isNull("abc");

        MyData.staticMethod(); // this is the only way static interface can be accessed
        obj.print("some "); // inherited from interface default method.. this is the only way it can be accessed



    }
}
