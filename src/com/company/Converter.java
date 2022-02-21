package com.company;

public class Converter {
    private static final double milesToKilometerFactor = 1.609;

    public static double milesToKilometers(double miles){
        return milesToKilometerFactor*miles;
    }

    public static double kilometersToMiles(double kilometer){
        return kilometer/milesToKilometerFactor;
    }
}
