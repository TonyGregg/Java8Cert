package org.genil.learning.java8.flowControl;

/**
 * Created by genil on 12/13/18 at 17 14
 **/
public class ArgDemo {
    public static void main(String[] args) {
        String o = "-";

        String[] sa = new String[4];

        for (int i=0;i<args.length;i++) {
            sa[i] = args[i];
        }

        System.out.println("Arg lenth "+args.length + "arg[0] : "+args[0]);

        String name;
        for (String s: sa) {
            switch (s.toLowerCase()) {
                case "yellow":
                    o += "y";
                case "red" :
                    o += "R";

                case "green" :
                    o += "g";

            }

            System.out.println(o);

        }


    }
}
