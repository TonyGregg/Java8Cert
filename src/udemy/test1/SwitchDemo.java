package udemy.test1;

/**
 * Created by Antony Genil Gregory on 12/23/2018 12:57 PM
 * For project : Java8Cert
 **/
public class SwitchDemo {
    private int x;

    public static void main(String[] args) {

         Integer var = 7;
         final int x = 7;
        switch (var) {
            case x:
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }

        int i = '5';

        System.out.println("i "+i);

        m(i);
        m('5');
        add(10.0, 20.0);

    }

    private static void m(int x) {
        System.out.println("int version");
    }

    private static void m(char x) {
        System.out.println("char version");
    }
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));

        Boolean b1 = new Boolean("tRuE");
        Boolean b2 = new Boolean("fAlSe");
        Boolean b3 = new Boolean("abc");
        Boolean b4 = null;
        System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }
}
