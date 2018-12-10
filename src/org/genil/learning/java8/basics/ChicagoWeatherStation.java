package org.genil.learning.java8.basics;

/**
 * Created by genil on 10/22/18 at 08 32
 **/
public class ChicagoWeatherStation implements TempConvertible {
    public static void main(String[] args) {
        ChicagoWeatherStation weatherStation = new ChicagoWeatherStation();
        int f = -32;
        int c= 1;

        System.out.println("F to C : "+TempConvertible.getFtoC(f));
    }

    @Override
    public int m3() {
        Coffee coffee  = new Coffee();
        ChicagoWeatherStation chicagoWeatherStation = new ChicagoWeatherStation();

//        coffee = (Coffee)chicagoWeatherStation; //incompatible

        return 0;


    }
}
