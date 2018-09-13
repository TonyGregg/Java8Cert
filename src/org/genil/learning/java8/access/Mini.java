package org.genil.learning.java8.access;
import static java.lang.System.out;

/**
 * Created by genil on 9/5/18 at 08 25
 **/
public class Mini extends Car {
    int n= 3;
    @Override
    public void goUpHill() {
        System.out.println("Going uphill");
    }

    public void setN(int n) {
        System.out.println("This.n "+this.n+ " local n "+n);

        n = n; // local variable assignment
        System.out.println("This.n "+this.n+ " local n "+n);
    }

    public static void main(String[] args) {
        Mini mini = new Mini();
        final int n;
        n = 20-3;
//        n = 3;

        if(n==3) {
            out.println("n is 3");
        }else {
            out.println("n is something else");
        }

        mini.goUpHill();
        mini.doCarThings();
        mini.getType();
        mini.setN(30);

    }
}
