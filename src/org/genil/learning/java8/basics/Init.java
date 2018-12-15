package org.genil.learning.java8.basics;

/**
 * Created by genil on 10/18/18 at 17 30
 **/
public class Init {
    Init() {
        System.out.println("No arg const");
    }
    Init(int x) {
        System.out.println("1-arg const");
    }
    static {
        System.out.println("1st static init");
    }
    {
        System.out.println("1st instance init");
    }
    {
        System.out.println("2nd instance init");
    }

    static {
        System.out.println("2nd static init");
    }

    public static void main(String[] args) {
        Init init = new Init();
        Init init2 = new Init();

    }
}
