package org.genil.learning.java8.chap6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Created by Antony Genil Gregory on 12/25/2018 5:58 AM
 * For project : Java8Cert
 **/
public class PeriodDemo {
    private int y;
    Integer someInte;
    static Boolean[] booleans = new Boolean[1];
    boolean[] smallBooleans = new boolean[3];
    public static void main(String[] args) {

        PeriodDemo periodDemo = new PeriodDemo();
        periodDemo.y =230;
        String string;

        Period period = Period.parse("P2Y");



        period = Period.parse("p-30000y");

        System.out.println(period);


        LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
        System.out.println(date.plus(period));

        System.out.println("is date modified ?? "+date); // No... not modified

        Boolean[] bigBoolean = new Boolean[2];
        boolean[] smallBooleans = new boolean[2]; // only small booleans gets initialized to false

        System.out.println("Integer object : "+periodDemo.someInte + ", Static boolean:  "+ booleans[0]
                + ", local big  boolean : "+bigBoolean[0] + ", small boolean : "+smallBooleans[0]
                + ", obj small boolean : "+periodDemo.smallBooleans[0]);


        date = LocalDate.parse("2018-06-06");
        date.minusDays(10);
        System.out.println("LocalDate should be unmodifie.d. . "+date);

        date = LocalDate.parse("2000-06-25");
        while(date.getDayOfMonth() >= 20) {
            System.out.println(date);
            date.plusDays(-1);
        }
    }


}
