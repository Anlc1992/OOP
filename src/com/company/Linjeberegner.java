package com.company;

import java.util.Scanner;

public class Linjeberegner {
    public static void linjeberegner(Scanner scanner){
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double a = (y2-y1)/(x2-x1);
        double b = y1-a*x1;

        System.out.println("y = " + a + "x + " + b);
    }
}
