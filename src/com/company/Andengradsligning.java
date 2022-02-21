package com.company;

import java.util.Scanner;

public class Andengradsligning {
    public static void roots(Scanner scanner){
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double D = b*b - 4*a*c;

        if(D < 0 || (a == 0 && b == 0)){
            System.out.println("Ingen rødder");
        } else if (D == 0){
            System.out.println(((-1)*b)/(2*a));
        } else{
            if (a != 0) {
                System.out.print(((-1) * b + Math.sqrt(D)) / (2 * a) + " ");
                System.out.println(((-1) * b - Math.sqrt(D)) / (2 * a));
            } else {
                System.out.println((-1)*c/b);
            }
        }
    }
}
