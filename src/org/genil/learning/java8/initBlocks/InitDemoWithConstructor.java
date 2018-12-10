package org.genil.learning.java8.initBlocks;

/**
 * Created by genil on 12/2/18 at 14 27
 **/
public class InitDemoWithConstructor extends Super2{
    static int staticX;
    int x;
    InitDemoWithConstructor() {
        System.out.println("Inside constructor");
        staticX = 100;
        x = 3;
    }
    {
        System.out.println("Init block 1");
        staticX = 1;
        x = 1;
    }

    {
        System.out.println("Init block 2");
        staticX = 2;
        x = 2;
    }

    static {
        System.out.println("Static init block # 1");
        staticX = 10;

    }

    public static void main(String[] args) {
        System.out.println(" #### 1");
        InitDemoWithConstructor demoWithConstructor = new InitDemoWithConstructor();
        System.out.println(demoWithConstructor.x + " static x" +staticX);
    }
}
