package com.company;

import java.util.Scanner;

public class DistanceFromLineToPoint {
    public static void distanceFromLineToPoint(Scanner scanner){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x0 = scanner.nextInt();
        int y0 = scanner.nextInt();
        double top = Math.abs(a*x0+b-y0);
        double bottom = Math.sqrt((a*a)+1);

        System.out.println(top/bottom);
    }
}
